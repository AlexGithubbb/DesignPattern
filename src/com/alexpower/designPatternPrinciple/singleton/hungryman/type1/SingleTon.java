package com.alexpower.designPatternPrinciple.singleton.hungryman.type1;

/*
 * 饿汉式： 线程安全，但耗费内存
 *
 *  饿汉式： 静态变量
 * load the instance at very beginning, will cost memory unnecessarily
 * thread safe
 *
 * */
public class SingleTon {

    public static void main(String[] args) {
        Dog dog1 = Dog.getInstance();
        Dog dog2 = Dog.getInstance();

        System.out.println(dog1 == dog2);
    }
}

class Dog{
    private static Dog dog = new Dog();

    private Dog() {}

    public static Dog getInstance (){
        return dog;
    }

}
