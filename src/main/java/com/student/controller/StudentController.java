package com.student.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.dao.StudentDao;
import com.student.entity.Student;

@Controller
public class StudentController {

	@Autowired
	private StudentDao studentDao;

	@GetMapping("/addStudent")
	public String showaddStudent() {
		return "addStudent";

	}

	//comment added 
	
	
	@PostMapping("/addStudent")
	public String addStudent(HttpServletRequest req) {
		String name = req.getParameter("name");
		String major = req.getParameter("major");
		String level = req.getParameter("level");

		Student student = new Student();
		student.setId(1);
		student.setName(name);
		student.setMajor(major);
		student.setLevel(level);
		studentDao.save(student);

		req.setAttribute("message", "Student has been added!!!");
		return "addStudent";

	}
	
	@GetMapping("/delete")
	public String deleteStudent(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		studentDao.delete(id);
		
		List<Student> list = studentDao.findAll();
		req.setAttribute("list",list);
		req.setAttribute("message", "Student has been deleted!!!");
		return "validate";
	}
	
	@PostMapping("/edit")
	public String editStudent(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		String name = req.getParameter("name");
		String major = req.getParameter("major");
		String level = req.getParameter("level");
		studentDao.edit(id, name, major, level);
		
		List<Student> list = studentDao.findAll();
		req.setAttribute("list",list);
		req.setAttribute("message", "Student has been updated!!!");
		return "validate";
	}
	
	@GetMapping("/edit")
	public String showEditpage(HttpServletRequest req) {
		int id = Integer.parseInt(req.getParameter("id"));
		Student result = studentDao.findByid(id);
		req.setAttribute("student", result);
		return "edit";
	}

}
