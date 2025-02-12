package com.java.desingPattern.StrategyDesignPattern;

public class StrategiExample {
	public static void main(String[] args) {

		ShoppingCart shoppingCart = new ShoppingCart();

		Product product = new Product("Cookie", "344", 100);
		Product product1 = new Product("Buiscuit", "444", 6666);
		Product product2 = new Product("Phone", "3222", 7777);

		shoppingCart.addProduct(product);
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product2);
		shoppingCart.payment(new CreditCardClass("KK", "434232342", "444", "11/03"));

		System.out.println("----------------------------------");
		shoppingCart = new ShoppingCart();
		product1 = new Product("Bikki", "222", 200);
		product2 = new Product("Tikki", "4444", 500);
		shoppingCart.addProduct(product1);
		shoppingCart.addProduct(product2);

		shoppingCart.payment(new PayPalClass("User", "88888"));

	}

}
