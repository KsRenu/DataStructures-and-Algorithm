package com.basics;

public class StringClass {
    public static void main(String[] args) {
        String name = new String("Renu");
        System.out.println(name.toUpperCase());
        System.out.println(name.toLowerCase());
        System.out.println(name.charAt(0));
        System.out.println(name.contains("nu"));
        String name1= "Renu";
        System.out.println(name1.equals(name1));
    }
}
