package com.example.Music.Instrumental.Store.Model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class History {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
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
