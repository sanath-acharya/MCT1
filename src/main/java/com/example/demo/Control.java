package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Control {
	@RequestMapping(value="/")
	public String NewMethod() {
		return "Hello world, changes new !!!";
		
	}
}
