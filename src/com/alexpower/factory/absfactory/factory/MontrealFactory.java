package com.alexpower.factory.absfactory.factory;

import com.alexpower.factory.absfactory.Pizza;
import com.alexpower.factory.absfactory.PizzaFactory;
import com.alexpower.factory.absfactory.pizza_type.GreekPizza;
import com.alexpower.factory.absfactory.pizza_type.ItalyPizza;

public class MontrealFactory implements PizzaFactory {

    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza = null;
        System.out.println("using abs factory mode~~");
        if ("greek".equals(orderType)) {
            pizza = new GreekPizza();
            pizza.setName("Greek Pizza in Montreal branch store");
        } else if ("italy".equals(orderType)) {
            pizza = new ItalyPizza();
            pizza.setName("Italy Pizza in Montreal branch store");
        } else {
            System.out.println("Sorry, we don't have " + orderType + " pizza in Montreal branch store, please put your order again");
        }
        return pizza;
    }
}
