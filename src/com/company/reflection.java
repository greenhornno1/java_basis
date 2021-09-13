package com.company;

public class reflection {

    Class clz = Class.forName("java.lang.String");

    Class clz2 = String.class;

    String str = new String("yessss");
    Class clz3 = str.getClass();
}
