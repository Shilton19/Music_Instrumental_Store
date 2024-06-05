package com.example.Music.Instrumental.Store.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;

@Entity
public class PlaceOrder {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private int productid;

	private String productname;
	private String productmodel;
	private int price;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "registrations")
	private Registrations registrations;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "products")
	private List<Products> products;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deliverystatus") // "deliverystatus" - foriegn key name
	private DeliveryStatus deliverystatus;

	public PlaceOrder() {
		super();
	}

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

	public Registrations getRegistrations() {
		return registrations;
	}

	public void setRegistrations(Registrations registrations) {
		this.registrations = registrations;
	}

	public List<Products> getProducts() {
		return products;
	}

	public void setProducts(List<Products> products) {
		this.products = products;
	}

	public DeliveryStatus getDeliverystatus() {
		return deliverystatus;
	}

	public void setDeliverystatus(DeliveryStatus deliverystatus) {
		this.deliverystatus = deliverystatus;
	}

}
