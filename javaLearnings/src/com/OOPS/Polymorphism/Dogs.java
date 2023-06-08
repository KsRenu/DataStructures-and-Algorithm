package com.OOPS.Polymorphism;

public class Dogs {

    public static void main(String[] args) {
        Dog1 d1 = new Dog1();
        Dog2 d2 = new Dog2();
        Dog3 d3 = new Dog3();

        Dogs d4 = new Dog1();

        Dogs d5 = new Dog3();//static class

        d1.barking();
        d2.barking();;
        d3.barking();
        d4.barking();
        d5.check();//static class functionality - it doesn't print d5 value like in d4



    }

     //final void barking() {
     void barking() {
         System.out.println("All dogs are barking.");
    }
    static void check(){
        System.out.println("Check is inside the Dogs class");
    }
}
