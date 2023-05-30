package com.pigulevsky.entity;

import java.util.List;

import org.springframework.core.style.ToStringCreator;

import com.pigulevsky.entity.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "submodel")
public class Submodel extends BaseEntity {

	private static final long serialVersionUID = -7591519036588237063L;
	
	@Column(columnDefinition = "jsonb")
	private String attributes;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "submodel")
	private List<MarketPlace> marketPlaces;
	
	public String getAttributes() {
		return attributes;
	}
	
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	
	public List<MarketPlace> getMarketPlaces() {
		return marketPlaces;
	}
	
	public void setMarkedPlaces(List<MarketPlace> marketPlaces) {
		this.marketPlaces = marketPlaces;
	}
	
	@Override
	public String toString() {
		return new ToStringCreator(this)
				.append("id", getId())
				.append("attributes", getAttributes())
				.toString();
	}
}
