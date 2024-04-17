package com.example.Music.Instrumental.Store.Model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("ordered")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class ProductsNotFoundException extends Exception{

	public ProductsNotFoundException(String mess) {
		super(mess);
		// TODO Auto-generated constructor stub
	}
}
