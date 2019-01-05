package com.study.injection;

public class User {
	private String name;
	private Car car;
	public User() {
		System.out.println("调用无参构造方法");
	}

	public User(String name) {
		super();
		System.out.println("调用有参构造方法");
		this.name = name;
	}

	public Car getCar() {
		return car;
	}

	public void setCar(Car car) {
		this.car = car;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String toString() {
		return "User [name=" + name + ", car=" + car + "]";
	}
}
