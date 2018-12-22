package com.shop.pl.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Order {
	@Id
	@GeneratedValue
	private Long id;
	private boolean isPaid;
	private User customer;
	private Date startDate;	
}
