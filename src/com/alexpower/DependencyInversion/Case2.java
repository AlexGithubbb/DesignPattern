package com.alexpower.DependencyInversion;


public class Case2 {
    public static void main(String[] args) {
        Person2 person = new Person2();
        person.receiveMessage(new Email2());
        person.receiveMessage(new Wechat());

    }
}



interface IReceiver{
    public String getInfo();
}


class Wechat implements IReceiver{
    @Override
    public String getInfo() {
        return "Wechat message";
    }
}

class Email2 implements IReceiver{

    @Override
    public String getInfo() {
        return "Email message..";
    }
}

class Person2{
    // 对接口的依赖
    public void receiveMessage(IReceiver receiver){
        System.out.println(receiver.getInfo());
    }
}



