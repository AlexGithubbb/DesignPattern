package com.alexpower.factory.absfactory;

import java.util.Scanner;

public class OrderPizza {
    Pizza pizza;
    String orderType;

    public OrderPizza(PizzaFactory pizzaFactory) {
        setFactory(pizzaFactory);
    }

    public void setFactory(PizzaFactory factory) {
        do {
            orderType = this.getOrderType();
            // this.factory could be TorontoFac instance or MontrealFac instance
            pizza = factory.createPizza(orderType);
//            pizza = pizzaFactory.createPizza(orderType);
            if (pizza != null) {
                pizza.prepare();
                pizza.cook();
                pizza.cut();
                pizza.pack();
                System.out.println("order done");
            } else {
                break;
            }
        } while (true);
    }

    public static String getOrderType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your fav pizza type");
        String type = scanner.nextLine();
        return type;
    }
}
