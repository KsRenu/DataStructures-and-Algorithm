//what is radix parameter in nextInt
//how it functions
//why hasNextFloat doesn't work
//why printing in console doesnt work

import java.util.*;
public class ScannerClass_learn {
    public static void main(String[] args) {

        //Scanner in = new Scanner(System.in);
        String s = "Gfg fsf 9 + 6 = 12.0";
        Scanner scanner = new Scanner(s);
        while (scanner.hasNext()) {
            if (scanner.hasNextInt()) {
                System.out.println("Found Int value :"
                        + scanner.nextInt(12));
            }
            else {
                System.out.println("Not found Int value :"
                        + scanner.next());
            }
        }
        scanner.close();


        Scanner in =  new Scanner(System.in);
        int count =0;
        while(in.hasNextInt()){
            int num = in.nextInt();
            count++;
        }
        System.out.println("Number of input digits are: "+count);
        in.nextLine();

        //String name = System.console().readLine();
        //System.out.println("You entered console string " + name);
        System.out.println("Printing the errors");
        System.err.print("Error");

        System.out.println("Scanner input for final variables it throws errror");
        //final int check = in.nextInt();
        //System.out.println(check);




    }
}
