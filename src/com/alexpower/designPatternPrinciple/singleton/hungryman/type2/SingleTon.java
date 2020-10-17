package com.alexpower.designPatternPrinciple.singleton.hungryman.type2;

/*
*  饿汉式：  静态代码块
* */
public class SingleTon {
    public static void main(String[] args) {
        Person instance = Person.getInstance();
        Person instance1 = Person.getInstance();
        System.out.println(instance == instance1); // true
        System.out.println(instance.hashCode());
        System.out.println(instance1.hashCode());
    }
}


class Person{
    private static Person person;
    static {
        person = new Person();
    }

    private Person(){

    }

    public static Person getInstance(){
        return person;
    }

}