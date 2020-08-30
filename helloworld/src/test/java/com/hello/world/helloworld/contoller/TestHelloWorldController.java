package com.hello.world.helloworld.contoller;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;

import org.junit.Test;

import com.hello.world.helloworld.mapper.MapMessage;

public class TestHelloWorldController {

	MapMessage mapMessage = mock(MapMessage.class);
	HelloWorldController helloWorldController = new HelloWorldController();
	@Test
	public void testDisplayMsg() {
		
		String abc = "Greetings from Spring Boot!- Hello world";
		String xyz = helloWorldController.displayMsg();
		assertEquals(abc, xyz);
	}
}
