package com.shop.pl;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Entity
public class Customer {
	
	@Id
	@GeneratedValue
	private Long id = null;
	private String name;
	private String surname;
	private	Adress adress;
	private String email;
	private String password;
	private Boolean isActive;
	
	private List<Order> orders;
	

	public void setOrders(List<Order> orders) {
		this.orders = orders;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public Adress getAdress() {
		return adress;
	}

	public void setAdress(Adress adress) {
		this.adress = adress;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public Boolean getIsActive() {
		return isActive;
	}

	public void setIsActive(Boolean isActive) {
		this.isActive = isActive;
	}



	public List<Order> getOrders() {
		return orders;
	}

	public Customer(long id, String name, String surname, Adress adress, String email, String password,
			Boolean isActive, List<Order> orders) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.adress = adress;
		this.email = email;
		this.password = password;
		this.isActive = isActive;
		this.orders = orders;
	}

}
