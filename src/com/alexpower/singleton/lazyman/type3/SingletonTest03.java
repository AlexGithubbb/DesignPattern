package com.alexpower.singleton.lazyman.type3;

/*
 * 懒汉式： 线程安全
 * 双重检索 （double check)
 * 推荐使用
 * */
public class SingletonTest03 {

    public static void main(String[] args) {
        System.out.println("Lazy man mode3, thread safe ~");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton {
    // 实时同步到主内存中 (可见性）
    private static volatile Singleton singleton;

    private Singleton() {
    }

    // double check (双重检索）
    public static Singleton getInstance() {
        if (singleton == null) {
            synchronized (Singleton.class) {
                if (singleton == null) {
                    singleton = new Singleton();
                }
            }
        }
        return singleton;
    }
}
