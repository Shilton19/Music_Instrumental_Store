
package com.example.Music.Instrumental.Store.Model;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;

@Entity
public class Payment {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
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

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "deliverystatus")
	private DeliveryStatus deliverystatus;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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
