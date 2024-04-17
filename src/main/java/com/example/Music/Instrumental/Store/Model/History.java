package com.example.Music.Instrumental.Store.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;

public class History {
	@Column
	@Id
	private int id;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "deliveryman")
	private List<DeliveryStatus> deliverystatus;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", unique = false)
	private Registrations registration;

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private Address address;

	@ManyToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "payment_id")
	private Payment payment;
	

	public History() {
		super();
		// TODO Auto-generated constructor stub
	}

	public History(int id, List<DeliveryStatus> deliverystatus, Registrations registration, Address address,
			Payment payment) {
		super();
		this.id = id;
		this.deliverystatus = deliverystatus;
		this.registration = registration;
		this.address = address;
		this.payment = payment;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<DeliveryStatus> getDeliverystatus() {
		return deliverystatus;
	}

	public void setDeliverystatus(List<DeliveryStatus> deliverystatus) {
		this.deliverystatus = deliverystatus;
	}

	public Registrations getRegistration() {
		return registration;
	}

	public void setRegistration(Registrations registration) {
		this.registration = registration;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public Payment getPayment() {
		return payment;
	}

	public void setPayment(Payment payment) {
		this.payment = payment;
	}
	
}
