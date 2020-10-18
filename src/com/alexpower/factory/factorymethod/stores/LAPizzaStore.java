package com.alexpower.factory.factorymethod.stores;

import com.alexpower.factory.factorymethod.Pizza;
import com.alexpower.factory.factorymethod.PizzaStore;
import com.alexpower.factory.factorymethod.pizza.LAStyleCheesePizza;
import com.alexpower.factory.factorymethod.pizza.LAStyleVeggiePizza;

public class LAPizzaStore extends PizzaStore {
    @Override
    protected Pizza createPizza(String type) {
        if("cheese".equals(type)){
            return new LAStyleCheesePizza();
        }else if ("veggie".equals(type)){
            return new LAStyleVeggiePizza();
        }else{
            return null;
        }
    }

}
