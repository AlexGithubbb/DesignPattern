package com.alexpower.factory.OSdemo.os;

import com.alexpower.factory.OSdemo.OSInterface;

public class Andriod implements OSInterface {
    @Override
    public void spec() {
        System.out.println("Most popular OS ever!");
    }
}
