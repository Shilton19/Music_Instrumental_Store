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
public class Registrations {
	@Id
	@Column
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
	@Column
	private String Address;

	@OneToMany(cascade = CascadeType.ALL) // cascade all-if any changes did in parent, it affects child class too
	@JoinColumn(name = "category")
	private List<Category> category;

	public int getId() {
		return Userid;
	}

	public void setId(int id) {
		this.Userid = id;
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

	public String getAddress() {
		return Address;
	}

	public void setAddress(String address) {
		Address = address;
	}
}