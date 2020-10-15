package com.alexpower.factory.simplefactory.pizza_type;

import com.alexpower.factory.simplefactory.Pizza;

public class ItalyPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Italy Pizza ingredients: .........");
    }
}
