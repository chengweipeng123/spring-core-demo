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
public class Customer {
	private int id;
	private String name;
	private int age;
	private String phone;
	
	
	public Customer(){
	}
	
	public Customer(String name, int age, String phone) {
		this.name = name;
		this.age = age;
		this.phone = phone;
	}
	
	public Customer(String name, String phone, int age) {
		this.name = name;
		this.age = age;
		this.phone = phone;
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
	 * @return 返回  {@link #name}。
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name 要设置的 {@link #name}。
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return 返回  {@link #age}。
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age 要设置的 {@link #age}。
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return 返回  {@link #phone}。
	 */
	public String getPhone() {
		return phone;
	}
	/**
	 * @param phone 要设置的 {@link #phone}。
	 */
	public void setPhone(String phone) {
		this.phone = phone;
	}
	

}
