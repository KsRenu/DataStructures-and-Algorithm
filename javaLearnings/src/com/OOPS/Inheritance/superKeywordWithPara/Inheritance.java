package com.OOPS.Inheritance.superKeywordWithPara;

public class Inheritance{
    public static void main(String[] args) {
        String p1 = "Parent1";
        String p2 = "Parent2";
        String c1 = "Child1";
        String c2 = "Child2";

        Child cobj1 = new Child(c1,c2);
        cobj1.display();
        System.out.println();
        Child cobj2 = new Child(p1,p2,c1,c2);
        cobj2.display();




    }
}

