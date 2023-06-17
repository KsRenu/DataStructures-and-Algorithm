import java.util.*;
public class JaggedArray {
    public static void main(String[] args) {
        int[][] a= new int[2][];
        a[0] = new int[2];
        a[1] = new int[5];
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the elements: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < a[i].length; j++) {
                a[i][j] = in.nextInt();

            }

        }
        System.out.println("The elements are: ");
        for(int[] x: a ){
            for(int y: x){
                System.out.print(y+"\t");
            }
            System.out.println();
        }
    }


}
