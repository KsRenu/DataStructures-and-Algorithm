package com.OOPS.LambdaFunctions_learn;

public class LambdaFunctions {
    public static void main(String[] args) {
        Operation sum = (a,b)->a+b;
        Operation sub = (a,b) -> a-b;
        Operation prod = (a,b) -> a*b;

        LambdaFunctions myCalculator = new LambdaFunctions();
        System.out.println(myCalculator.operate(3,4,sum));
        System.out.println(myCalculator.operate(3,4,sub));
        System.out.println(myCalculator.operate(3,4,prod));


      //  int[] ar = {1,2,3,4,5,6,7,8,9};
      //  ar.forEach((int item)-> System.out.println(item*2));
    //}

    private int operate(int a, int b, Operation op){
        return op.operation(a,b);
    }

}

interface Operation{
    int operation(int a,int b);
}