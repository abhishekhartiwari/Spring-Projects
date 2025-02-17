package com.abhi.springcore.constructorinjection;

public class Address {

	private int hno;
	private String country;

	public Address() {
		super();
	}

	public Address(int hno, String country) {
		super();
		this.hno = hno;
		this.country = country;
	}

	public int getHno() {
		return hno;
	}

	public void setHno(int hno) {
		this.hno = hno;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Address [hno=" + hno + ", country=" + country + "]";
	}

}
