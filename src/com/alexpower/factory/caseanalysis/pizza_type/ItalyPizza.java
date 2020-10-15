package com.alexpower.factory.caseanalysis.pizza_type;

import com.alexpower.factory.caseanalysis.Pizza;

public class ItalyPizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("prepare Italy Pizza ingredients: .........");
    }
}
