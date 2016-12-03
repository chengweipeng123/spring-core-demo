package com.seas.SpringCore.annotationBeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

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
//生成的 Bean 的 ID 是 house
@Component
public class House {
	private String des;
	
	@Autowired
	private Door door;

	/**
	 * @return 返回  {@link #des}。
	 */
	public String getDes() {
		return des;
	}

	/**
	 * @param des 要设置的 {@link #des}。
	 */
	public void setDes(String des) {
		this.des = des;
	}

	/**
	 * @return 返回  {@link #door}。
	 */
	public Door getDoor() {
		return door;
	}

	/**
	 * @param door 要设置的 {@link #door}。
	 */
	public void setDoor(Door door) {
		this.door = door;
	}

}
