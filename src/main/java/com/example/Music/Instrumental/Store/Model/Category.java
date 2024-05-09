package com.example.Music.Instrumental.Store.Model;

import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;

@Entity
public class Category {
	@Id
	@Column
	@GeneratedValue(strategy = GenerationType.TABLE)
	private int instrumentid;
	private String instrumentname;
	private String instrumentmodel;

//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="category_registration",
//	joinColumns =@JoinColumn(name = "Registration"))
//	private List<Registrations> Registration;
//
//	@OneToMany(cascade = CascadeType.ALL)
//	@JoinTable(name="category_deliverystatus",
//	joinColumns = @JoinColumn(name = "deliveryStatus"))
//	private List<DeliveryStatus> deliveryStatus;

	public Category() {
		super();
		// TODO Auto-generated constructor stub

	}

	public int getInstrumentid() {
		return instrumentid;
	}

	public void setInstrumentid(int instrumentid) {
		this.instrumentid = instrumentid;
	}

	public String getInstrumentname() {
		return instrumentname;
	}

	public void setInstrumentname(String instrumentname) {
		this.instrumentname = instrumentname;
	}

	public String getInstrumentmodel() {
		return instrumentmodel;
	}

	public void setInstrumentmodel(String instrumentmodel) {
		this.instrumentmodel = instrumentmodel;
	}
}