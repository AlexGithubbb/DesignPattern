package com.alexpower.singleton;

/*
* load the instance later when necessary, doesnt cost memory unnecessarily
* thread unsafe --> need to upgrade to thread safe way
*
* */
public class LazyMan {

    public static void main(String[] args) {
        Cat cat1 = Cat.getInstance();
        Cat cat2 = Cat.getInstance();
        System.out.println(cat1 == cat2);
    }
}

class Cat{

    private Cat(){};

    private static Cat cat = null;

     public static Cat getInstance(){
         if(cat != null){
             Cat cat = new Cat();
         }
         return cat;
     }

}
