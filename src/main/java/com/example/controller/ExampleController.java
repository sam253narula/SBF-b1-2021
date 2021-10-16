package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.model.SpringBootAppInfo;
import com.example.service.ExampleService;
import com.example.serviceImpl.ExampleServiceImpl;

@RestController
public class ExampleController {
	
	@Autowired
	ExampleService exampleServiceImpl;
	
	@GetMapping("/info")
	public SpringBootAppInfo get() {
		return exampleServiceImpl.get();
	}

	@PostMapping("/customInfo")
	public SpringBootAppInfo customInfo(String courseName, String courseType, String firstName, String lastName) {
		return exampleServiceImpl.customInfo(courseName, courseType, firstName, lastName);
	}

}
