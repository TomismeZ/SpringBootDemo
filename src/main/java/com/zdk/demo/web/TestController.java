package com.zdk.demo.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.zdk.demo.bean.PropertiesConfig;
import com.zdk.demo.bean.User1;

import springfox.documentation.annotations.ApiIgnore;

@RestController
public class TestController {

	/*@Autowired
	private PropertiesConfig propertiesConfig;*/
	
	@Autowired
	private User1 user;
	
	/* @RequestMapping(value="test",method=RequestMethod.GET)
	    public String test(){
//		 return propertiesConfig.getUsername() + ":" + propertiesConfig.getAge();
		return propertiesConfig.getToString();
	   }*/
	@ApiIgnore//使用该注解忽略这个API
	 @RequestMapping(value = "test2", method = RequestMethod.GET)
		public String test2(){
			return user.getUsername() + ":" + user.getAge();
		}
}
