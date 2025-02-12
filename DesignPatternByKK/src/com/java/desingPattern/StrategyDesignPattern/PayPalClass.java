package com.java.desingPattern.StrategyDesignPattern;

public class PayPalClass implements PaymentMethod {

	private String email;
	private String password;

	public PayPalClass(String email, String password) {
		this.email = email;
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public String getPassword() {
		return password;
	}

	@Override
	public void pay(int amout) {
		System.out.println(amout + " :: is paid using paypal");

	}

}
