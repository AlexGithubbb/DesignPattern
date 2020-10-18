package com.alexpower.factory.factorymethod;

import java.util.ArrayList;

public abstract class Pizza {
    public String name;
    public String dough;
    public String sauce;
    public ArrayList toppings = new ArrayList<>();

    public void prepare() {
        System.out.println("preparing " + name + " ...");
        System.out.println("adding dough and sauce...");
        System.out.println("adding toppings:");
        for (int i = 0; i < toppings.size(); i++) {
        System.out.println(toppings.get(i));
        }
    }

    public void cook() {
        System.out.println("bake for 25 mins at 200 Celsius degree");
    }

    public void cut() {
        System.out.println("Cutting the pizza into diagonal slices");
    }

    public void box() {
        System.out.println("Place pizza in official PizzaStore box");
    }

    public String getName(){
        return name;
    }

    @Override
    public String toString() {
        return "Pizza{" +
                "name='" + name + '\'' +
                ", dough='" + dough + '\'' +
                ", sauce='" + sauce + '\'' +
                ", toppings=" + toppings +
                '}';
    }
}
