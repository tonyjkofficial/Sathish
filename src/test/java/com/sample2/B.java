package com.sample2;

public class B extends A {
    public void sotta3(){
        System.out.println("sotta3");
    }
    public void sotta4(){
        System.out.println("sotta4");
    }
    public static void main(String[] args) {
        B b = new B();
        b.sotta1();
        b.sotta2();
        b.sotta3();
        b.sotta4();
    }
}
