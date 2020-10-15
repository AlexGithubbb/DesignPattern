package com.alexpower.factory.caseanalysis;

import com.alexpower.factory.caseanalysis.pizza_type.GreekPizza;
import com.alexpower.factory.caseanalysis.pizza_type.ItalyPizza;

import java.util.Scanner;

public class OrderPizza {
    String orderType;
    Pizza pizza = null;

    public OrderPizza() {
        do {
            orderType = getOrderType();
            if ("greek".equals(orderType)) {
                pizza = new GreekPizza();
                pizza.setName("Greek Pizza");
            } else if ("italy".equals(orderType)) {
                pizza = new ItalyPizza();
                pizza.setName("Italy Pizza");
            } else {
                System.out.println("Sorry, we don't have " + orderType + " pizza, please put your order again");
                break;
            }
            pizza.prepare();
            pizza.cook();
            pizza.cook();
            pizza.pack();
        } while (true);
    }

    public String getOrderType() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please insert your fav pizza type");
        String type = scanner.nextLine();
        return type;
    }
}
