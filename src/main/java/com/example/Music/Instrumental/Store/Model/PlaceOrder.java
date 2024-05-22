package com.example.Music.Instrumental.Store.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class PlaceOrder {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int productid;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address")
	private Address address;

	public int getProductid() {
		return productid;
	}

	public void setProductid(int productid) {
		this.productid = productid;
	}

	public String getProductname() {
		return productname;
	}

	public void setProductname(String productname) {
		this.productname = productname;
	}

	public String getProductmodel() {
		return productmodel;
	}

	public void setProductmodel(String productmodel) {
		this.productmodel = productmodel;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public PlaceOrder() {
		super();
		// TODO Auto-generated constructor stub
	}

	private String productname;
	private String productmodel;
	private int price;

}
