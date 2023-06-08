package com.OOPS.Encapsulation;

public class Child extends Parent{

    void display(){
        System.out.println(super.getNum());
        System.out.println( super.a);
        //System.out.println(super.num);
    }
}
