package com.pigulevsky.entity;

import java.io.Serializable;

import org.springframework.core.style.ToStringCreator;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "market_place")
public class MarketPlace implements Serializable{
	
	private static final long serialVersionUID = 507799225716877994L;
	
	@Id
	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "submodel_id")
	private Submodel submodel;
	
	private double price;
	
	private byte discount;
	
	public double getPrice() {
		return price;
	}
	
	public void setPrice(double price) {
		this.price = price;
	}
	
	public byte getDiscount() {
		return discount;
	}
	
	public void setDiscount(byte discount) {
		this.discount = discount;
	}
	
	@Override
	public String toString() {
		return new ToStringCreator(this)
				.append("price", getPrice())
				.append("discount", getDiscount())
				.toString();
	}
}
