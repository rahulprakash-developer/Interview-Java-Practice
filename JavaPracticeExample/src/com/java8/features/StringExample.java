package com.java8.features;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Map.Entry;

public class StringExample {

	public static void main(String[] args) {
		
		/*String str1 = "Rahul" +"prakash";
		String str2 = new String("Rahulprakash");
		String str3=str2.intern();
		
		System.out.println("Str3 " + str3);
		System.out.println("str1  " + str1);
		
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str3);*/
		
		//Scanner Use
		String str1 = "Rahul";
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string :");
		String str2 = sc.nextLine();
		
		System.out.println("Re Enter the String :");
		
		String str3 = sc.nextLine();
		
		String str4 = str3.intern();
		String str5 = str4.intern();
		String str6 = "Raam";
		String str7= "Raam";
	
		System.out.println(str2==str3);//--False
		System.out.println(str4==str5);//-True-why true?
		System.out.println(str1==str4);// -Fasle
		//System.out.println(str6==str7);
		

		/*
		 * int a =12; String str1 = "Hello"; String str2 ="Rahul"; String str3
		 * =str1+str2; String str4 = ""+ a; String str5 =a+"";
		 * 
		 * System.out.println("String "+str3); System.out.println("String-- "+str4);
		 * System.out.println("String-- "+str5);
		 */

		// RelationalOperator

		/*
		 * System.out.println("--------------RelationalOperator----------");
		 * System.out.println(10 == 10); System.out.println(10 != 14);
		 * System.out.println('A' > 'B');
		 * 
		 * int a = 25; int b = 20; boolean b1 = a < (b = 34);
		 */
		// System.out.println(b1 + "\t" + b);

		// Ternary Operator

		/*
		 * System.out.println("Ternary Operator--------");
		 * 
		 * int a1 = true ?12:34; int b1 =false ?12:34;
		 * 
		 * System.out.println(a1); System.out.println(b1);
		 * 
		 * int m =20; int n =30; int mn = (m>n)?m:n; System.out.println(mn);
		 */

		// LeftShiftOperator

		/*System.out.println("LeftShiftOperator----------------");

		int x = 77;

		System.out.println(x << 0);
		System.out.println(x << 2);*/

		// CondtionalStatement

		int xy = 0;
		int y =++xy;
		
		//if(xy) {//NOt valid 
			//System.out.println("value");
	//	}
		//if(xy=0) {// not valid
			
	//	}

		boolean b1= false;
		if(b1) {
		//	System.out.println("block");
		}
		
		if(b1=true) {
			//System.out.println("block1");

		}
		
		if(b1==true) {
			//System.out.println("block2");
		}
		
		if (y++ == 1) {
			//System.out.println("value is one");
		} else if (xy++ == 2) {
			//System.out.println("two");
		} else if (xy++ == 3) {
			//System.out.println("three");
		} else {
			//System.out.println("not matching");
		}

		/*
		 * String str = "Hello"; String str4 = "Hello"; String str1 = new
		 * String("Hello"); String str5 = new String("Hello");
		 * 
		 * System.out.println(str1 == str5);
		 * 
		 * String str2 = str; String str3 = str2; System.out.println(str2.equals(str));
		 * System.out.println(str3.equals(str2));
		 * 
		 * System.out.println(str3.intern()); System.out.println(str2.intern());
		 * System.out.println("--------------------"); System.out.println(str == str4);
		 * System.out.println(str4.intern());
		 * 
		 * System.out.println("-------------");
		 * 
		 * System.out.println(str2 == str); System.out.println(str3 == str2);
		 * 
		 * System.out.println(str.equals(str1)); System.out.println(str == str1);
		 * System.out.println(str.intern()); System.out.println(str1.intern());
		 */

		// Unary Airthmetic Operator

		/*
		 * int ab = 10; int bc = +ab; int cd = -ab; int de = ab + cd;
		 * 
		 * System.out.println(ab); System.out.println(bc); System.out.println(cd);
		 * System.out.println(de);
		 */

		/*
		 * // HashMap Test
		 * 
		 * HashMap<String, String> hash = new HashMap<String, String>(); hash.put("hai",
		 * "rahul"); hash.put("hai", "rahul1"); hash.put("hello", "rahul");
		 * hash.put("hell", "rahul");
		 * 
		 * Iterator<Map.Entry<String, String>> itr = hash.entrySet().iterator();
		 * 
		 * while (itr.hasNext()) { Map.Entry<String, String> entry = itr.next();
		 * System.out.println("Key = " + entry.getKey() + ", Value = " +
		 * entry.getValue());
		 * 
		 * }
		 * 
		 * // LinkedHashMap Test
		 * 
		 * LinkedHashMap<String, Integer> linked = new LinkedHashMap<String, Integer>();
		 * linked.put("a", new Integer(123)); linked.put("b", new Integer(123));
		 * 
		 * linked.put("c", new Integer(123));
		 * 
		 * System.out.println(linked);
		 */

	}

}
