package com.alexpower.factory.factorymethod.pizza_type;

import com.alexpower.factory.factorymethod.Pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare Greek pizza ingredients: garlic, greek cheese,.....");
    }
}
