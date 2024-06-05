package com.example.Music.Instrumental.Store.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToOne;

@Entity
public class Address {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	private String StreetName;
	private String City;
	private String State;
	private String pincode;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "placeorder")
	private PlaceOrder placeorder;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "registrations")
	private Registrations registrations;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "payment")
	private Payment payment;

	public Address(int id, String streetName, String city, String state, String pincode) {
		super();
		this.id = id;
		StreetName = streetName;
		City = city;
		State = state;
		this.pincode = pincode;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getStreetName() {
		return StreetName;
	}

	public void setStreetName(String streetName) {
		StreetName = streetName;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public String getState() {
		return State;
	}

	public void setState(String state) {
		State = state;
	}

	public String getPincode() {
		return pincode;
	}

	public void setPincode(String pincode) {
		this.pincode = pincode;
	}

	public PlaceOrder getPlaceorder() {
		return placeorder;
	}

	public void setPlaceorder(PlaceOrder placeorder) {
		this.placeorder = placeorder;
	}

	public Registrations getRegistrations() {
		return registrations;
	}

	public void setRegistrations(Registrations registrations) {
		this.registrations = registrations;
	}

}
