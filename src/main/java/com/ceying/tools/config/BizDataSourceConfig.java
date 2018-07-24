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
@MapperScan(basePackages = BizDataSourceConfig.PACKAGE, sqlSessionFactoryRef = "bizSqlSessionFactory")
public class BizDataSourceConfig {

    // 精确到 master 目录，以便跟其他数据源隔离
    static final String PACKAGE = "com.ceying.tools.dao.scyp.biz";
    static final String MAPPER_LOCATION = "classpath:mapper/scyp/biz/*.xml";

    @Value("${spring.datasource.biz.url}")
    private String url;

    @Value("${spring.datasource.biz.username}")
    private String user;

    @Value("${spring.datasource.biz.password}")
    private String password;

    @Value("${spring.datasource.biz.driverClassName}")
    private String driverClass;

    @Bean(name = "bizDataSource")
    public DataSource bizDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClass);
        dataSource.setUrl(url);
        dataSource.setUsername(user);
        dataSource.setPassword(password);
        return dataSource;
    }

    @Bean(name = "bizTransactionManager")
    public DataSourceTransactionManager bizTransactionManager() {
        return new DataSourceTransactionManager(bizDataSource());
    }

    @Bean(name = "bizSqlSessionFactory")
    public SqlSessionFactory bizSqlSessionFactory(@Qualifier("bizDataSource") DataSource bizDataSource)
            throws Exception {
        final SqlSessionFactoryBean sessionFactory = new SqlSessionFactoryBean();
        sessionFactory.setDataSource(bizDataSource);
        sessionFactory.setMapperLocations(new PathMatchingResourcePatternResolver()
                .getResources(BizDataSourceConfig.MAPPER_LOCATION));
        return sessionFactory.getObject();
    }
}