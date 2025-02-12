package com.java.desingPattern.StrategyDesignPattern;

public class CreditCardClass implements PaymentMethod {

	private String cardHolderName;
	private String card;
	private String cvv;
	private String dateOfExpiry;

	public CreditCardClass(String cardHolderName, String card, String cvv, String dateOfExpiry) {
		super();
		this.cardHolderName = cardHolderName;
		this.card = card;
		this.cvv = cvv;
		this.dateOfExpiry = dateOfExpiry;
	}

	public String getCardHolderName() {
		return cardHolderName;
	}

	public String getCard() {
		return card;
	}

	public String getCvv() {
		return cvv;
	}

	public String getDateOfExpiry() {
		return dateOfExpiry;
	}

	@Override
	public void pay(int amout) {
		System.out.println(amout + ":: is paid using credit card :: " + card);

	}

}
