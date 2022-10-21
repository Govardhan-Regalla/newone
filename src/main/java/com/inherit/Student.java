package com.inherit;

public class Student {
	private int id;
	private String name;
	Address ad;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(int id, String name, Address ad) {
		super();
		this.id = id;
		this.name = name;
		this.ad = ad;
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
	public Address getAd() {
		return ad;
	}
	public void setAd(Address ad) {
		this.ad = ad;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", ad=" + ad + "]";
	}
	public void show() {
		System.out.println("id"+id);
		
	}
	

}
