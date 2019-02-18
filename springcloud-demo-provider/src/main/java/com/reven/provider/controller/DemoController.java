package com.reven.provider.controller;
 
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
 
@RestController
public class DemoController {
	@RequestMapping("/hello")
	public String sayhello(){
		return "i`m provider1,hello consumer!";
	}
}