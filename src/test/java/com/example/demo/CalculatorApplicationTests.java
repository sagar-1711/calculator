package com.example.demo;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.controller.CalculatorController;  
@SpringBootTest
class CalculatorApplicationTests {


	@Test
	void checkAddOverflow() {
		assertNotEquals(4294967294l,CalculatorController.divide("2147483647","2147483647"));
	}
	@Test
	void checkAddParameters()
	{
		assertThrows(NumberFormatException.class, () -> {
			String a = "100";
			String b = "sadd";
			CalculatorController.add(a, b);
			});
	}
	
}

	