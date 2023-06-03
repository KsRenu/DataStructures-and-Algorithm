package dsaLearning;

import java.util.Scanner;

public class primitiveDataTypes {
    public static void main(String[] args) {
        int a =2;
        char letter = 'c';
        float b = 1.2f;
        double largeDecimalNumbers = 749384320.49834;
        long largeInteger = 7483974823492L;


        System.out.print("Please enter some input: ");
        Scanner input = new Scanner(System.in);
//        int value= input.nextInt();
//        System.out.println("The vlaue entered is : " + value);

        //typecasting narrowing the data
        int n1= (int)(43.98f);
        System.out.println(n1);

        //automatic type promotion in expression
        int n2 =257;
        byte n3 = (byte)(n2);
        System.out.println(n3);
        byte n4 = 45;
        byte n5 = 100;
        int n6 = n4 * n5 / 100;
        System.out.println(n6);


    }
}
