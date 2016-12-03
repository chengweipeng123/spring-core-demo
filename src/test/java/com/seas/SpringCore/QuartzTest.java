package com.seas.SpringCore;

import org.junit.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

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
public class QuartzTest {
	@Test
	public void testQuartz(){
		new ClassPathXmlApplicationContext("spring-beans-quartz.xml");
	}
}
