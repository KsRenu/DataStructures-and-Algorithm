package com.basics;

import java.time.LocalDate;

public class ReferenceTypes {
    public static void main(String[] args) {
        String name = new String("Renu");
        System.out.println(name.toUpperCase());
        LocalDate now = LocalDate.now();
        System.out.println(now.getMonth());
    }
}
