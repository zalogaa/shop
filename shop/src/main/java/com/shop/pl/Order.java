package com.shop.pl;

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
	private Customer customer;
	private Date startDate;	
}
