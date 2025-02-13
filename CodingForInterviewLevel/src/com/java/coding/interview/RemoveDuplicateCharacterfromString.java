package com.java.coding.interview;

public class RemoveDuplicateCharacterfromString {
    public static void main(String[] args) {
        int k = 3;
        String st = "abbcccaaby";
        char ch[] = st.toCharArray();

        char temp = 0;

        for (int i = 0; i < ch.length; i++) {
            int count = 0;
            for (int j = 0; j < ch.length; j++) {
                if (ch[i] != ch[j]) {
                    count++;

                }
                if (count == k) {
                    temp = ch[i];
                }
            }

        }
        System.out.println(temp);


    }


}