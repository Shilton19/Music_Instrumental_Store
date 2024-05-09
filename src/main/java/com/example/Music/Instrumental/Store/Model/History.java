package com.example.Music.Instrumental.Store.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
@Entity
public class History {
	@Id
	private int id;

//	@ManyToMany(cascade = CascadeType.ALL)
//	 @JoinTable(name="history_delivery",
//	joinColumns = @JoinColumn(name = "deliveryman"))
//	private List<DeliveryStatus> deliverystatus;
//
//	@ManyToMany(cascade = CascadeType.ALL)
//	 @JoinTable(name="history_registration",
//	joinColumns = @JoinColumn(name = "user_id", unique = false))
//	private List<Registrations> registration;
//
//	@ManyToOne(cascade = CascadeType.ALL)
//	private Address address;
//
//	@ManyToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="history_payment",
//	joinColumns = @JoinColumn(name = "payment_id"))
//	private List<Payment> payment;
	


	public History() {
		super();
		// TODO Auto-generated constructor stub
	}

//	public History(int id, List<DeliveryStatus> deliverystatus, List<Registrations> registration, Address address,
//			List<Payment> payment) {
//		super();
//		this.id = id;
//		this.deliverystatus = deliverystatus;
//		this.registration = registration;
//		this.address = address;
//		this.payment = payment;
//	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

//	public List<DeliveryStatus> getDeliverystatus() {
//		return deliverystatus;
//	}
//
//	public void setDeliverystatus(List<DeliveryStatus> deliverystatus) {
//		this.deliverystatus = deliverystatus;
//	}
//
//	public List<Registrations> getRegistration() {
//		return registration;
//	}
//
//	public void setRegistration(List<Registrations> registration) {
//		this.registration = registration;
//	}
//
//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

//	public List<Payment> getPayment() {
//		return payment;
//	}
//
//	public void setPayment(List<Payment> payment) {
//		this.payment = payment;
//	}
	
}
