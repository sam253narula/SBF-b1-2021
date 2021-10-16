package com.example.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SpringBootAppInfo {

	private String courseName;
	private String courseType;
	//private String instrutorName;
	private FullName instrutorName;

}
