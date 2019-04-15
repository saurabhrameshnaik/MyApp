package com.ofss;

public class Address {

	private int flatNo;
	private String streetName;
	private String city;
	long pinCode ;
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Address(int flatNo, String streetName, String city, long pinCode) {
		super();
		this.flatNo = flatNo;
		this.streetName = streetName;
		this.city = city;
		this.pinCode = pinCode;
	}
	@Override
	public String toString() {
		return "Address [flatNo=" + flatNo + ", streetName=" + streetName + ", city=" + city + ", pinCode=" + pinCode
				+ "]";
	}
	public int getFlatNo() {
		return flatNo;
	}
	public void setFlatNo(int flatNo) {
		this.flatNo = flatNo;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public long getPinCode() {
		return pinCode;
	}
	public void setPinCode(long pinCode) {
		this.pinCode = pinCode;
	}
	
}
