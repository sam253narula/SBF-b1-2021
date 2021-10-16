package com.example.exception;

public class LibraryNotFoundRuntimeException extends RuntimeException {

	public LibraryNotFoundRuntimeException(String message) {
		super(message);
	}
}
