package com.sample3;

public class C extends B {
    public void kotta5(){
        System.out.println("kotta5");
    }
    public void kotta6(){
        System.out.println("kotta6");
    }

    public static void main(String[] args) {
        C c = new C();
        c.kotta1();
        c.kotta2();
        c.kotta3();
        c.kotta4();
        c.kotta5();
        c.kotta6();

    }
}
