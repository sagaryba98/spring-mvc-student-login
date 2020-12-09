package com.student.entity;

public class Student {
	private int id; 
	private String name;
	private String major;
	private String level;
	
	public Student() {
		
	}

	
	public Student(int id, String name, String major, String level) {
		this.id = id;
		this.name = name;
		this.major = major;
		this.level = level;
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getLevel() {
		return level;
	}
	public void setLevel(String level) {
		this.level = level;
	}
	
	
	 

}
