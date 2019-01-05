package com.study.injection;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.study.bean.User;

/**
 * 使用后xml配置spring
 * @author gaozhr
 * @since 2019年1月3日
 */
public class Print {

	@Test
	public void fun() {
		ApplicationContext con = new ClassPathXmlApplicationContext("com/study/injection/ApplicationContext.xml");
		User bean = (User) con.getBean("user");
		System.out.println(bean);
		System.out.println("dsdsd");
	}

}
