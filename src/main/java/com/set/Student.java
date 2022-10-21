package com.set;

import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Set<String> courses;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, Set<String> courses) {
		super();
		this.id = id;
		this.name = name;
		this.courses = courses;
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
	public Set<String> getCourses() {
		return courses;
	}
	public void setCourses(Set<String> courses) {
		this.courses = courses;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", courses=" + courses + "]";
	}
	

}
