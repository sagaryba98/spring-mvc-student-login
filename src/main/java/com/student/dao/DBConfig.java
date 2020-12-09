package com.student.dao;

import javax.sql.DataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

import com.mysql.cj.jdbc.MysqlDataSource;

@Configuration
public class DBConfig {
	
	@Bean
	public JdbcTemplate createTemplate() {
		JdbcTemplate jdbcTemplate = new JdbcTemplate(this.dataSource());
		return jdbcTemplate;
	}
	
	@Bean
	public DataSource dataSource() {
		MysqlDataSource mq=new MysqlDataSource();
		mq.setUrl("jdbc:mysql://localhost:3306/demo?serverTimezone=UTC");
		mq.setUser("root");
		mq.setPassword("sagarlama");
		
		return mq;
	}

}
