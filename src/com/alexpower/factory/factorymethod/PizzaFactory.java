package com.alexpower.factory.factorymethod;

import com.alexpower.factory.factorymethod.pizza_type.GreekPizza;
import com.alexpower.factory.factorymethod.pizza_type.ItalyPizza;

public abstract class PizzaFactory {

    // return pizza depends on type
    public abstract Pizza createPizza(String orderType);
}
