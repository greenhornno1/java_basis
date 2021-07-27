package com.company;

public class extendsAndSuper {

}

/**
 * https://www.geeksforgeeks.org/instance-initialization-block-iib-java/
 * https://www.runoob.com/java/java-override-overload.html
 *
 * */

// B b = new B();

class A{
    A(){
        System.out.println("A Constructor Called");
    }
    {
        System.out.println("A Instance Initialization Block");
    }
    public int toLeft(int y){
        return y<<=1;
    }
}

class B extends A{
    B(){
        super();
        System.out.println("B Constructor Called");
        // call to super must be first statement in constructor
        // super();
    }
    {
        System.out.println("B Instance Initialization Block");
    }
    public long toLeft(){
        return 1;
    }

}
