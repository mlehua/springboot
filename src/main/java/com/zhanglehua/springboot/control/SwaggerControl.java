package com.zhanglehua.springboot.control;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;

@RestController
@Api(value = "Swagger", description = "Swagger文档测试")
public class SwaggerControl {

	@ApiOperation(value = "打印内容value", notes = "打印内容nodes")
	@RequestMapping(value="/print",method=RequestMethod.POST)
	public Object print(String inParam) {
		
		System.out.println("param: " + inParam);
		
		return "OK";
		
	}
}
