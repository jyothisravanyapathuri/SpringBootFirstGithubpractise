package com.example.demo.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerClass {

	@GetMapping("/message")
	public String getMessage() {
		System.out.println("....in msg controller...");
		return "good morning";

	}
	
	
	@GetMapping("/secondmessage")
	public String secondMessage() {
		System.out.println(".......in second controller...");
		return "iam from second method";

	}

	@GetMapping("/thirdmessage")
	public String getThirdmessage() {
		System.out.println("...iam from second controller...");
		return "third alert";
	}

	
	
}
