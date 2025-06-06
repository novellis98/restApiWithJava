package com.example.firstRestApi.user;

import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.validation.constraints.Size;

@Entity
public class Post {
	@Id
	@GeneratedValue
	private int id;
	@Size(min=10)
	private String description;
	@ManyToOne(fetch = FetchType.LAZY)
	private User user;

	public Post() {

	}
	public Post(int id, String description) {
		super();
		this.id = id;
		this.description = description;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return "Post [id=" + id + ", description=" + description + "]";
	}
	public User getUser() {
		return user;
	}
	public void setUser(User user) {
		this.user = user;
	}

}
