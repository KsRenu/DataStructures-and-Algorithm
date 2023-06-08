package com.OOPS.Polymorphism;

public class Dog3 extends Dogs{

    //final void barking(){ //no use of final here as final in parent will affect the child not the final in child will affect the parent
    void barking(){
        System.out.println("Dog3 is barking here..!");
    }
    static void check(){
        System.out.println("Check is inside the Dog3 class");
    }
}
