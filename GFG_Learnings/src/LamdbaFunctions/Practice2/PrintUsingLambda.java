package LamdbaFunctions.Practice2;

import java.util.ArrayList;

public class PrintUsingLambda {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

       // list.forEach(n-> System.out.println(n));
        list.forEach(n-> System.out.println(n*2));


    }

}
