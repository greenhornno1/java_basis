package com.company;

public class InitializerBlock {

    /**
     * What if we want to execute some code for every object?  Initializer Block
     * https://www.geeksforgeeks.org/instance-initialization-block-iib-java/
     * InitializerBlock will execute once while new an Object
     * Constructor can be overload with different input
     * Initializer block : contains the code that is always executed whenever an instance is created. It is used to declare/initialize the common part of various constructors of a class.
     * Constructors : are used to initialize the object's state
     * */
    // InitializerBlock test2, test3;
    // test2 = new InitializerBlock(10);
    // test3 = new InitializerBlock();

    // Initializer block starts..
    {
        //This code is executed before every constructor.
        System.out.println("Common part of constructors invoked");
    }
    // Initializer block ends

    InitializerBlock(){
        System.out.println("Default Constructor invoked.");
    }

    InitializerBlock(int x){
        System.out.println("Parameterized constructor invoked");
    }
}
