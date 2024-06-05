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
import jakarta.persistence.OneToOne;

@Entity
public class Registrations {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int Userid;
	@Column
	private String Username;
	@Column
	private String Password;
	@Column
	private String MobileNumber;
	@Column
	private String MailId;

	@OneToMany(cascade = CascadeType.ALL) // cascade all-if any changes did in parent, it affects child class too
	@JoinColumn(name = "placeorder")
	private List<PlaceOrder> placeorder;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "address")
	private Address address;

	public int getUserid() {
		return Userid;
	}

	public void setUserid(int userid) {
		Userid = userid;
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

	public String getMobileNumber() {
		return MobileNumber;
	}

	public void setMobileNumber(String mobileNumber) {
		MobileNumber = mobileNumber;
	}

	public String getMailId() {
		return MailId;
	}

	public void setMailId(String mailId) {
		MailId = mailId;
	}

	public List<PlaceOrder> getPlaceorder() {
		return placeorder;
	}

	public void setPlaceorder(List<PlaceOrder> placeorder) {
		this.placeorder = placeorder;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}