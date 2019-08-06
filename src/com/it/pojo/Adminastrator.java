package com.it.pojo;

public class Adminastrator {
	private int id;
	private String name;
	private String username;
	private String password;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Adminastrator(int id, String name, String username, String password) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.password = password;
	}
	public Adminastrator() {
		super();
	}
	@Override
	public String toString() {
		return "Adminastrator [id=" + id + ", name=" + name + ", username="
				+ username + ", password=" + password + "]";
	}
	
	
}
