package org.amdocs;

public class Address {
	public String doorno;
	public String street;
	public String city;
	public String pinCode;

	public Address() {
	}

	public Address(String doorno, String street, String city, String pinCode) {
		super();
		this.doorno = doorno;
		this.street = street;
		this.city = city;
		this.pinCode = pinCode;
	}

	@Override
	public String toString() {
		return "Address [doorno=" + doorno + ", street=" + street + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	public String getAddress() {
		return "Address [doorno=" + doorno + ", street=" + street + ", city=" + city + ", pinCode=" + pinCode + "]";
	}
	
}