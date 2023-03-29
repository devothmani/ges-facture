package com.ges.facture.model;

public class Client {
	
	private long id;
	private String lName;
	private String fName;
	private String address;
	private String country;
	private String city;
	private String mobile;
	private String telFix;
	
	
		
	public Client() {
	}
	
	public Client(long id, String lName, String fName, String address, String country, String city, String mobile,
			String telFix) {
		this.id = id;
		this.lName = lName;
		this.fName = fName;
		this.address = address;
		this.country = country;
		this.city = city;
		this.mobile = mobile;
		this.telFix = telFix;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
	public String getTelFix() {
		return telFix;
	}
	public void setTelFix(String telFix) {
		this.telFix = telFix;
	}
	
	

}
