package com.alexpower.factory.simplefactory;

public class PizzaStore {
    public static void main(String[] args) {
        new OrderPizza(new PizzaFactory());
        System.out.println("order process terminated");
    }
}
