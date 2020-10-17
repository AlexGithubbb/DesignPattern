package com.alexpower.designPatternPrinciple.LisSwitch;

public class Case2 {
    public static void main(String[] args) {
        C c = new C();
        System.out.println(c.method1(50, 50));
        System.out.println("------------------------");
        D d = new D();
        System.out.println(d.method1(50, 50));
        System.out.println(d.method2(50, 50));
        System.out.println(d.method3(50, 50));
    }
}

class Base{
 // common shared code...
}
class C extends Base{
    Integer a, b;
    public Integer method1(int a, int b){
        return a - b;
    }
}

// D extends Base instead of C, so it won't overwrite method1() in class C
class D extends Base{
    C c = new C();
    Integer a, b;
    public Integer method1(int a, int b){
        return a + b;
    }
    public Integer method2(int a,int b){
        return method1(a,b) + 100;
    }
    public Integer method3(int a, int b){
        return c.method1(a, b);
    }

}

