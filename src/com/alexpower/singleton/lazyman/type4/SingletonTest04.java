package com.alexpower.singleton.lazyman.type4;

/*
 * 静态内部类： 线程安全
 * 类的静态属性只会在首次加载类的时候初始化，所以在此，JVM 帮助实现了线程安全，因为在初始化类的时候，别的线程无法访问
 * 推荐使用
 * */
public class SingletonTest04 {

    public static void main(String[] args) {
        System.out.println("Lazy man mode4, thread safe ~");
        Singleton instance1 = Singleton.getInstance();
        Singleton instance2 = Singleton.getInstance();
        System.out.println(instance1 == instance2);
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
    }
}

class Singleton {

    private Singleton() {}

    // 静态内部类 static inner class doesn't load when class Singleton loads.
    private static class SingletonInstance{
        private static final Singleton INSTANCE = new Singleton();
    }
    // load class SingletonInstance when we call getInstance()
    public static Singleton getInstance() {
       return SingletonInstance.INSTANCE;
    }
}
