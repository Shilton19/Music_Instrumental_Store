package com.example.Music.Instrumental.Store.Model;

import java.sql.Timestamp;
import java.util.Date;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class DeliveryStatus {
	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "orderstatus_generator")
	@SequenceGenerator(name = "orderstatus_generator", sequenceName = "orderstatus_seq", allocationSize = 1)
	private int orderid;
	@Column
	private Date orderingDate;
	@Column
	private boolean OrderAssigned;
	@Column
	private boolean OrderDispatched;
	@Column
	private boolean OrderDelivered;

	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "user_id", unique = false)
	private Registrations registrations;

	public DeliveryStatus(int orderid, Timestamp orderingDate, boolean orderAssigned, boolean orderDispatched,
			boolean orderDelivered, Registrations registrations, Payment payment) {
		super();
		this.orderid = orderid;
		this.orderingDate = orderingDate;
		OrderAssigned = orderAssigned;
		OrderDispatched = orderDispatched;
		OrderDelivered = orderDelivered;
		this.registrations = registrations;
		// this.payment = payment;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}

	public Registrations getRegistrations() {
		return registrations;
	}

	public void setRegistrations(Registrations registrations) {
		this.registrations = registrations;
	}

	public DeliveryStatus() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Date getOrderingDate() {
		return orderingDate;
	}

	public void setOrderingDate(Date orderingDate) {
		this.orderingDate = orderingDate;
	}

	public boolean isOrderAssigned() {
		return OrderAssigned;
	}

	public void setOrderAssigned(boolean orderAssigned) {
		OrderAssigned = orderAssigned;
	}

	public boolean isOrderDispatched() {
		return OrderDispatched;
	}

	public void setOrderDispatched(boolean orderDispatched) {
		OrderDispatched = orderDispatched;
	}

	public boolean isOrderDelivered() {
		return OrderDelivered;
	}

	public void setOrderDelivered(boolean orderDelivered) {
		OrderDelivered = orderDelivered;
	}
}
