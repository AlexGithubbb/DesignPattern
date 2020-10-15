package com.alexpower.factory.absfactory.pizza_type;

import com.alexpower.factory.absfactory.Pizza;

public class ItalyPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Italy Pizza ingredients: .........");
    }
}
