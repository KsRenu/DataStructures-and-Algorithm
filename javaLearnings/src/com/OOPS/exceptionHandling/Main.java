package com.OOPS.exceptionHandling;

public class Main {
    public static void main(String[] args) {
        int a=5;
        int b=0;
        try{
            divide(a,b);
            //int c =a/b;
        }catch(Exception e){
            System.out.println(e.getMessage());
        } finally{
            System.out.println("This will run always");
        }
    }
    static int divide(int a,int b)throws ArithmeticException{
        if(b==0){
            throw new ArithmeticException("B shouldn't be zero");
        }
        return a/b;
    }
}
