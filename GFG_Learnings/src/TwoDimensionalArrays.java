import java.util.*;
public class TwoDimensionalArrays {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of rows: ");
        int row = in.nextInt();
        System.out.println("Enter number of columns: ");
        int col = in.nextInt();
        int [][] a = new int[row][col];
        System.out.println("Enter the array elements: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                a[i][j] = in.nextInt();
            }
        }
        System.out.println("The array elements are: ");
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
        System.out.println("Using For each");
        for(int[] x: a ){
            for(int y: x){
                System.out.print(y);
            }
            System.out.println();
        }

        int[][] arr = { { 1, 2 }, { 3, 4 },{ 5, 6 },{ 7 , 8 },{ 5, 6 },{ 7 , 8 } };

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(arr[i][j] + " ");
            }

            System.out.println();
        }
    }


}
