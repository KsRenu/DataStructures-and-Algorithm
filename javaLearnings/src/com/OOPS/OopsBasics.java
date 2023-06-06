package com.OOPS;

public class OopsBasics {

    static int a =5;
    static int b=10;

    static {
        System.out.println("I am in static block");
        b=a*5;
    }
    public static void main(String[] args) {
        OopsBasics obj = new OopsBasics();
        System.out.println(OopsBasics.a+" "+OopsBasics.b);
        OopsBasics.b+=10;
        System.out.println(OopsBasics.a+" "+OopsBasics.b);
        OopsBasics obj3 = new OopsBasics();
        System.out.println(OopsBasics.a+" "+OopsBasics.b);

        A obj1 = new A();
        A obj2 = new A();
        System.out.println(A.var1);//notice the classname.varname format
        System.out.println(A.var1);
        System.out.println(obj1.var1);

    }

    static class A{
        static int var1=0;

        A(){
           var1+=1;
        }
    }
}
