package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.assertEquals;

@SpringBootTest
class DemoApplicationTests {

	@Test
	void testHello() {
		DemoApplication app = new DemoApplication();

        String result = app.hello("World");

		assertEquals("Hello World!", result);
	}

}
