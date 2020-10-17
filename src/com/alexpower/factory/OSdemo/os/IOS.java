package com.alexpower.factory.OSdemo.os;

import com.alexpower.factory.OSdemo.OSInterface;

public class IOS implements OSInterface {
    @Override
    public void spec() {
        System.out.println("the most secured OS ever!");
    }
}
