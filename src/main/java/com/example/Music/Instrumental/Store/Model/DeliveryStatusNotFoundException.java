package com.example.Music.Instrumental.Store.Model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("serialize")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class DeliveryStatusNotFoundException extends Exception{

	public DeliveryStatusNotFoundException(String messaging) {
		super(messaging);
		// TODO Auto-generated constructor stub
	}
}
