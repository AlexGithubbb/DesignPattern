package com.alexpower.factory.OSdemo;

public class OrderOS {
    public static void main(String[] args) {
        OSFactory osFactory = new OSFactory();
        OSInterface secureOS = osFactory.getOSFactory("secureOS");
        secureOS.spec();
        OSInterface powerfulOS = osFactory.getOSFactory("powerfulOS");
        powerfulOS.spec();

    }
}
