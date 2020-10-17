package com.alexpower.designPatternPrinciple.DependencyInversion;

public class Case1 {
    public static void main(String[] args) {
        Person person = new Person();
        person.receiveMessage(new Email());
    }
}

class Email{
    public String getInfo(){
        return "Email : Dear ......";
    }
}


class Person{
    public void receiveMessage(Email email){
        System.out.println(email.getInfo());
    }
}
