package com.example.Music.Instrumental.Store.Model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("musician")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PlaceOrderNotFoundException extends Exception{

	public PlaceOrderNotFoundException(String messaging) {
		super(messaging);
		// TODO Auto-generated constructor stub
	}
}
