package com.zee.zee5_app.Exception;
import lombok.ToString;

@ToString(callSuper = true)

public class InvalidEmailException extends Exception {

	public InvalidEmailException(String message) {
		super(message);
		
	}
}
