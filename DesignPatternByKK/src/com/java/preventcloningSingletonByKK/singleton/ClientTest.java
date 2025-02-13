package com.java.preventcloningSingletonByKK.singleton;

public class ClientTest {
	
	public static void main(String[] args) throws CloneNotSupportedException {
		
		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = (Singleton) singleton.clone();

		
		System.out.println(singleton.hashCode());
		System.out.println(singleton1.hashCode());
		
		/* If you overried and clone method and try 
		 * to clone the singleton object then its breaking the
		 * singleton rule as we are getting different hashcode value,
		 * so try to resolve this scenario you just remove the return
		 * type of clone method and throw the exception .like below
		 * @Override
			protected Object clone() throws CloneNotSupportedException {
		return super.clone();// You can remove this line and throw the exception like 
		throw new CloneNotSupportedException();
	}
		 */
		
	}

}
