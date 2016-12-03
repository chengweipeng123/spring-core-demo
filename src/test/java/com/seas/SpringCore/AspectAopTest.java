package com.seas.SpringCore;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seas.SpringCore.Service.Service;

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
public class AspectAopTest {
private static ApplicationContext context;
	
	@BeforeClass
	public static void setUp(){
		context = new ClassPathXmlApplicationContext("spring-beans.xml");
	}
	
	@Test
	public void testJXmlAOP(){
		Service service = context.getBean("service", Service.class);
		service.foo();
		System.out.println(service.getClass());
	}
}
