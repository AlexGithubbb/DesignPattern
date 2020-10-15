package com.alexpower.factory.simplefactory;

import java.util.Scanner;

public class OrderPizza {
//    PizzaFactory pizzaFactory;
    Pizza pizza;
    String orderType;

    public OrderPizza(PizzaFactory pizzaFactory){
        setFactory(pizzaFactory);
    }

    public void setFactory(PizzaFactory pizzaFactory) {
//        this.pizzaFactory = pizzaFactory;
        do {
            orderType = this.getOrderType();
//            pizza = this.pizzaFactory.createPizza(orderType);
            pizza = pizzaFactory.createPizza(orderType);
            if(pizza != null){
                pizza.prepare();
                pizza.cook();
                pizza.cook();
                pizza.pack();
                System.out.println("order done");
            }else{
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
