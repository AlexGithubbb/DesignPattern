package com.alexpower.factory.simplefactory.pizza_type;

import com.alexpower.factory.simplefactory.Pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare Greek pizza ingredients: garlic, greek cheese,.....");
    }
}
