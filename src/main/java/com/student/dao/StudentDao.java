package com.student.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.student.entity.Student;

@Repository
public class StudentDao {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	public void save(Student student) {
		String sql="insert into student_tbl(name, major,level) values(?,?,?)";
		jdbcTemplate.update(sql, student.getName(),student.getMajor(),student.getLevel());
		
	}
	
	public List<Student> findAll(){
		String sql="select * from student_tbl";
		List<Student> result = jdbcTemplate.query(sql,new BeanPropertyRowMapper(Student.class));
		return result;
	}
	
	public void delete(int id) {
		String sql="delete from student_tbl where id=?";
		jdbcTemplate.update(sql,id);
	}
	
	
	public void edit(int id,String name,String major,String level) {
		String sql="update student_tbl set name=?, major=?,level=? where id=?";
		jdbcTemplate.update(sql,name,major,level,id);
	}
	
	public Student findByid(int id) {
		String sql="select * from student_tbl where id=?";
		List<Student> list = jdbcTemplate.query(sql,new Object[] {id},new BeanPropertyRowMapper(Student.class));
		return list.get(0);
	}
	
	
	

}
