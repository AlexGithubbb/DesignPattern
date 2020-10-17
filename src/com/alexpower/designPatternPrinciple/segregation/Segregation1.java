package com.alexpower.designPatternPrinciple.segregation;


/*
* 接口隔离原则
* 将接口interface按照方法拆分成若干个独立的接口，类只和那些需要的接口建立依赖关系，这就叫做接口隔离原则
*
* */
public class Segregation1 {
    public static void main(String[] args) {
        /*
        * A 通过接口 interface1 依赖 B
        * C 通过接口 interface1 依赖 D
        * */
        A a = new A();
        // A类通过接口去依赖 B类
        a.depend1(new B());
        a.depend2(new B());

        C c = new C();
        c.depend1(new D());
        c.depend2(new D());

    }
}

//interface Interface1{
//    void method1();
//    void method2();
//    void method3();
//    void method4();
//    void method5();
//}

// 接口拆分成 Interface1,2,3
interface Interface1{
    void method1();
}

interface Interface2{
    void method2();
    void method3();
}

interface  Interface3{
    void method4();
    void method5();
}
class B implements Interface1, Interface2{

    @Override
    public void method1() {
        System.out.println("class B method1");
    }

    @Override
    public void method2() {
        System.out.println("class B method2");
    }

    @Override
    public void method3() {
        System.out.println("class B method3");
    }
}

class D implements Interface1, Interface3{

    @Override
    public void method1() {
        System.out.println("class D method1");
    }

    @Override
    public void method4() {
        System.out.println("class D method4");
    }

    @Override
    public void method5() {
        System.out.println("class D method5");
    }
}

class A {
    public void depend1(Interface1 i ){
        i.method1();
    }
//    public void depend1(B b){
//        b.method1();
//    }
    public void depend2(Interface2 i ){
        i.method2();
    }
    public void depend3(Interface2 i ){
        i.method3();
    }
}

class C {
    public void depend1(Interface1 i ){
        i.method1();
    }
    public void depend2(Interface3 i ){
        i.method4();
    }
    public void depend3(Interface3 i ){
        i.method5();
    }
}
