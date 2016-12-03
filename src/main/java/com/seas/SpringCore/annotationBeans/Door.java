package com.seas.SpringCore.annotationBeans;

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
@Component
public class Door {
	private String description;
	
	public Door() {
		description = "this is door";
	}

	/**
	 * @return 返回  {@link #description}。
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * @param description 要设置的 {@link #description}。
	 */
	public void setDescription(String description) {
		this.description = description;
	}
	

}
