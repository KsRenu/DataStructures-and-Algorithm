import java.util.ArrayList;

public class AutoboxingAndUnboxing {
    public static void main(String[] args) {
        //Autoboxing
        int a =10;
        ArrayList<Integer> ten = new ArrayList<Integer>();
        ten.add(a);
        System.out.println(ten);
        System.out.println(ten.getClass().getSimpleName());
        System.out.println(((Object)a).getClass().getSimpleName());
        //unboxing
        Character c = 'b';
        char b = c;
        System.out.println(b);
        int num = ten.get(0);
        System.out.println(num);
    }

}
