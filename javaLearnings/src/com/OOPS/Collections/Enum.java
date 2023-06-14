package com.OOPS.Collections;

public class Enum {
    enum Week{
        monday,tuesday,wednesday,thursday,friday,saturday,sunday;

        Week(){
            System.out.println("Constructor called for "+ this);
        }
    }

    public static void main(String[] args) {
        Week week;
        week = Week.monday;

        for(Week day: Week.values()){
            System.out.println(day);
        }
        System.out.println(week.ordinal());
    }
}
