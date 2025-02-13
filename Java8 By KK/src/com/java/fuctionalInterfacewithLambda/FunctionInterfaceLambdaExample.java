package com.java.fuctionalInterfacewithLambda;

@SuppressWarnings("unused")
public class FunctionInterfaceLambdaExample {

	public static void main(String[] args) {

		// createThreadUsingAnnonymousClass();

		createThreadUsingLambdaExpression();

	}

	private static void createThreadUsingLambdaExpression() {
		Runnable runnable = ()-> {
			System.out.println("IN Run Method of Lambda");
		};
		
		Thread th = new Thread(runnable);
		th.start();
	}

	/*private static void createThreadUsingAnnonymousClass() {
		Runnable runnable = new Runnable() {

			@Override
			public void run() {
				System.out.println("IN Run Method");

			}
		};

		Thread th = new Thread(runnable);
		th.start();
	}
*/
}
