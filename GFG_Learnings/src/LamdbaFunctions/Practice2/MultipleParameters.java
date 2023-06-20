package LamdbaFunctions.Practice2;

public class MultipleParameters {
    @FunctionalInterface
    interface intern2{
        int operation(int x, int y);
    }
    interface intern1{
        void message(String msg);
    }
    private int operate(int x, int y, intern2 obj){ return obj.operation(x,y);}
    public static void main(String[] args) {
        intern2 add = (int x,int y) -> x + y;
        intern2 multiply = (int x, int y) -> x * y;

        MultipleParameters classObj = new MultipleParameters();
        System.out.println("Addition is: "+classObj.operate(3,6,add));
        System.out.println("Multiplication is: "+classObj.operate(2,5,multiply));

        intern1 obj1 = msg -> System.out.println("Hello"+msg);
        obj1.message("man");



    }
}
