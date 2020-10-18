package com.alexpower.factory.factorymethod;

public abstract class PizzaStore {
    public Pizza orderPizza(String type) {
//        Pizza pizza = null;
        Pizza pizza = createPizza(type);
        System.out.println("--- Making a " + pizza.getName() + " ---");
        pizza.prepare();
        pizza.cook();
        pizza.cut();
        pizza.box();
        return pizza;
    }

    protected abstract Pizza createPizza(String type);

}