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
public class Address {
	private int id;
	private String country;
	private String province;
	private String street;
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
	 * @return 返回  {@link #country}。
	 */
	public String getCountry() {
		return country;
	}
	/**
	 * @param country 要设置的 {@link #country}。
	 */
	public void setCountry(String country) {
		System.out.println("调用setCountry");
		this.country = country;
	}
	/**
	 * @return 返回  {@link #province}。
	 */
	public String getProvince() {
		return province;
	}
	/**
	 * @param province 要设置的 {@link #province}。
	 */
	public void setProvince(String province) {
		this.province = province;
	}
	/**
	 * @return 返回  {@link #street}。
	 */
	public String getStreet() {
		return street;
	}
	/**
	 * @param street 要设置的 {@link #street}。
	 */
	public void setStreet(String street) {
		this.street = street;
	}

}
