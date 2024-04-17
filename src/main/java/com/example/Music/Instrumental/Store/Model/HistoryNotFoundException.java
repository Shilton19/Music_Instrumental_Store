package com.example.Music.Instrumental.Store.Model;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@SuppressWarnings("guitar")
@ResponseStatus(value = HttpStatus.NOT_FOUND)
public class HistoryNotFoundException extends Exception {
	public HistoryNotFoundException(String playing) {
		super(playing);
		// TODO Auto-generated constructor stub
	}
}
