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
public class Payment {
	@Column
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int id;
	private String BankAccount;
	@Column
	private String UPI;
	@Column
	private String COD;
	@Column
	private String Deliveryfee;
	@Column
	private boolean Amountcredited;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "Registration")
	private List<Registrations> Registration;

	@OneToMany(cascade = CascadeType.ALL)
	@JoinColumn(name = "deliveryStatus")
	private List<DeliveryStatus> deliveryStatus;
	

	public Payment(int id, String bankAccount, String uPI, String cOD, String deliveryfee, boolean amountcredited,
			List<com.example.Music.Instrumental.Store.Model.Registrations> registration,
			List<DeliveryStatus> deliveryStatus) {
		super();
		this.id = id;
		BankAccount = bankAccount;
		UPI = uPI;
		COD = cOD;
		Deliveryfee = deliveryfee;
		Amountcredited = amountcredited;
		Registration = registration;
		this.deliveryStatus = deliveryStatus;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public List<Registrations> getRegistration() {
		return Registration;
	}

	public void setRegistration(List<Registrations> registration) {
		Registration = registration;
	}

	public List<DeliveryStatus> getDeliveryStatus() {
		return deliveryStatus;
	}

	public void setDeliveryStatus(List<DeliveryStatus> deliveryStatus) {
		this.deliveryStatus = deliveryStatus;
	}

	public String getBankAccount() {
		return BankAccount;
	}

	public void setBankAccount(String bankAccount) {
		BankAccount = bankAccount;
	}

	public String getUPI() {
		return UPI;
	}

	public void setUPI(String uPI) {
		UPI = uPI;
	}

	public String getCOD() {
		return COD;
	}

	public void setCOD(String cOD) {
		COD = cOD;
	}

	public String getDeliveryfee() {
		return Deliveryfee;
	}

	public void setDeliveryfee(String deliveryfee) {
		Deliveryfee = deliveryfee;
	}

	public boolean isAmountcredited() {
		return Amountcredited;
	}

	public void setAmountcredited(boolean amountcredited) {
		Amountcredited = amountcredited;
	}

	public Payment() {
		super();
		// TODO Auto-generated constructor stub
	}

}
