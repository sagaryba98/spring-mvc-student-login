package com.student.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.student.dao.LoginDao;
import com.student.dao.StudentDao;
import com.student.entity.Student;

@Controller
public class Logincontroller {

	@Autowired
	private LoginDao loginDao;
	@Autowired
	private StudentDao studentDao;
	
	@GetMapping({ "/", "/home" })
	public String showLogIn() {
		return "home";
	}
	@GetMapping("/validated")
	public String showValidate(HttpServletRequest req) {
		List<Student> list = studentDao.findAll();
		req.setAttribute("list", list);
		return "validate";
	}

	@PostMapping("/validated")
	public String validate(HttpServletRequest req) {
		String username = req.getParameter("uname");
		String password = req.getParameter("psw");
		
		if(loginDao.authorization(username, password)) {
			List<Student> list = studentDao.findAll();
			req.setAttribute("list", list);
			return "validate";
		}
		else {
			req.setAttribute("message","Username and Password doesn't match");
			return "home";
		}
		
	}
	
	
	
	@GetMapping("/signup")
	public String showSignup() {
		return "signup";
	}
	@PostMapping("/signup")
	public String signup(HttpServletRequest req){
		String username = req.getParameter("uname");
		String password = req.getParameter("psw");
		//this is the test
		
		if(loginDao.checkUsername(username)) {
			loginDao.save(username, password);
			req.setAttribute("message", "Username and Password has been saved!!");
			return "signup";
		}
		else {
			req.setAttribute("message","Username and password already exist!!");
			return "home";
		}
		
		
		
		
	}
	
	
	

}
