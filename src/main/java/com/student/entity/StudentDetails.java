package com.student.entity;

public class StudentDetails {
	
	private Integer id;
	private String name;
	private String country;
	private Long mobile;
	
	
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
		return "StudentDetails [id=" + id + ", name=" + name + ", country=" + country + ", mobile=" + mobile + "]";
	}
		
	
	

}
