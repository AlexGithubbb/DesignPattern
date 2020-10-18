package com.alexpower.singleton.lazyman.type5;

/*
 * 枚举类： 实现单例
 * 推荐使用
 * */
public class SingletonTest05 {

    public static void main(String[] args) {
        System.out.println("Lazy man mode5, thread safe ~");
        Singleton instance = Singleton.INSTANCE;
        Singleton instance1 = Singleton.INSTANCE;
        System.out.println(instance == instance1);
        instance.greeting();
    }
}

enum Singleton {
    INSTANCE;
   public void greeting(){
       System.out.println("hi");
   }
}
