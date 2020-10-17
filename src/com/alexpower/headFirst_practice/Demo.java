package com.alexpower.headFirst_practice;

/*
* practice from Head First p232: Chapter 8: polymorphism
*
* */
public class Demo extends Clowns{
    public static void main(String[] args) {
        Nose[] i = new Nose[3];
        i[0] = new Acts();
        i[1] = new Clowns();
        i[2] = new Demo();

        for (int j = 0; j < 3; j++) {
            System.out.println(i[j].iMethod() + " " + i[j].getClass());
        }
    }
}

interface Nose{
    public int iMethod();
}

abstract class Picasso implements Nose{
    @Override
    public int iMethod() {
        return 7;
    }
}

class Clowns extends Picasso{}

class Acts implements Nose{
    @Override
    public int iMethod() {
        return 5;
    }
}
