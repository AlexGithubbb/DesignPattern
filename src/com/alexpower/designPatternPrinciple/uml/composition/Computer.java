package com.alexpower.designPatternPrinciple.uml.composition;

/*
 * 组合关系， 描述整体和部分的关系，组件不可拆分
 * */
public class Computer {
    private Mouse mouse = new Mouse(); // 在new Computer 的时候也会创建一个新的 Mouse 对象
    private Monitor monitor = new Monitor(); //在new Computer 的时候也会创建一个新的 Monitor 对象

    public void setMouse(Mouse mouse) {
        this.mouse = mouse;
    }

    public void setMonitor(Monitor monitor) {
        this.monitor = monitor;
    }
}

class Mouse{}

class Monitor{}

/*
*
依赖 dependency， 关联 association ， 泛化（继承） generalization， 实现 realization，
聚合（可拆分- 电脑：鼠标，显示器； 人： 衣服）aggregation，
组合（不可拆分- 电脑： CPU；人，肢体） composition
* */