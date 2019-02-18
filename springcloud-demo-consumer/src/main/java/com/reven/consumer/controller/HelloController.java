package com.reven.consumer.controller;
 
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;
 
@RestController
public class HelloController {
	@Autowired
	private RestTemplate resttemplate;
	
	@RequestMapping("/hello")
	public String hello(){
		String url="http://cloud-provider1/hello";
		
		//返回值类型和我们的业务返回值一致
		return "provider return msg:"+resttemplate.getForObject(url, String.class);
	
	}
}