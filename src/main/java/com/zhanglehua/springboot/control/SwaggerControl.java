package com.zhanglehua.springboot.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerControl {

	@RequestMapping(value="/print",method=RequestMethod.POST)
	public Object print(String inParam) {
		
		System.out.println("param: " + inParam);
		
		return "OK";
		
	}
}
