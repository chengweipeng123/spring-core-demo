package com.seas.SpringCore.beans;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

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
public class CollectionHolder {
	private List<Object> list;
	private Set<Object> set;
	private Map<String, Object> map;
	private Properties prop;
	private int[] array;
	
	
	/**
	 * @return 返回  {@link #list}。
	 */
	public List<Object> getList() {
		return list;
	}
	/**
	 * @param list 要设置的 {@link #list}。
	 */
	public void setList(List<Object> list) {
		this.list = list;
	}
	/**
	 * @return 返回  {@link #set}。
	 */
	public Set<Object> getSet() {
		return set;
	}
	/**
	 * @param set 要设置的 {@link #set}。
	 */
	public void setSet(Set<Object> set) {
		this.set = set;
	}
	/**
	 * @return 返回  {@link #map}。
	 */
	public Map<String, Object> getMap() {
		return map;
	}
	/**
	 * @param map 要设置的 {@link #map}。
	 */
	public void setMap(Map<String, Object> map) {
		this.map = map;
	}
	/**
	 * @return 返回  {@link #prop}。
	 */
	public Properties getProp() {
		return prop;
	}
	/**
	 * @param prop 要设置的 {@link #prop}。
	 */
	public void setProp(Properties prop) {
		this.prop = prop;
	}
	/**
	 * @return 返回  {@link #array}。
	 */
	public int[] getArray() {
		return array;
	}
	/**
	 * @param array 要设置的 {@link #array}。
	 */
	public void setArray(int[] array) {
		this.array = array;
	}
}
