package LamdbaFunctions;

interface divide{
    boolean division(int a, int b);

}
public class DivisionUsingLamdaFunction {
    //static void divide()
    public static void main(String[] args) {
        divide obj = (a,b) -> (a%b)==0;
        if(obj.division(10,5)){
            System.out.println("5 is the factor of 10");
        }
        if(!obj.division(13,4)){
            System.out.println("13 is not a factor of 4");
        }

    }
}
