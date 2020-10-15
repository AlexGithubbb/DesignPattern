package com.alexpower.factory.absfactory.pizza_type;

import com.alexpower.factory.absfactory.Pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare Greek pizza ingredients: garlic, greek cheese,.....");
    }
}
