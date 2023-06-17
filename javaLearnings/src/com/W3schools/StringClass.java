package com.W3schools;

public class StringClass {
    public static void main(String[] args) {
        String name = "renu";
        String name1 = "Monkey";
        System.out.println(name.length());
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());
        System.out.println(name.indexOf('e'));
        System.out.println(name.charAt(3));
        System.out.println(name.codePointAt(0));
        System.out.println(name.codePointCount(0,3));
        System.out.println(name.compareTo(name1));
        System.out.println(name.concat(name1));
        System.out.println(name.contentEquals(name1));
        String name2 = "";
        name2 = name2.copyValueOf(name.toCharArray(),0,4);
        System.out.println(name2);
        System.out.println(name2.endsWith("y"));
        String name3 = "RENU";
        System.out.println(name.compareToIgnoreCase(name3));
        System.out.println(name.hashCode());
        //System.out.println(name.isEmpty());
        System.out.println(name.lastIndexOf("u"));
        System.out.println(name1.replace("M","m"));
        String name4="hey all lets check";
        System.out.println(name4.trim());
        int time = 20;
        String result = (time < 18) ? "Good day." : "Good evening.";
        System.out.println(result);

        String[] names={"name1","2","3","4","5"};
        System.out.println(names.length);
        for(String i:names){
            System.out.println(i);
        }
        System.out.println("Multi-dimensional Array");
        int[][] numbers = {{1,2,3,4,5,6},{4,5,6,7,8}};
        int i=0,j=0;
        for(i=0;i<numbers.length;i++){
            for(j=0;j<numbers[i].length;j++){
                System.out.println(numbers[i][j]);
            }
        }
    }
}
