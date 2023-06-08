package com.OOPS.Inheritance.MultiLevelInheritance;

public class Inheritance{
    public static void main(String[] args) {
        String p1 = "Parent1";
        String p2 = "Parent2";
        String c1 = "Child1";
        String c2 = "Child2";
        String gc1 = "Grand children1";
        String gc2 = "Grand children2";

        System.out.println("Call using child and its constructor");
        Child cobj1 = new Child(c1,c2);
        cobj1.display();
        System.out.println("Call using child with passing parent's constructor");
        Child cobj2 = new Child(p1,p2,c1,c2);
        cobj2.display();
        System.out.println("Call using Grandchild with its  constructor");
        GrandChild gcobj1 = new GrandChild(gc1,gc2);
        gcobj1.display();
        System.out.println("Call using grandchild and child's constructor: ");
        GrandChild gcobj2 = new GrandChild(c1,c2,gc1,gc2);
        gcobj2.display();
        System.out.println("Call using grandchildren and parent's constructor: ");
        GrandChild gcobj3 = new GrandChild(p1,p2,c1,c2,gc1,gc2);
        gcobj3.display();
        System.out.println("Calling parent from grandchild: ");
        GrandChild gcobj4 = new GrandChild(p1,p2,gc1,gc2);
        gcobj4.display();

    }
}

