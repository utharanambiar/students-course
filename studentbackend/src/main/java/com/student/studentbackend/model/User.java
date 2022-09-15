package com.student.studentbackend.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "user")
public class User {
	
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int rollno;
	
	@Column(name = "username")
	private String username;

	
	public User() {
		
	}
	
	public User(String username) {
		super();
		this.username = username;
	}
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}
	

}
