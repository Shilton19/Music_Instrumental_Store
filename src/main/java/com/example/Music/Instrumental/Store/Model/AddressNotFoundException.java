package com.example.Music.Instrumental.Store.Model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("align")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class AddressNotFoundException extends Exception {

	public AddressNotFoundException(String messaged) {
		super(messaged);
		// TODO Auto-generated constructor stub
	}
}
