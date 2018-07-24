package com.ceying.tools.config;

import com.alibaba.druid.pool.DruidDataSource;
import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import tk.mybatis.spring.annotation.MapperScan;

import javax.sql.DataSource;

@Configuration
// 扫描 Mapper 接口并容器管理
@MapperScan(basePackages = AdditionDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "additionSqlSessionFactory")
public class AdditionDataSourceConfig {

    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.ceying.tools.dao.scyp.addition";
    static final String MAPPER_LOCATION = "classpath:mapper/scyp/addition/*.xml";

    @Value("${spring.datasource.addition.url}")
    private String url;

    @Value("${spring.datasource.addition.username}")
    private String user;

    @Value("${spring.datasource.addition.password}")
    private String password;

    @Value("${spring.datasource.addition.driverClassName}")
    private String driverClass;

    @Bean(name = "additionDataSource")
    public DataSource additionDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "additionTransactionManager")
    public DataSourceTransactionManager additionTransactionManager() {
        return new DataSourceTransactionManager(additionDataSource());
    }

    @Bean(name = "additionSqlSessionFactory")
    public SqlSessionFactory additionSqlSessionFactory(@Qualifier("additionDataSource") DataSource additionDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(additionDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(AdditionDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}