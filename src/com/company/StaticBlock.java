package com.company;

public class StaticBlock {
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
