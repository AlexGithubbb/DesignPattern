package com.alexpower.singleton.lazyman.type2;

/*
* 懒汉式： 线程安全
* 效率低下，安全问题只存在于第一次创建对象，而往后均不存在安全问题，但每次getInstance() 都要进行同步，且 Synchronize 是重量锁
* 在实际开发中不推荐
* */
public class SingletonTest02 {

    public static void main(String[] args) {
        System.out.println("Lazy man mode2, thread safe ~");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton{

    private Singleton(){};

    private static Singleton singleton;

    // 添加同步代码机制，解决线程安全问题
    // cons: 成本高
     public static synchronized Singleton getInstance(){
         if(singleton == null){
             singleton = new Singleton();
         }
         return singleton;
     }
}
