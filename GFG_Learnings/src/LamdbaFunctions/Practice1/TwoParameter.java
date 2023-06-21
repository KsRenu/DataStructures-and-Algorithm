package LamdbaFunctions.Practice1;

interface test3{
    void print(int a, int b);
}
public class TwoParameter {
    static void call(test3 t, Integer a, Integer b){t.print(a,b);}

    public static void main(String[] args) {
        call((a,b)-> System.out.println(a+" "+b),11,12);
    }
}
