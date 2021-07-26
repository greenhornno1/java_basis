package com.company;

public class extendsAndSuper {

}

/**
 * https://www.geeksforgeeks.org/instance-initialization-block-iib-java/
 *
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
}
