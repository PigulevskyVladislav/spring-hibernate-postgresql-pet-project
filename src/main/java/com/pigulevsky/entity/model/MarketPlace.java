package com.pigulevsky.entity.model;

import java.io.Serializable;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class MarketPlace implements Serializable{
	
	private static final long serialVersionUID = 1L;

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
}
