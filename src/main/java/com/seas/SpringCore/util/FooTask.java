package com.seas.SpringCore.util;

import java.text.SimpleDateFormat;
import java.util.Date;

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
public class FooTask {
	private SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");

    public void execute() {
        System.out.println(format.format(new Date()));
    }

}
