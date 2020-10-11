package com.alexpower.DependencyInversion;

/*
* 3 ways to apply Dependency Inversion:
*  A: interface
*  B: Constructor
*  C: setter()
*
* */
public class Case3 {
    public static void main(String[] args) {
        // method 1
        /*OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.open(new Hair());*/

        // method 2
        /*OpenAndClose openAndClose = new OpenAndClose(new Hair());
        openAndClose.open();*/

        // method 3
        OpenAndClose openAndClose = new OpenAndClose();
        openAndClose.setTV(new Hair());
        openAndClose.open();
    }
};
// ---------------------------------------------------------------------------------------
// method 1: 通过接口实现依赖
/*interface IOpenAndClose {
    public void open(ITV tv);
}

interface ITV{
    public void play();
}

class Hair implements ITV{

    @Override
    public void play() {
        System.out.println("Hair TV is playing...");
    }
}

class OpenAndClose implements IOpenAndClose{

    @Override
    public void open(ITV tv) {
        tv.play();
    }
}*/

// ---------------------------------------------------------------------------------------

// method 2: 通过构造器实现依赖
/*interface IOpenAndClose {
    public void open();
}

interface ITV{
    public void play();
}

class Hair implements ITV{

    @Override
    public void play() {
        System.out.println("Hair TV is playing...");
    }
}

class OpenAndClose implements IOpenAndClose{
    public ITV tv;

    public OpenAndClose(ITV tv){
        this.tv = tv;
    }


    @Override
    public void open() {
        this.tv.play();
    }
}*/

// ---------------------------------------------------------------------------------------

// method 3: 通过 Set() 进行依赖传递
interface IOpenAndClose {
    public void open();

    public void setTV(ITV tv);
}

interface ITV{
    public void play();
}

class Hair implements ITV{

    @Override
    public void play() {
        System.out.println("Hair TV is playing...");
    }
}

class OpenAndClose implements IOpenAndClose{
    ITV tv;

    @Override
    public void open() {
        tv.play();
    }

    @Override
    public void setTV(ITV tv) {
        this.tv = tv;
    }
}

