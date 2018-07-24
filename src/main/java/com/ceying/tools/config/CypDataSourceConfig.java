package com.ceying.tools.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages = CypDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "cypSqlSessionFactory")
public class CypDataSourceConfig {

    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.ceying.tools.dao.cyp";
    static final String MAPPER_LOCATION = "classpath:mapper/cyp/*.xml";

    @Value("${spring.datasource.cyp.url}")
    private String url;

    @Value("${spring.datasource.cyp.username}")
    private String user;

    @Value("${spring.datasource.cyp.password}")
    private String password;

    @Value("${spring.datasource.cyp.driverClassName}")
    private String driverClass;

    @Bean(name = "cypDataSource")
    @Primary
    public DataSource cypDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "cypTransactionManager")
    @Primary
    public DataSourceTransactionManager cypTransactionManager() {
        return new DataSourceTransactionManager(cypDataSource());
    }

    @Bean(name = "cypSqlSessionFactory")
    @Primary
    public SqlSessionFactory cypSqlSessionFactory(@Qualifier("cypDataSource") DataSource cypDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(cypDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(CypDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}