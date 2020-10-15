package com.alexpower.factory.absfactory;

public interface PizzaFactory {
    // return pizza depends on type
    public abstract Pizza createPizza(String orderType);
}
