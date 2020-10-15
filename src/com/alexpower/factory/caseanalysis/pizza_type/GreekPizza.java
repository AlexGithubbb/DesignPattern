package com.alexpower.factory.caseanalysis.pizza_type;

import com.alexpower.factory.caseanalysis.Pizza;

public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("prepare Greek pizza ingredients: garlic, greek cheese,.....");
    }
}
