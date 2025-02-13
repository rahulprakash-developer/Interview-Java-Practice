package com.java.threadexample;

public class DeadLockExampleTest2 {

	public static void main(String[] args) {
		
		Account acc = new Account();
		new AccountThread(acc);

	}

}

class Account {
	int bal = 970;

	public void withDrav(int amt) {

		if (bal >= amt) {
			System.out.println(Thread.currentThread().getName() + "is going to withdraw ..." + bal);

			try {
				Thread.sleep(1200);
			} catch (Exception e) {
			}

			System.out.println(Thread.currentThread().getName() + "is complete to withdraw ..." + bal);

		} else {
			System.out.println("No funds for " + Thread.currentThread().getName());

		}
	}

	public int getBal() {

		return bal;
	}
}

class AccountThread implements Runnable {
	Account acc =null;
	
	AccountThread(Account acc){
		
		this.acc=acc;
		Thread th = new Thread(this ,"A");
		Thread th1 = new Thread(this ,"B");
		th.start();
		th1.start();

		
	}

	@Override
	public void run() {
		for (int i = 0; i <5; i++) {
			acc.withDrav(225);
			if(acc.getBal()<0) {
				System.out.println("Amount is OverDrawn....");
			}
			
		}

	}

}