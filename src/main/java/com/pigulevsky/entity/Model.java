package com.pigulevsky.entity;

import java.util.List;

import org.springframework.core.style.ToStringCreator;

import com.pigulevsky.entity.model.NamedEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name = "model")
public class Model extends NamedEntity {

	private static final long serialVersionUID = -7266938300492275104L;
	
	@Column(name = "attributes", columnDefinition = "jsonb")
	private String attributes;
	
	@ManyToOne(fetch = FetchType.EAGER)
	@JoinColumn(name = "producer_id")
	private Producer producer;
	
	@ManyToMany(fetch = FetchType.EAGER)
	@JoinTable(
	  name = "model_supply", 
	  joinColumns = @JoinColumn(name = "model_id"), 
	  inverseJoinColumns = @JoinColumn(name = "supplier_id"))
	private List<Supplier> suppliers;
	
	@OneToMany(fetch = FetchType.EAGER, mappedBy = "model")
	private List<Submodel> submodels;
	
	public String getAttributes() {
		return attributes;
	}
	
	public void setAttributes(String attributes) {
		this.attributes = attributes;
	}
	
	public Producer getProducer() {
		return producer;
	}
	
	public void setProducer(Producer producer) {
		this.producer = producer;
	}
	
	public List<Supplier> getSuppliers() {
		return suppliers;
	}
	
	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}
	
	public List<Submodel> getSubmodels() {
		return submodels;
	}
	
	public void setSubmodels(List<Submodel> submodels) {
		this.submodels = submodels;
	}
	
	@Override
	public String toString() {
		return new ToStringCreator(this)
				.append("id", getId())
				.append("name", getName())
				.append("attributes", getAttributes())
				.toString();
	}
}
