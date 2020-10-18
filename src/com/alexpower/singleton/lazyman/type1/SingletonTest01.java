package com.alexpower.singleton.lazyman.type1;

/*
* 懒汉式： 线程不安全 （可以实现线程安全），但节省内存空间
*
* load the instance later when necessary, doesnt cost memory unnecessarily
* thread unsafe --> need to upgrade to thread safe way
*
* */
public class SingletonTest01 {

    public static void main(String[] args) {
        System.out.println("Lazy man mode1, thread unsafe ... ");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton{
    private static Singleton singleton;

    private Singleton(){};

    public static Singleton getInstance(){
        if(singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
