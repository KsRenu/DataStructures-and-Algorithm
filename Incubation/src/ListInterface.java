import java.util.ArrayList;
import java.util.List;

public class ListInterface {
    public static void main(String[] args) {
        List<Integer> l = new ArrayList<Integer>();
        System.out.println(l);
        System.out.println("Adding elem");
        l.add(1);
        l.add(2);
        l.add(3);
        l.add(4);
        l.add(5);
        l.add(6);
        System.out.println(l);
        System.out.println("Remove index 0");
        l.remove(0);
        System.out.println(l);
        System.out.println("updating value at index 0");
        l.set(0,11);
        System.out.println(l);
        System.out.println("Retreive value at index 1: ");
        System.out.println(l.get(1));
        l.add(11);
        System.out.println(l);
        System.out.println("Adding at specific index: ");
        l.add(0,1);
        System.out.println(l);
        System.out.println("Index of 5: "+l.indexOf(5));
        System.out.println("LAst index of 11 is "+ l.lastIndexOf(11));
        System.out.println("Usage of contains: "+ l.contains(5));


    }


}
