package com.basico.wrapper;


public class Ambas {
    public static void main(String[] args) {
        // autoboxing
        Integer aObj =  new Integer(56);

        System.out.println(aObj);



        // unboxing
        int a = aObj;
        a = 50;

        System.out.println(a);
    }
}
