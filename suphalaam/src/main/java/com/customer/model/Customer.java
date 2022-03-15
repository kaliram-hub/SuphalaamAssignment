package com.customer.model;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name="Customer")
public class Customer {
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name="order_id")
	private Long id;
	private String customerName;
	private String country;
	private String address;
	private String productTitle;
	private String productDescription;
	@Column(name="date")
	private Date date;
	private String status;
	
	
	
	

}
