package com.alexpower.LisSwitch;

public class Case1 {
    public static void main(String[] args) {
        A a = new A();
        System.out.println(a.method1(50, 50));
        B b = new B();
        System.out.println(b.method1(50, 50));
        System.out.println(b.method2(50, 50));

    }
}

class A {
    Integer a, b;
    public Integer method1(int a, int b){
        return a - b;
    }
}

class B extends A{
    Integer a, b;
    public Integer method1(int a, int b){
        return a + b;
    }
    public Integer method2(int a,int b){
        return method1(a,b) + 100;
    }

}
