package com.sample2;

public class C extends A {
    public void sotta5(){
        System.out.println("sotta5");
    }
    public void sotta6(){
        System.out.println("sotta6");
    }

    public static void main(String[] args) {
        C c = new C();
        c.sotta1();
        c.sotta2();
        c.sotta5();
        c.sotta6();
    }
}
