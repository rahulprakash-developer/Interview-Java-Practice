package com.java.ThisReferenceInLambda;

public class ThisReferenceLambdaExample {

	public void process() {
		doOperate(30, x -> {
			System.out.println(x + 30);
			System.out.println(this);
		});

	}
	
	

	public static void main(String[] args) {
		
		

		int b = 90;

		doOperate(b, x -> {
			System.out.println(x + b);
			// System.out.println(this);//Cannot use this in a static context
		});
		
		new ThisReferenceLambdaExample().process();

	}

	public static void doOperate(int i, Operation o) {
		o.sum(i);
	}

}

/*
 * doOperate(b, new Operation() {
 * 
 * @Override public void sum(int i) {
 * 
 * System.out.println(i + b); System.out.println(this);
 * 
 * } });
 * 
 * }
 * 
 * 
 * Here you can see we are using This reference but here you wont get any error
 * why because this reference treates as inner class so as output its giving
 * result as
 * "com.java.ThisReferenceInLambda.ThisReferenceLambdaExample$1@15db9742"
 * 
 * but with the use of Lambda you can use this reference you will get compile
 * time error with message "Cannot use this in a static context"
 * 
 * to resolve this you have to create instance method and inside the method you
 * can call the this reference as above code example
 * 
 * 
 * 
 * 
 */
