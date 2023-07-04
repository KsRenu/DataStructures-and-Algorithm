import java.util.*;
public class multidimensionalArray {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n=in.nextInt();
        int x=0;
        System.out.println("Elements: ");
        int[][][] a1 = new int[n][n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                for (int k = 0; k < n; k++) {
                    a1[i][j][k]=in.nextInt();
                }
            }
        }
        System.out.println("Elements are: ");
        for (int i = 0; i < n; i++) {
            System.out.println(" 2D arrayNo: "+ i);
            for (int j = 0; j < n; j++) {
                System.out.println("Row: "+j);
                for (int k = 0; k < n; k++) {
                    System.out.println("Col: "+k);
                    System.out.println(a1[i][j][k]);
                }
                System.out.println("\n");
            }
            System.out.println("\n\n");
        }

    }
}
