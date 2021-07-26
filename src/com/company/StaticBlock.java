package com.company;

public class StaticBlock {
    /**
     * What if we want to execute some code once for all objects of a class? Static Blocks
     * Here tested static block and class default constructor
     * A class could have any number of static initialization blocks
     * and they can appear anywhere in the class body
     * static block calls before constructor
     * static can use without new an Object
     * static means the memory allocation in the same class is the same.
     * */
    // execute in main :
    // System.out.println(StaticBlock.i);
    // System.out.println(StaticBlock.j);
    // StaticBlock test1 = new StaticBlock();


    static int i;
    static String j;

    StaticBlock(){
        System.out.println("Default Constructor");
    }

    static{
        i = 10;
        System.out.println("Static Block Called");
    }

    static{
        j = "This is second static block";
        System.out.println(j + " in sec");
    }


}
