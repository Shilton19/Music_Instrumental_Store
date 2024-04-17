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

@Entity
public class Address {
		@Id
		@Column
		@GeneratedValue(strategy = GenerationType.TABLE)
		private int id;
		@Column
		private String StreetName;
		@Column
		private String City;
		@Column
		private String State;
		@Column
		private String pincode;
		@ManyToOne(cascade = CascadeType.ALL)
		@JoinColumn(name = "deliverystatus")
		private List<DeliveryStatus> deliverystatus;

		public Address() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Address(int id, String streetName, String city, String State, String pincode, List<DeliveryStatus> deliverystatus) {
			super();
			this.id = id;
			StreetName = streetName;
			City = city;
			this.pincode = pincode;
			this.deliverystatus = deliverystatus;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getStreetName() {
			return StreetName;
		}

		public void setStreetName(String streetName) {
			StreetName = streetName;
		}

		public String getCity() {
			return City;
		}

		public void setCity(String city) {
			City = city;
		}

		public String getState() {
			return State;
		}

		public void setState(String state) {
			State = state;
		}

		public String getPincode() {
			return pincode;
		}

		public void setPincode(String pincode) {
			this.pincode = pincode;
		}

		public List<DeliveryStatus> getDeliverystatus() {
			return deliverystatus;
		}

		public void setDeliverystatus(List<DeliveryStatus> deliverystatus) {
			this.deliverystatus = deliverystatus;
		}
		
}
