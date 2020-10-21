package com.linkedbear.spring.configuration.d_enablejdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.linkedbear.spring.configuration.d_enablejdbc.ConditionalOnClassName;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
public class H2Configuration {

    @Bean
    @ConditionalOnClassName("org.h2.Driver")
    public DataSource h2DataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("org.h2.Driver");
        dataSource.setUrl("jdbc:h2:mem:test_mem");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    @Bean
    public QueryRunner queryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }
}