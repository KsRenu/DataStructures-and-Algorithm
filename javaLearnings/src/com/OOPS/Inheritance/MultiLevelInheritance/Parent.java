package com.OOPS.Inheritance.MultiLevelInheritance;

public class Parent {
    String p1;
    String p2;
    public Parent(String p1, String p2){
        this.p1 = p1;
        this.p2 = p2;
    }

    public Parent() {
    }


    void display(){
        System.out.println("P1: "+p1);
        System.out.println("P2: "+p2);
    }
}
