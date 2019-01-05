package com.study.dao;

import com.study.bean.User;

public class UserFactory {
	public static User getUser() {
		System.out.println("静态工厂创建");
		return new User();
	}
	
	public  User getUser2() {
		System.out.println("普通工厂创建");
		return new User();
	}
}
