package com.alexpower.factory.factorymethod.pizza_type;

import com.alexpower.factory.factorymethod.Pizza;

public class ItalyPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Italy Pizza ingredients: .........");
    }
}
