package com.javatechie.multiple.ds.api.model.user;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name = "USER_TB")
public class User {
	@Id
	private int id;
	
	@Column(name="userName")
	private String userName;
	
	public User() {
		
	}

	public User(int id, String userName) {
		super();
		this.id = id;
		this.userName = userName;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
