package com.OOPS.Interface;

public class Main {
    public static void main(String[] args) {
        Child c1 = new Child();
        c1.fatherOccupation();
        c1.motherOccupation();
        c1.fatherSavings();
        c1.motherSavings();
        c1.common();

        Father F = new Child();
        F.fatherOccupation();

        //Child c2 = new Father();
        //c2.motherSavings();
    }

}
