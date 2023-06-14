package com.OOPS.Interface;

public class Child implements Father, Mother {

    @Override
    public void fatherOccupation() {
        System.out.println("Father Occupation");

    }

    @Override
    public void fatherSavings() {
        System.out.println("Father Savings");

    }

    @Override
    public void motherOccupation() {

        System.out.println("Mother Occupation");
    }

    @Override
    public void motherSavings() {
        System.out.println("Mother Savings");

    }

    @Override
    public void common(){
        System.out.println("From common");
    }
}
