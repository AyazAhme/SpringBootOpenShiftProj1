package com.orgn.teg.test;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping({"/hello", "/hi"})
	public String hi() {
		return "Greetings, Have a Good Day!";
	}
}
