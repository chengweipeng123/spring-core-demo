package com.seas.SpringCore.beans.editor;

import java.beans.PropertyEditorSupport;

import com.seas.SpringCore.beans.Address;

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
public class AddressEditor extends PropertyEditorSupport {
	
    /**
     * 把字符串转换为 Address 的对象。
     *
     * @param text 格式为 id|country|province|street
     * @throws IllegalArgumentException
     */
	@Override
	public void setAsText(String text) throws IllegalArgumentException {
		String[] tokens = text.split("\\|");
		Address address = new Address();
		address.setId(Integer.parseInt(tokens[0]));
		address.setCountry(tokens[1]);
		address.setProvince(tokens[2]);
		address.setStreet(tokens[3]);
		setValue(address);
	}

}
