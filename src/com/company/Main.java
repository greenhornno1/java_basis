package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /**
         * What if we want to execute some code once for all objects of a class? Static Blocks
         * Here tested static block and class default constructor
         * A class could have any number of static initialization blocks
         * and they can appear anywhere in the class body
         * static block calls before constructor
         * static can use without new an Object
         * static means the memory allocation in the same class is the same.
         * */
        // System.out.println(StaticBlock.i);
        // System.out.println(StaticBlock.j);
        // StaticBlock test1 = new StaticBlock();

        /**
         * What if we want to execute some code for every object?  Initializer Block
         * https://www.geeksforgeeks.org/instance-initialization-block-iib-java/
         * InitializerBlock will execute once while new an Object
         * Constructor can be overload with different input
         * Initializer block : contains the code that is always executed whenever an instance is created. It is used to declare/initialize the common part of various constructors of a class.
         * Constructors : are used to initialize the object's state
         * */
        InitializerBlock test2, test3;
        test2 = new InitializerBlock(10);
        test3 = new InitializerBlock();
    }
}
