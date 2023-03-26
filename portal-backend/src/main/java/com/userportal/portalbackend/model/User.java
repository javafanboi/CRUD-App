package com.userportal.portalbackend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="users")
public class User {
	@Id
private long id;
private String first_name;
private String last_name;
private String email;
public long getId() {
	return id;
}
public void setId(long id) {
	this.id = id;
}
public String getFirst_name() {
	return first_name;
}
public void setFirst_name(String first_name) {
	this.first_name = first_name;
}
public String getLast_name() {
	return last_name;
}
public void setLast_name(String last_name) {
	this.last_name = last_name;
}
public String getEmail() {
	return email;
}
public void setEmail(String email) {
	this.email = email;
}
public User(long id, String first_name, String last_name, String email) {
	super();
	this.id = id;
	this.first_name = first_name;
	this.last_name = last_name;
	this.email = email;
}

public User() {}
}
