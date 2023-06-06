package com.basics;

public class MemoryAccess {
    public static void main(String[] args) {
        int a=10;
        int b=1;

        System.out.println("Before change: "+a+"  "+b);
        a = 100;
        System.out.println("after change: "+a+"  "+b);

        Person name1 = new Person("name1");
        Person name2 = name1;

        System.out.println("Before change: "+name1.name+"  "+name2.name);

        name1.name = "name3";
        System.out.println("after change: "+name1.name+"  "+name2.name);

    }

    static class Person{
        String name;

        Person(String name){
            this.name = name;
        }
    }
}
