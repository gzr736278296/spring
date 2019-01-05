package com.study.bean;

public class User {
	private String name;
	public User() {
		System.out.println("调用构造方法");
	}

	public User(String name) {
		super();
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + "]";
	}
	
	
}
