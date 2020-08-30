package com.hello.world.helloworld.contoller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.hello.world.helloworld.mapper.MapMessage;

@RestController
public class HelloWorldController {

	MapMessage mapMessage = new MapMessage();
	
	@RequestMapping("/print")
	public String displayMsg() {
		String abc = mapMessage.msg();
		return "Greetings from Spring Boot!- Hello world";
	}
}
