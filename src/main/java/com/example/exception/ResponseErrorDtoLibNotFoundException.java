package com.example.exception;

import java.util.Date;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ResponseErrorDtoLibNotFoundException {
	private String name= "Lib not found or LibraryNotFoundException";
	private Date timeStamp;
	private List<String> errorMessages;
}
