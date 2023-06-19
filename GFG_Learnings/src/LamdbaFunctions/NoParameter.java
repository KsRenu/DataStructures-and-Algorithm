package LamdbaFunctions;

interface test1{
    void print();
    default void check(){
        System.out.println("Printing value inside the check function.");
    }
}
public class NoParameter {
    static void call(test1 t){ t.print();t.check();}

    public static void main(String[] args) {
        call(()-> System.out.println("Hello"));
    }
}
