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
@MapperScan(basePackages = KeyDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "keySqlSessionFactory")
public class KeyDataSourceConfig {

    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.ceying.tools.dao.scyp.key";
    static final String MAPPER_LOCATION = "classpath:mapper/scyp/key/*.xml";

    @Value("${spring.datasource.key.url}")
    private String url;

    @Value("${spring.datasource.key.username}")
    private String user;

    @Value("${spring.datasource.key.password}")
    private String password;

    @Value("${spring.datasource.key.driverClassName}")
    private String driverClass;

    @Bean(name = "keyDataSource")
    public DataSource keyDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "keyTransactionManager")
    public DataSourceTransactionManager keyTransactionManager() {
        return new DataSourceTransactionManager(keyDataSource());
    }

    @Bean(name = "keySqlSessionFactory")
    public SqlSessionFactory keySqlSessionFactory(@Qualifier("keyDataSource") DataSource keyDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(keyDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(KeyDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}