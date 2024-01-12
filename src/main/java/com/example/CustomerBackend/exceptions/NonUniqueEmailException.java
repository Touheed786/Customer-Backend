package com.example.CustomerBackend.exceptions;

public class NonUniqueEmailException extends RuntimeException{
	public NonUniqueEmailException(String message) {
        super(message);
    }
}
