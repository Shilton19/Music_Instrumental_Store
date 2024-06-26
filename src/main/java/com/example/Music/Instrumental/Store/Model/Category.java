package com.example.Music.Instrumental.Store.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int instrumentid;
	private String instrumentname;
	private String instrumentmodel;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "products")
	private List<Products> products;

	public Category() {
		super();
		// TODO Auto-generated constructor stub

	}

	public int getInstrumentid() {
		return instrumentid;
	}

	public void setInstrumentid(int instrumentid) {
		this.instrumentid = instrumentid;
	}

	public String getInstrumentname() {
		return instrumentname;
	}

	public void setInstrumentname(String instrumentname) {
		this.instrumentname = instrumentname;
	}

	public String getInstrumentmodel() {
		return instrumentmodel;
	}

	public void setInstrumentmodel(String instrumentmodel) {
		this.instrumentmodel = instrumentmodel;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

}