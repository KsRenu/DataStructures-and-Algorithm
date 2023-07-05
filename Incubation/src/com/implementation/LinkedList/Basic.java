package com.implementation.LinkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

class Student{
    int id;
    String name;
    String Year;
    char section;

    public Student(int id, String name, String year, char section) {
        this.id = id;
        this.name = name;
        Year = year;
        this.section = section;
    }
}

public class Basic {

    public static void main(String[] args) {
        ArrayList<Student> all = new ArrayList<Student>();
        Student s1 = new Student(1,"name1","III",'A');
        Student s2 = new Student(2,"name2","III",'A');
        Student s3 = new Student(3,"name3","III",'A');
        Student s4 = new Student(4,"name4","III",'A');
        Student s5 = new Student(5,"name5","III",'A');
        System.out.println(all);
        all.add(s1);
        all.add(s2);
        all.add(s3);
        all.add(s4);
        all.add(s5);
        all.add(3,s1);
        for (Student s:all ) {
            System.out.println(s.id+" "+s.name+" "+s.Year+" "+s.section);
        }

        LinkedList<Integer>l2 = new LinkedList<>();
        l2.add(1);
        l2.addFirst(0);
        l2.addLast(2);
        System.out.println(l2.getFirst());
        System.out.println(l2.getLast());
        System.out.println(l2.removeFirst());
        System.out.println(l2.removeFirst());

    }

}
