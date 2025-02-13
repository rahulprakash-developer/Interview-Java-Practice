package com.java.ntt.interview;

@FunctionalInterface
public interface A {
    void m1();
}

interface A1 extends A {

    void m2();

    void m1();
}


