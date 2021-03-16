package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CalculatorController {
	
	@PostMapping("/add/{a}/{b}")
	public static int add(@PathVariable String a, @PathVariable String b) {
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		return num1 + num2;
	}

	@RequestMapping("/multiply/{a}/{b}")
	public static int multiply(@PathVariable String a, @PathVariable String b) {
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		return num1 * num2;
	}

	@RequestMapping("/subtract/{a}/{b}")
	public static int subtract(@PathVariable String a, @PathVariable String b) {
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);
		return num1 - num2;
	}

	@RequestMapping("/divide/{a}/{b}")
	public static double divide(@PathVariable String a, @PathVariable String b) {
		int num1 = Integer.parseInt(a);
		int num2 = Integer.parseInt(b);

		if(num2 == 0)
			return Double.MAX_VALUE;

		return (double) num1 / num2;
	}

	@PostMapping("/postMessage")
	public String postMessage(@RequestParam String message ) {
		System.out.println("message" +message);
		return message;
	}
	
	@GetMapping("/getMessage")
	public String getMessage() {
		return "hello";
	}
}
