package com.example.Music.Instrumental.Store.Model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serial")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class CategoryNOtFoundException extends Exception {

	public CategoryNOtFoundException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

}
