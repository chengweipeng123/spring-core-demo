package com.seas.SpringCore.util;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.core.util.DefaultIndenter;
import com.fasterxml.jackson.core.util.DefaultPrettyPrinter;
import com.fasterxml.jackson.databind.ObjectMapper;

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
public class CommonUtils {
	private static DefaultPrettyPrinter printer;
	static {
		DefaultPrettyPrinter.Indenter indenter = new DefaultIndenter("  ", DefaultIndenter.SYS_LF);
		printer = new DefaultPrettyPrinter();
		printer.indentObjectsWith(indenter);
		printer.indentArraysWith(indenter);
	}
	
	public static void output(Object obj) {
		ObjectMapper mapper = new ObjectMapper();
		try{
			System.out.println(mapper.writer(printer).writeValueAsString(obj));
		}catch (JsonProcessingException e) {
			e.printStackTrace();
			// TODO: handle exception
		}
		
	}
}
