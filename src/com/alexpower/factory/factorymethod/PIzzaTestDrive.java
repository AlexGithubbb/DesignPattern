package com.alexpower.factory.factorymethod;

import com.alexpower.factory.factorymethod.stores.NYPizzaStore;

public class PIzzaTestDrive {

    public static void main(String[] args) {
        NYPizzaStore nyPizzaStore = new NYPizzaStore();
        Pizza pizza = nyPizzaStore.orderPizza("cheese");
        System.out.println("Eden ordered a " + pizza.getName());
    }


}
