package com.implementation.Stack;

import java.util.Stack;

public class StackClass {
    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        System.out.println(s);
        s.pop();
        System.out.println(s);



    }



}