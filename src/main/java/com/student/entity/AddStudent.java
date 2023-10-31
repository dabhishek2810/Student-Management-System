package com.student.entity;

public class AddStudent {
	private Integer id;
	private String name;
	private Long mobile;
	private String country;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
		public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public Long getMobile() {
		return mobile;
	}
	public void setMobile(Long mobile) {
		this.mobile = mobile;
	}
	@Override
	public String toString() {
		return "AddStudent [id=" + id + ", name=" + name + ", mobile=" + mobile + ", country=" + country + "]";
	}
	
	
	
	

}
