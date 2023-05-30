package com.pigulevsky.entity;

import java.util.List;

import org.springframework.core.style.ToStringCreator;

import com.pigulevsky.entity.model.NamedEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "product_type")
public class ProductType extends NamedEntity {

	private static final long serialVersionUID = 4519460147234344049L;

	public static enum ProductCategory {appliances, computer, embedded, multimedia, housing, kitchenware, other};
	
	@NotEmpty
	@Column(name = "product_category")
	private ProductCategory category;
	
	@OneToMany(fetch = FetchType.LAZY, mappedBy = "product_type", cascade = CascadeType.)
	@OrderBy("name_")
	private List<Model> models;
	
	public ProductCategory getCategory() {
		return category;
	}
	
	public void setCategory(ProductCategory category) {
		this.category = category;
	}
	
	public List<Model> getModels() {
		return models;
	}
	
	public void setModels(List<Model> models) {
		this.models = models;
	}
	
	@Override
	public String toString() {
		return new ToStringCreator(this)
				.append("id", getId())
				.append("name", getName())
				.append("category", getCategory())
				.toString();
	}
}