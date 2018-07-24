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
@MapperScan(basePackages = SystemDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "systemSqlSessionFactory")
public class SystemDataSourceConfig {

    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.ceying.tools.dao.scyp.system";
    static final String MAPPER_LOCATION = "classpath:mapper/scyp/system/*.xml";

    @Value("${spring.datasource.system.url}")
    private String url;

    @Value("${spring.datasource.system.username}")
    private String user;

    @Value("${spring.datasource.system.password}")
    private String password;

    @Value("${spring.datasource.system.driverClassName}")
    private String driverClass;

    @Bean(name = "systemDataSource")
    public DataSource systemDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "systemTransactionManager")
    public DataSourceTransactionManager systemTransactionManager() {
        return new DataSourceTransactionManager(systemDataSource());
    }

    @Bean(name = "systemSqlSessionFactory")
    public SqlSessionFactory systemSqlSessionFactory(@Qualifier("systemDataSource") DataSource systemDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(systemDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(SystemDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}