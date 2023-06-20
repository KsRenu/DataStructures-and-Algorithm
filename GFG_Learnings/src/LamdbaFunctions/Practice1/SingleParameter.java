package LamdbaFunctions.Practice1;

interface test2{
    void print(int a);
}
public class SingleParameter {
    static void call(test2 t, Integer a){t.print(a);}

    public static void main(String[] args) {
        call(p-> System.out.println(p),10);
    }
}
