package com.example.Music.Instrumental.Store.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class Products {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int id;
	@Column
	private String name;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "category")
	private Category category;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "placeorder")
	private PlaceOrder placeorder;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}

	public PlaceOrder getPlaceorder() {
		return placeorder;
	}

	public void setPlaceorder(PlaceOrder placeorder) {
		this.placeorder = placeorder;
	}

}
