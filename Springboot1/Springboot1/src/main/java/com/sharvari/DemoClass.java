package com.sharvari;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoClass {
	
	@GetMapping("/")
	public String welcome()
	{
		return "Hello World";
	}

}
