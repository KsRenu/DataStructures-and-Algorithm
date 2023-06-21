package LamdbaFunctions.Practice2;

interface singlepara{
    void singleparamethod(int a);
}
public class SingleParameter {
    static void call(singlepara sp, int a){ sp.singleparamethod(a); }

    public static void main(String[] args) {
        call((a)-> System.out.println("The value of a is: "+a),10);
    }
}
