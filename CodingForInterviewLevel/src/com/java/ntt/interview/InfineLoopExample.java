package com.java.ntt.interview;

public class InfineLoopExample {

    public static void main(String[] args) {
        boolean flag = false;

        try {
            if (flag) {
                while (true) {

                }
            } else {

                System.exit(1);
            }
        } finally {
            System.out.println("Finally Block");
        }
    }
}
