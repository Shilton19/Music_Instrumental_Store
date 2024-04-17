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
public class Registrations {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	@Column
	private String Username;    //LIST of PRODUCTS
	@Column
	private String Password;
	@Column
	private int MobileNumber;
	@Column
	private String MailId;
	@Column
	private String Address;
	@JoinColumn(name = "address_id")
	

	@ManyToOne(cascade = CascadeType.ALL)

							// gettter setter
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsername() {
		return Username;
	}

	public void setUsername(String username) {
		Username = username;
	}

	public String getPassword() {
		return Password;
	}

	public void setPassword(String password) {
		Password = password;
	}

	public int getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(int mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getMailId() {
		return MailId;
	}

	public void setMailId(String mailId) {
		MailId = mailId;
	}

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
}