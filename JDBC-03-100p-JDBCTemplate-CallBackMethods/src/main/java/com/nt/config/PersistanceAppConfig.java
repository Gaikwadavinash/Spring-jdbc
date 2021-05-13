package com.nt.config;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
@ComponentScan(basePackages = "com.nt.dao")
public class PersistanceAppConfig {

@Bean("hkds")
public DataSource createDataSource() {
HikariDataSource ds=  new HikariDataSource();
ds.setDriverClassName("oracle.jdbc.driver.OracleDriver");
ds.setJdbcUrl("jdbc:oracle:thin:@localhost:1521:xe");
ds.setUsername("scott");
ds.setPassword("tiger");
return ds;
}

@Bean("jTemplate")
public JdbcTemplate createdata() {
	return new JdbcTemplate(createDataSource());
}


}
