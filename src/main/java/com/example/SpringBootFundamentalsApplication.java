package com.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.service.LibraryReadService;

import lombok.extern.slf4j.Slf4j;

@SpringBootApplication
@Slf4j
public class SpringBootFundamentalsApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootFundamentalsApplication.class, args);
	}


	@Override
	public void run(String... args) throws Exception {
	
	}

}
