package com.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.student.entity.Login;

//@Service("studentDao")
@Repository
public class LoginDao {
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	
	
	public boolean authorization(String username, String password) {
		String sql="select * from login_tbl where username=?and password=?";
		List<Login> result = jdbcTemplate.query(sql,new Object[] {username,password}, new BeanPropertyRowMapper(Login.class));
		return result.size()>0;
		
	}
	
	public void save(String username, String password) {
		String sql="insert into login_tbl(username,password) values(?,?)";
		jdbcTemplate.update(sql,username,password);
		
	}
	
	public boolean checkUsername(String username) {
		String sql="select * from login_tbl where username=?";
		List result = jdbcTemplate.query(sql,new Object[] {username},new BeanPropertyRowMapper(Login.class));
		return result.size()==0;
	}
	

}
