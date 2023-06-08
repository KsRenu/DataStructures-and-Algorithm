package com.OOPS.Inheritance.superKeywordWithPara;

public class Child extends Parent {
    String c1;
    String c2;

    public Child(String p1, String p2, String c1, String c2) {
        super(p1, p2);
        this.c1 = c1;
        this.c2 = c2;
    }

    Child(String c1, String c2){
        this.c1 = c1;
        this.c2 = c2;
    }


    void display(){
        System.out.println("c1: "+c1);
        System.out.println("c2: "+c2);

        super.display();
    }
}
