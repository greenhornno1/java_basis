package com.company;

public class InitializerBlock {
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
