package com.example.Music.Instrumental.Store.Model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serials")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class RegistrationNOtFoundException extends Exception{
	public RegistrationNOtFoundException(String messages) {
		super(messages);
		// TODO Auto-generated constructor stub
	}
}
