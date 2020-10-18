package com.alexpower.factory.factorymethod.pizza;

import com.alexpower.factory.factorymethod.Pizza;

import java.util.ArrayList;

public class NYStyleVeggiePizza extends Pizza {
    private String name;
    private String dough;
    private String sauce;
    private ArrayList toppings = new ArrayList<>();


    public NYStyleVeggiePizza() {
        name = "NY Style Sauce and Cheese Pizza";
        dough = "Thin Crust Dough";
        sauce = "Plum Tomato Sauce";
        toppings.add("Shredded Mozzarella Cheese");
    }
}
