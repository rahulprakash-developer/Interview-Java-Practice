package com.java.coding.interview;

public class NumberNotPowerBy2 {
    public static void main(String[] args) {
      int number = 9;
      boolean power = (number > 0) && ((number & (number-1))==0);

      if(power){
         // System.out.println(STR."\{number} is power of 2");
      }else{
          //System.out.println(STR."\{number} is not power of 2");

      }


    }


}