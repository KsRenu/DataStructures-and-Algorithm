package com.OOPS.Inheritance.MultiLevelInheritance;

public class GrandChild extends Child{

    String gc1;
    String gc2;
    GrandChild(String gc1, String gc2) {
        this.gc1=gc1;
        this.gc2=gc2;
    }

    public GrandChild(String c1, String c2, String gc1, String gc2) {
        super(c1, c2);
        this.gc1 =gc1;
        this.gc2 = gc2;
    }

    public GrandChild(String p1,String p2, String c1, String c2, String gc1, String gc2) {
        super(p1,p2,c1, c2);
        this.gc1 =gc1;
        this.gc2 = gc2;
    }


    void display() {

        System.out.println("GC1: "+gc1);
        System.out.println("GC2: "+gc2);
        super.display();

    }
}
