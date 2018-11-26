package com.soares.costumer.model;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Costumer {
	
	@Id
	@Column(columnDefinition="bigint auto_increment")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long idCostumer;
	
	private String name;
	
	private String contact;
	
	private String identification;
	
	private BigDecimal paid;
	
	private BigDecimal toPaid;

	public Long getIdCostumer() {
		return idCostumer;
	}

	public void setIdCostumer(Long idCostumer) {
		this.idCostumer = idCostumer;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContact() {
		return contact;
	}

	public void setContact(String contact) {
		this.contact = contact;
	}

	public String getIdentification() {
		return identification;
	}

	public void setIdentification(String identification) {
		this.identification = identification;
	}

	public BigDecimal getPaid() {
		return paid;
	}

	public void setPaid(BigDecimal paid) {
		this.paid = paid;
	}

	public BigDecimal getToPaid() {
		return toPaid;
	}

	public void setToPaid(BigDecimal toPaid) {
		this.toPaid = toPaid;
	}
	
	

}
