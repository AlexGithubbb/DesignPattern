package com.alexpower.factory.factorymethod.pizza;

import com.alexpower.factory.factorymethod.Pizza;

public class NYStyleCheesePizza extends Pizza {


    public NYStyleCheesePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Marinara Sauce";
        toppings.add("Grated Reggiano Cheese");
    }

    @Override
    public String toString() {
        return "NYStyleCheesePizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
