package com.alexpower.factory.simplefactory;

import com.alexpower.factory.simplefactory.pizza_type.GreekPizza;
import com.alexpower.factory.simplefactory.pizza_type.ItalyPizza;

public class PizzaFactory {

    // return pizza depends on type
    public Pizza createPizza(String orderType){
        // initialize pizza
        Pizza pizza = null;

        System.out.println("using simple factory mode~~");
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("Greek Pizza");
            } else if ("italy".equals(orderType)) {
                pizza = new ItalyPizza();
                pizza.setName("Italy Pizza");
            } else{
                System.out.println("Sorry, we don't have " + orderType + " pizza, please put your order again");
            }
        return pizza;
    }
}
