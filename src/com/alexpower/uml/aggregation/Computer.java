package com.alexpower.uml.aggregation;

/*
* 聚合关系， 描述整体和部分的关系，组件可拆分
* */
public class Computer {
    private Mouse mouse; // mouse 可以拆
    private Monitor monitor; // monitor 可以拆

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

class Mouse{}

class Monitor{}