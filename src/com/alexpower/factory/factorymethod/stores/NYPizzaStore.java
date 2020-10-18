package com.alexpower.factory.factorymethod.stores;

import com.alexpower.factory.factorymethod.Pizza;
import com.alexpower.factory.factorymethod.PizzaStore;
import com.alexpower.factory.factorymethod.pizza.NYStyleCheesePizza;
import com.alexpower.factory.factorymethod.pizza.NYStyleVeggiePizza;

public class NYPizzaStore extends PizzaStore {

    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new NYStyleCheesePizza();
        }else if ("veggie".equals(type)){
            return new NYStyleVeggiePizza();
        }else{
            return null;
        }
    }
}
