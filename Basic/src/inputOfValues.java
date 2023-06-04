import java.sql.SQLOutput;
import java.util.Scanner;
public class inputOfValues {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter your name: ");
        String name = input.nextLine();

        System.out.println("Enter your age: ");
        int age = input.nextInt();

        System.out.println("It wont get input");
        String check = input.nextLine();//bcz \n after the integer value in age would remain in the obj itself

        System.out.println("But it will get the input");
        String check1 = input.nextLine();

        System.out.println("Your name is: "+ name);
        System.out.println("Your age is: "+ age);
        System.out.println("Check is : "+check+"Check1 is : "+check1);
    }
}
