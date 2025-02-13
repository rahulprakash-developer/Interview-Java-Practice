package com.java.AgregationAndCompositionExample;

public class Address {

	private int adId;
	private String addressName;

	public int getAdId() {
		return adId;
	}

	public void setAdId(int adId) {
		this.adId = adId;
	}

	public void setAddressName(String addressName) {
		this.addressName = addressName;
	}
	
	public String getAddressName() {
		return addressName;
	}

	
	@Override
	public String toString() {
		return "Address [adId=" + adId + ", addressName=" + addressName + "]";
	}

}
