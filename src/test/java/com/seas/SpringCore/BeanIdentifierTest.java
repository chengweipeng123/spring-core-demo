package com.seas.SpringCore;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.seas.SpringCore.beans.User;

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
public class BeanIdentifierTest {
	private static ApplicationContext context;
	private static ObjectMapper mapper = new ObjectMapper();
	
	@BeforeClass
	public static void setUp(){
		context = new ClassPathXmlApplicationContext("spring-beans.xml");
	}
	
	@AfterClass
	public static void tearDown(){
		
	}
	
	//测试id
	@Test
	public void testBeanById(){
		User user = context.getBean("idA", User.class);
		output(user);
	}
	
	//测试name
	@Test
	public void testBeanByName(){
		User userA = context.getBean("nameA", User.class);
		output(userA);
		
		User userB = context.getBean("nameB", User.class);
		output(userB);
		
		Assert.assertEquals(userA, userB);
	}
	
	//测试alias
	@Test 
	public void testBeanByAlias(){
		User userA = context.getBean("nameA", User.class);
		output(userA);
		
		User userB = context.getBean("aliasA", User.class);
		output(userB);
		
		Assert.assertEquals(userA, userB);
	}
	
	/**
     * 以 Json 的格式输出对象
     * @param obj
     */
    private void output(Object obj) {
        try {
            System.out.println(mapper.writeValueAsString(obj));
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }

}
