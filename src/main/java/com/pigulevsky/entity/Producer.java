package com.pigulevsky.entity;

import org.springframework.core.style.ToStringCreator;

import com.pigulevsky.entity.model.Addressee;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "producer")
public class Producer extends Addressee{

	private static final long serialVersionUID = 508544923923686843L;

	@Override
	public String toString() {
		return new ToStringCreator(this)
				.append("id", getId())
				.append("name", getName())
				.append("address", getAddress())
				.toString();
	}
}
