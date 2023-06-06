package com.basics;

import java.util.Scanner;

public class ConditionalStatements {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int age =in.nextInt();
        if(age>=18){
            System.out.println("Adult");
        }
        else if((age<=5)&&(age!=0)){
            System.out.println("Baby");
        }
        else{
            System.out.println("Children");
        }


        //ternary condition
        String message = (age>=18)?"Adult":"Children";
        System.out.println(message);

        //switch statemetns
        in.nextLine();
        String gender= in.nextLine();
        switch(gender.toLowerCase()){
            case "female":
                System.out.println('f');
                break;
            case "male":
                System.out.println('m');
                break;
            default:
                System.out.println("Not mentioned");
        }

    }
}
