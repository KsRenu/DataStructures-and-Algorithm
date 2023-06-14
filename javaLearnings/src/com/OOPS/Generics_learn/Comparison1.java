package com.OOPS.Generics_learn;

public class Comparison1 {
    int n1,n2;
    public Comparison1(int n1,int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    Comparison1 c2 = new Comparison1(23,545);
    int compareTo(Comparison1 c1){
        System.out.println(c1.n1);
        System.out.println(c2.n1);

        return c1.n1 - c2.n1;
    }
}

