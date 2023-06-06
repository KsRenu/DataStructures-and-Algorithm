package com.basics;
import java.util.*;
public class Methods {
    public static void main(String[] args) {

        char[] letters = {'A','A','A','B','C','D','D','D','D','E'};
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the character to find the count from the array of "+ Arrays.toString(letters)+": ");
        char search = in.next().charAt(0);
        int count = countOccurences(letters, search );
        System.out.println(search+ " occurs "+ count+" times in this array of letters");


    }

    public static int countOccurences(char[] letters, char search){
        int count=0;
        for(char letter:letters){
            if (search==letter){
                count+=1;
            }

        }
        return count;
    }
}
