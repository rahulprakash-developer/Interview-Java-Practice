package com.java8.features;


public interface TestInterface {

	public String get(int i);
	

}


interface Abc extends TestInterface ,Ccd{
	
}

interface Ccd{
	
}

interface Tbd{
	
}

class Bbb extends Bcd{
	
}

class Bcd implements TestInterface, Ccd,Tbd{

	@Override
	public String get(int i) {
		return null;
	}
	
}

abstract class Ttd implements TestInterface{
	
}