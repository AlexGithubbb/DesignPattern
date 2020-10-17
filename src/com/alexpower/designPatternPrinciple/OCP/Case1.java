package com.alexpower.designPatternPrinciple.OCP;
/*
*1) 最基础，也最重要的原则
* 2) 类，模块和函数应该对扩展（提供者）开放，对修改（使用者）关闭。用抽象构建框架，用实现扩展细节
* 3) 当软件需要变化时，尽量通过扩展软件实体的行为来实现变化，而不是通过修改已有的代码来实现变化。
* */
public class Case1 {
    public static void main(String[] args) {
        Circle circle = new Circle();
        DrawShape drawShape = new DrawShape();
        drawShape.draw(circle);
        drawShape.draw(new Triangle());
        drawShape.draw(new Rectangular());

    }
}
// 提取公共方法
interface IShape{
    public void draw();
}

// 使用方（不变）
class DrawShape{
    public void draw(IShape shape){
        shape.draw();
    }
}

class Triangle implements IShape{

    @Override
    public void draw() {
        System.out.println("Drawing Triangle...");
    }
}

class Rectangular implements IShape{

    @Override
    public void draw() {
        System.out.println("Drawing Rectangular...");
    }
}
// 提供方（扩展图形Shape）
class Circle implements IShape{
    @Override
    public void draw() {
        System.out.println("Drawing Circle...");
    }
}
