package com.alexpower.factory.absfactory;

import com.alexpower.factory.absfactory.factory.MontrealFactory;
import com.alexpower.factory.absfactory.factory.TorontoFactory;

import java.util.Scanner;

public class PizzaStore {
    public static void main(String[] args) {
        System.out.println("Please insert which city you are in");
        Scanner scanner = new Scanner(System.in);
        String city = scanner.nextLine();
        if ("Toronto".equals(city)) {
            new OrderPizza(new TorontoFactory());
        } else if ("Montreal".equals(city)) {
            new OrderPizza(new MontrealFactory());
        }
        System.out.println("order process terminated");
    }
}
