package com.alexpower.cast;

public class MessageConvert {
    public static void main(String[] args) {
//        Dog dog1 = new Dog();
//        System.out.println(dog1);
//        Dog dog = (Dog) dog1.getDog();
//        Object dog2 = dog1.getDog();
//        System.out.println(dog2 instanceof Dog);
//        System.out.println(dog);
        Double n1 = 1.6323;
        int i = n1.intValue();
        System.out.println(i);
        double ramdom = Math.random()*10;
        System.out.println((int)ramdom);
        System.out.println(Math.random() * 5);
    }
}

class Dog{
    private String name;
    private Integer age;

    public Dog(String name, Integer age) {
        this.name = name;
        this.age = age;
    }

    public Dog() {
    }

    public Object getDog(){
        return new Dog("Alex", 22);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
