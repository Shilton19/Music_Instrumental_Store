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

@Entity
public class DeliveryStatus {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.TABLE)

	private int id;
	@Column
	private String Name;
	@Column
	private String mobile;
	@Column
	private Address address;
	@Column
	private int DeliveryFee;

	public int getId() {
		return id;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address_id")
	private List<Registrations> Registration;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "deliveryStatus")
	private List<DeliveryStatus> deliveryStatus;

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

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

	public int getDeliveryFee() {
		return DeliveryFee;
	}

	public void setDeliveryFee(int deliveryFee) {
		DeliveryFee = deliveryFee;
	}
}
