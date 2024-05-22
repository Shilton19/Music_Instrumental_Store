package com.example.Music.Instrumental.Store.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class History {
	@Id
	private int id;

	public History() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
}
