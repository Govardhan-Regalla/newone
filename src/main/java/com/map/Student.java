package com.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Student {
	private int id;
	private String name;
	private Map<String,String> tech;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
		}
	public Student(int id, String name, Map<String, String> tech) {
		super();
		this.id = id;
		this.name = name;
		this.tech = tech;
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
	public Map<String, String> getTech() {
		return tech;
	}
	public void setTech(Map<String, String> tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", tech=" + tech + "]";
	}
	void show() {
		System.out.println("student id is: "+id);
		System.out.println("student name is: "+name);
		Set<java.util.Map.Entry<String,String>> s = tech.entrySet();
		Iterator<java.util.Map.Entry<String,String>> i=s.iterator();
		while(i.hasNext()) {
			java.util.Map.Entry<String,String> e = i.next();
			System.out.println("tech name: "+e.getKey()+"  "+ "duration is : "+e.getValue());
		}
	}

}
