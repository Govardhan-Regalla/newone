package com.collection;

import java.util.Iterator;
import java.util.List;

public class Project {
	private int id;
	private String pname;
	private List<String> tech;
	public Project() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Project(int id, String pname, List<String> tech) {
		super();
		this.id = id;
		this.pname = pname;
		this.tech = tech;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public List<String> getTech() {
		return tech;
	}
	public void setTech(List<String> tech) {
		this.tech = tech;
	}
	@Override
	public String toString() {
		return "Project [id=" + id + ", pname=" + pname + ", tech=" + tech + "]";
	}
	public void show() {
		System.out.println("project id is: "+id);
		System.out.println("project name is: "+pname);
		System.out.println("technologies are:");
		Iterator<String> itr=tech.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
	}
	

}
