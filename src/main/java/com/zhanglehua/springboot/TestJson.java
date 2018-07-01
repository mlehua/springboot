package com.zhanglehua.springboot;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;
import com.zhanglehua.springboot.beans.Student;
import com.zhanglehua.springboot.beans.Teacher;

public class TestJson {

	public static void main(String[] args) throws Exception {
		Student std = new Student();
		std.setId(1);
		std.setName("张三");
		std.setPassword("a123456");
		std.setAge(16);
		
		Teacher tch = new Teacher();
		tch.setId(10);
		tch.setName("王老师");
		tch.setAge(24);
		
		std.setTeacher(tch);
		
		ObjectMapper mapper = new ObjectMapper();
		mapper.setFilterProvider(new SimpleFilterProvider().addFilter("ID-TITLE",
		          SimpleBeanPropertyFilter.filterOutAllExcept("id","name")));
		
		String strJson = mapper.writeValueAsString(std);
		System.out.println(strJson);
	}

}
