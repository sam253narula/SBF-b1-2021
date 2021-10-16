package com.example.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.entity.Library;
import com.example.serviceImpl.CustomQueryDemoServiceImpl;

@RestController
public class CustomQueryDemoController {

	@Autowired
	CustomQueryDemoServiceImpl customQueryDemoServiceImpl;

	@GetMapping("/getLibWithTheseBooks")
	public List<Library> getLibWithTheseBooks(String commaSeperatedBookNames) {
		return customQueryDemoServiceImpl.getLibWithTheseBooks(commaSeperatedBookNames);
	}
	
	@GetMapping("/getLibWithNoBooks")
	public List<Library> getLibWithNoBooks() {
		return customQueryDemoServiceImpl.getLibWithNoBooks();
	}
}
