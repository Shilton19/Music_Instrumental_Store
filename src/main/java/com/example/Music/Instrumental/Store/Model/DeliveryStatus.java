package com.example.Music.Instrumental.Store.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Embedded;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class DeliveryStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int id;
	@Column
	private String Name;
	@Column
	private String mobile;
//	@ManyToOne(cascade = CascadeType.ALL)
//	@JoinColumn(name = "address_id")
//	private Address address;
	@Column
	private int DeliveryFee;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

//	public Address getAddress() {
//		return address;
//	}
//
//	public void setAddress(Address address) {
//		this.address = address;
//	}

	public int getDeliveryFee() {
		return DeliveryFee;
	}

	public void setDeliveryFee(int deliveryFee) {
		DeliveryFee = deliveryFee;
	}

	public DeliveryStatus(int id, String name, String mobile, Address address, int deliveryFee) {
		super();
		this.id = id;
		Name = name;
		this.mobile = mobile;
		DeliveryFee = deliveryFee;
	}

	public DeliveryStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

}
