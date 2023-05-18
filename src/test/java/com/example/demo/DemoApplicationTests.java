package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.time.format.DateTimeFormatter;

@SpringBootTest
class DemoApplicationTests {
	@Autowired
	private AppConfiguration appConfiguration;

	@Test
	void contextLoads() {
	}

	@Test
	void test () {
		System.out.println("Time:" + appConfiguration.getTime().format(DateTimeFormatter.ISO_LOCAL_TIME));
	}
}
