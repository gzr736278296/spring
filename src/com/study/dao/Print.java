package com.study.dao;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.bean.User;

public class Print {

	@Test
	public void fun() {
		ApplicationContext con = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User bean = (User) con.getBean("user");
		System.out.println(bean);
	}

	@Test
	public void fun2() {
		System.out.println("func2");
		ApplicationContext con = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User bean = (User) con.getBean("user2");
		System.out.println(bean);
	}
	@Test
	public void fun3() {
		System.out.println("func3");
		ApplicationContext con = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User bean = (User) con.getBean("user3");
		System.out.println(bean);
	}
	
	@Test
	public void fun4() {
		ApplicationContext con = new ClassPathXmlApplicationContext("ApplicationContext.xml");
		User bean = (User) con.getBean("user");
		User bean2 = (User) con.getBean("user");
		User bean3 = (User) con.getBean("user");
		System.out.println(bean2==bean3);
	}

}
