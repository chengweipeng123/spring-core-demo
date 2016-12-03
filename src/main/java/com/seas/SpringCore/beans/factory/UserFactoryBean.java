package com.seas.SpringCore.beans.factory;

import org.springframework.beans.factory.FactoryBean;

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
public class UserFactoryBean implements FactoryBean<User> {
	private String userName;
	private String password;

	/**
	 * TODO: 填入方法概要说明.
	 * <pre>
	 * 	TODO: 填入方法详细说明
	 * </pre>
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#getObject()
	 */
	public User getObject() throws Exception {
		System.out.println("UserFactoryBean创建User对象");
		User user = new User();
		user.setUserName(userName.toUpperCase());
		user.setPassword(password);
		// TODO Auto-generated method stub
		return user;
	}


	/**
	 * TODO: 填入方法概要说明.
	 * <pre>
	 * 	TODO: 填入方法详细说明
	 * </pre>
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#getObjectType()
	 */
	public Class<User> getObjectType() {
		// TODO Auto-generated method stub
		return User.class;
	}

	/**
	 * TODO: 填入方法概要说明.
	 * <pre>
	 * 	TODO: 填入方法详细说明
	 * </pre>
	 * 
	 * @see org.springframework.beans.factory.FactoryBean#isSingleton()
	 */
	public boolean isSingleton() {
		return true;
	}

	/**
	 * @param userName 要设置的 {@link #userName}。
	 */
	public void setUserName(String userName) {
		System.out.println("UserFactoryBean设置userName");
		this.userName = userName;
	}

	/**
	 * @param password 要设置的 {@link #password}。
	 */
	public void setPassword(String password) {
		System.out.println("UserFactoryBean设置password");
		this.password = password;
	}

}
