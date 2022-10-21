package com.hexawaree;

public class Student {
	private String name;
	private int id;
	public Student(String name, int id) {
		super();
		this.name = name;
		this.id = id;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	@Override
	public String toString() {
		return "name=" + name + ", id=" + id ;
	}
	
	

}
