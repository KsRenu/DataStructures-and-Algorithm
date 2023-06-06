package com.basics;

import java.sql.SQLOutput;
import java.util.Scanner;

public class ClassesAndObjects {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = in.nextLine();
        System.out.println("Enter your age: ");
        int age = in.nextInt();
        in.nextLine();
        System.out.println("Enter your rollNo: ");
        String rollNo = in.nextLine();
        System.out.println("Placement status; ");
        String isPlaced = in.nextLine();

        Myself obj = new Myself(name, age, rollNo, isPlaced);

        System.out.println("Your name is: "+ obj.name);
        System.out.println("Your age is : " + obj.age);
        System.out.println("Your rollNo is : " + obj.rollNo);
        System.out.println("Placement status: "+ obj.isPlaced);

        
    }
    
    static class Myself{
        String name;
        int age;
        String rollNo;
        String isPlaced;
        Myself(String name, int age,String rollNo,String isPlaced){
            this.name = name;
            this.age = age;
            this.rollNo = rollNo;
            this.isPlaced = isPlaced;
        }
    }
}
