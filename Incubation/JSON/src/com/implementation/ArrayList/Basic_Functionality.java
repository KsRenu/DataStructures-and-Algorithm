package com.implementation.ArrayList;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Basic_Functionality {
    public static void main(String[] args) {
        List<Integer> l1 = new LinkedList<>();
        for (int i = 10; i < 20; i++) {
            l1.add(i);
        }
        System.out.println(l1);

        List<Integer>l2= new ArrayList<>(l1);
        for (int i = 0; i < 10; i++) {
            l2.add(i);
        }
        System.out.println(l2);

        l1.addAll(l2);
        System.out.println(" l1 and l2: "+l1);
        System.out.println("Accessing item: "+l1.get(0));
        System.out.println("Modifying item: ");
        l1.set(0,50);
        System.out.println("After modification: ");
        System.out.println(l1);
        System.out.println("Removing 50");
        l1.remove(0);
        System.out.println(l1);
        System.out.println("Size of Arraylist: "+l1.size());
        System.out.println("Clearing l1 ");
        l1.clear();
        System.out.println("After clearing: ");
        System.out.println(l1);
    }


}
