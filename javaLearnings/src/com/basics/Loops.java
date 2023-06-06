package com.basics;

import java.util.Arrays;

public class Loops {
    public static void main(String[] args) {
        int[] numbers=new int[100];
        int i=0;
        for(i=0;i<100;i++){
            numbers[i]=i;
        }

        //enhanced for loop
        for(int number: numbers){
            //System.out.println(number);
        }
        //System.out.println(Arrays.toString(numbers));

        //System.out.println("Advanced: ");
        //Arrays.stream(numbers).forEach(System.out::println);

        int count =0;
        while(count<=20){
            //System.out.println(count);
            count++;
        }

        int count1=0;
        do{
            System.out.println(count1);
            count1++;
        }
        while(count1<=20);

    }
}
