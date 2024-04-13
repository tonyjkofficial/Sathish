package com.sample1;

public class B extends A {
    public void motta3() {
        System.out.println("motta3");
    }

    public void motta4() {
        System.out.println("motta4");
    }

    public static void main(String[] args) {
        B b = new B();
        b.motta1();
        b.motta2();
        b.motta3();
        b.motta4();

    }

}
