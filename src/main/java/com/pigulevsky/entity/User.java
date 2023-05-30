package com.pigulevsky.entity;

import org.springframework.core.style.ToStringCreator;

import com.pigulevsky.entity.model.BaseEntity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotEmpty;

@Entity
@Table(name = "user_")
public class User extends BaseEntity {

	private static final long serialVersionUID = 6290069726826677501L;
	
	public static enum UserRole {client, admin};

	@Column(name = "login")
	private String login;
	
	@NotEmpty
	@Column(name = "password_")
	private String password;
	
	@NotEmpty
	@Column(name = "email")
	private String email;
	
	@NotEmpty
	@Column(name = "role_")
	@Enumerated(EnumType.STRING)
	private UserRole role;
	
	public String getLogin() {
		return login;
	}
	
	public void setLogin(String login) {
		this.login = login;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	
	public UserRole getRole() {
		return role;
	}
	
	public void setRole(UserRole role) {
		this.role = role;
	}
	
	public boolean isPasswordValid(String password) {
		return this.password.equals(password);
	}
	
	@Override
	public String toString() {
		return new ToStringCreator(this)
				.append("id", getId())
				.append("login", getLogin())
				.append("email", getEmail())
				.append("role", getRole())
				.toString();
	}
}
