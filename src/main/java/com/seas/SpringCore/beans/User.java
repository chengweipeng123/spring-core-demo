package com.seas.SpringCore.beans;

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
public class User {
	private int id;
	private String userName;
	private String password;
	private Address address;
	
	public User () {
		
	}
	
	public User (int id, String userName) {
		this.id = id;
		this.userName = userName;
	}
	/**
	 * @return 返回  {@link #id}。
	 */
	public int getId() {
		return id;
	}
	/**
	 * @param id 要设置的 {@link #id}。
	 */
	public void setId(int id) {
		this.id = id;
	}
	/**
	 * @return 返回  {@link #userName}。
	 */
	public String getUserName() {
		return userName;
	}
	/**
	 * @param userName 要设置的 {@link #userName}。
	 */
	public void setUserName(String userName) {
		System.out.println("调用setUserName");
		this.userName = userName;
	}

	/**
	 * @return 返回  {@link #password}。
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * @param password 要设置的 {@link #password}。
	 */
	public void setPassword(String password) {
		this.password = password;
	}

	/**
	 * @return 返回  {@link #address}。
	 */
	public Address getAddress() {
		return address;
	}

	/**
	 * @param address 要设置的 {@link #address}。
	 */
	public void setAddress(Address address) {
		System.out.println("调用setAddress");
		this.address = address;
	}

}
