package com.linkedbear.spring.configuration.d_enablejdbc.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.linkedbear.spring.configuration.d_enablejdbc.ConditionalOnClassName;
import org.apache.commons.dbutils.QueryRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;

import javax.sql.DataSource;

@Configuration
public class JdbcConfiguration {

    Environment environment;

    @Bean
    @ConditionalOnClassName("com.mysql.jdbc.Driver")
    public DataSource mysqlDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl("jdbc:mysql://172.17.0.2:3306/test?characterEncoding=utf8");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    @Bean
    @ConditionalOnClassName("oracle.jdbc.driver.OracleDriver")
    public DataSource oracleDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("oracle.jdbc.driver.OracleDriver");
        dataSource.setUrl("jdbc:oracle:thin:@localhost:1521:orcl");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    @Bean
    @ConditionalOnClassName("com.microsoft.jdbc.sqlserver.SQLServerDriver")
    public DataSource microsoftDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.microsoft.jdbc.sqlserver.SQLServerDriver");
        dataSource.setUrl("jdbc:microsoft:sqlserver://localhost:1433;DatabaseName=mydb");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    @Bean
    @ConditionalOnClassName("com.sybase.jdbc.SybDriver")
    public DataSource sybaseDataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.sybase.jdbc.SybDriver");
        dataSource.setUrl("jdbc:sybase:Tds:localhost:5007/myDB");
        dataSource.setUsername("root");
        dataSource.setPassword("123456");
        return dataSource;
    }

    @Bean
    @ConditionalOnClassName("com.mysql.jdbc.Driver")
    public DataSource dataSource() {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName("com.mysql.jdbc.Driver");
        dataSource.setUrl(environment.getProperty("jdbc.url"));
        dataSource.setUsername(environment.getProperty("jdbc.username"));
        dataSource.setPassword(environment.getProperty("jdbc.password"));
        return dataSource;
    }

    @Bean
    public QueryRunner queryRunner(DataSource dataSource) {
        return new QueryRunner(dataSource);
    }
}