package com.alexpower.singleton;

/*
 * load the instance at very beginning, will cost memory unnecessarily
 * thread safe
 *
 * */
public class HungryManPattern {

    public static void main(String[] args) {
        Dog dog1 = Dog.getInstance();
        Dog dog2 = Dog.getInstance();

        System.out.println(dog1 == dog2);
    }
}

class Dog{

    public String name;

    private Dog() {
    }

   private static Dog dog = new Dog();

    public static Dog getInstance (){
        return dog;
    }

}
