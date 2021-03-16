package com.example.demo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.example.demo.controller.CalculatorController;
import static org.junit.Assert.assertEquals;  
@SpringBootTest
class CalculatorApplicationTests {

	@Test
	void contextLoads() {
		System.out.println("HEllo");
	}
	@Test
	void checkOverflow() {
		assertEquals(1,(int)CalculatorController.divide("2","2"));
	}
	
}
