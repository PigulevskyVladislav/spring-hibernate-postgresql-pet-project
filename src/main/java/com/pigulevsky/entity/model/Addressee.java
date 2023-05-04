package com.pigulevsky.entity.model;

import org.springframework.core.style.ToStringCreator;

import jakarta.persistence.MappedSuperclass;

@MappedSuperclass
public class Addressee extends NamedEntity {

	private static final long serialVersionUID = 1L;
	
	private String address;
	
	public String getAddress() {
		return address;
	}
	
	public void serAddress(String address) {
		this.address = address;
	}
	
	public String toString() {
		return new ToStringCreator(this)
				.append("id", this.getId())
				.append("name", this.getName())
				.append("address", this.getAddress())
				.toString();
	}
}
