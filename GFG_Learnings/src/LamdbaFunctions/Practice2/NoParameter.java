package LamdbaFunctions.Practice2;

interface practice2{
    void method1();
}
public class NoParameter {
   static void call(practice2 p){p.method1();}
    public static void main(String[] args) {
        call(()-> System.out.println("Method1 with no parameters has been called here"));
    }
}
