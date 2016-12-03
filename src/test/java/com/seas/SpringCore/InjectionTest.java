package com.seas.SpringCore;

import org.junit.BeforeClass;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.seas.SpringCore.annotationBeans.House;
import com.seas.SpringCore.beans.Address;
import com.seas.SpringCore.beans.CollectionHolder;
import com.seas.SpringCore.beans.Customer;
import com.seas.SpringCore.beans.User;
import com.seas.SpringCore.util.CommonUtils;

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
public class InjectionTest {
	private static ApplicationContext context;
	
	@BeforeClass
	public static void setUp(){
		context = new ClassPathXmlApplicationContext("spring-beans.xml");
	}
	
	@Test
	public void test(){
		User user = context.getBean("ann-user", User.class);
		CommonUtils.output(user);
	}
	
	@Test
	public void testConstructor(){
		Customer customer = context.getBean("customer", Customer.class);
		CommonUtils.output(customer);
	}
	
	@Test
	public void testCollection(){
		CollectionHolder collectionHolder = context.getBean("collectionHolder", CollectionHolder.class);
		CommonUtils.output(collectionHolder);
	}

	
	@Test
	public void testUserFactoryBean(){
		User user = context.getBean("userFactory", User.class);
		System.out.println("===testUserFactoryBean===");
		CommonUtils.output(user);
		System.out.println("==========================");
	}
	
	@Test
	public void testPropertyAddress(){
		System.out.println("test property holder");
		Address address = context.getBean("propertyAddress", Address.class);
		CommonUtils.output(address);
	}
	
	@Test
	public void testAnnotationHouse(){
		System.out.println("test bean annotation");
		House house = context.getBean("house", House.class);
		house.setDes("测试annotation bean");
		House house2 = context.getBean(House.class);
		house2.setDes("测试annotation bean");
		CommonUtils.output(house);
		CommonUtils.output(house2);
	}
}
