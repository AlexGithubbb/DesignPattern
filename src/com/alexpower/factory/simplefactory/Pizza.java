package com.alexpower.factory.simplefactory;

public abstract class Pizza {
    String name;

    public void setName(String name) {
        this.name = name;
    }

    public abstract void prepare();

    public void cook(){
        System.out.println(name + " is being cooked");

    }

    public void cut(){
        System.out.println(name + " is being cut");

    }

    public void pack(){
        System.out.println(name + " is being packaged");
    }
}
