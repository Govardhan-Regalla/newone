package com.hexaware;

import java.util.*;

public class Student {
	private String name;
	private List<String> phones;
	private Set<String> ranks;
	private Map<String,String> courses;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getPhones() {
		return phones;
	}
	public void setPhones(List<String> phones) {
		this.phones = phones;
	}
	public Set<String> getRanks() {
		return ranks;
	}
	public void setRanks(Set<String> ranks) {
		this.ranks = ranks;
	}
	public Map<String, String> getCourses() {
		return courses;
	}
	public void setCourses(Map<String, String> courses) {
		this.courses = courses;
	}
	public Student(String name, List<String> phones, Set<String> ranks, Map<String, String> courses) {
		super();
		this.name = name;
		this.phones = phones;
		this.ranks = ranks;
		this.courses = courses;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", phones=" + phones + ", ranks=" + ranks + ", courses=" + courses + "]";
	}
	
	
	

}
