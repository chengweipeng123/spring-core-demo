package com.seas.SpringCore;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seas.SpringCore.dao.UserDao;

/**
 * TODO: 填写Class说明.
 * 
 * <pre>
 * 	TODO: 填写Class详细说明
 * </pre>
 * 
 * @author 杨雷
 * @since TODO: 来源版本
 *
 */
public class HelloWorld {
	@Test
	public void test(){
		ApplicationContext context = new ClassPathXmlApplicationContext("spring-beans.xml");
		UserDao userDao = context.getBean("userDao", UserDao.class);
		userDao.deleteUser(0);
	}
}
