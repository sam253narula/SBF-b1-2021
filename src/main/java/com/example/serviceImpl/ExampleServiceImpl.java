package com.example.serviceImpl;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

import com.example.model.FullName;
import com.example.model.SpringBootAppInfo;
import com.example.service.ExampleService;

import lombok.experimental.PackagePrivate;
import lombok.extern.slf4j.Slf4j;

@Service
@Slf4j
public class ExampleServiceImpl implements ExampleService {

	@Override
	public SpringBootAppInfo get() {
		SpringBootAppInfo appInfo = SpringBootAppInfo.builder().courseName("Learn Controllers in Spring boot")
		.courseType("Information Technology").instrutorName(FullName.builder().firstName("Samarth").lastName("Narula").build()).build();
		log.info("inside get() method -> {}", appInfo);
		return appInfo ;
	}

	@Override
	public SpringBootAppInfo customInfo(String courseName, String courseType, String firstName, String lastname) {
		log.info("Inside customInfo() method ");
		return SpringBootAppInfo.builder().courseName(courseName).courseType(courseType)
				.instrutorName(FullName.builder().firstName(firstName).lastName(lastname).build()).build();
	}

}
