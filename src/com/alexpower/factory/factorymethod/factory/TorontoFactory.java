package com.alexpower.factory.factorymethod.factory;

import com.alexpower.factory.factorymethod.Pizza;
import com.alexpower.factory.factorymethod.PizzaFactory;
import com.alexpower.factory.factorymethod.pizza_type.GreekPizza;
import com.alexpower.factory.factorymethod.pizza_type.ItalyPizza;

public class TorontoFactory extends PizzaFactory {

    @Override
    public Pizza createPizza(String orderType) {
        // initialize pizza
        Pizza pizza = null;
        System.out.println("using factory method mode~~");
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("Greek Pizza in Toronto branch store");
        } else if ("italy".equals(orderType)) {
            pizza = new ItalyPizza();
            pizza.setName("Italy Pizza in Toronto branch store");
        } else {
            System.out.println("Sorry, we don't have " + orderType + " pizza in Toronto branch store, please put your order again");
        }
        return pizza;
    }
}
