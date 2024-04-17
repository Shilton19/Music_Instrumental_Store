package com.example.Music.Instrumental.Store.Model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("keyboard")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class PaymentNotFoundException extends Exception {
	public PaymentNotFoundException(String played) {
		super(played);
		// TODO Auto-generated constructor stub
	}
}
