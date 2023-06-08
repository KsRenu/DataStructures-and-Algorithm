package com.OOPS.Inheritance.superKeyword;

public class Child extends Parent {
    int checkVar1=2;
    public Child() {
        //super();
        System.out.println("Inside the Child Constructor");
    }
    void checkMethod(){
        System.out.println("Function inside Child");
    }
    void display(){
        System.out.println("Value of checkVar1 in Child is: "+checkVar1);
        System.out.println("Value of checkVar1 in Parent is: "+super.checkVar1);
        checkMethod();
        super.checkMethod();
    }
}
