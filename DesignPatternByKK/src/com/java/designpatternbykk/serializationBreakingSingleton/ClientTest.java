package com.java.designpatternbykk.serializationBreakingSingleton;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;

public class ClientTest {

	public static void main(String[] args) throws IOException {

		ObjectOutput objectoutput = null;

		Singleton singleton = Singleton.getInstance();
		Singleton singleton1 = null;
		try {
			objectoutput = new ObjectOutputStream(new FileOutputStream("singelton.ser"));
			objectoutput.writeObject(singleton);
		} catch (Exception e) {
			e.printStackTrace();

		} finally {
			if (objectoutput != null) {
				objectoutput.close();
			}
		}

		ObjectInput objectInput = null;

		try {
			objectInput = new ObjectInputStream(new FileInputStream("singelton.ser"));
			Object readObject = objectInput.readObject();
			singleton1 = (Singleton) readObject;

		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (objectInput != null) {
				objectInput.close();
			}
		}

		System.out.println(singleton.hashCode()); // Hascode -1442407170
		System.out.println(singleton1.hashCode());// Hascode -1028566121

		/*
		 * Here you can see you will get differen hashcode as while doing the
		 * serialization and deserialization new object is created hence its breaking
		 * the singleton rule. but if you want that while using serialzation the
		 * singleton rule not break then you have override 1 method in Singleton class
		 * that is
		 * 
		 * private Object readResolve() { return getInstance();// if you override this
		 * method it will not break the Singleton Rule
		 * 
		 * }
		 */

	}

}
