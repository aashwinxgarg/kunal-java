import java.util.Arrays;
import java.util.Scanner;

public class MultiDimension {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        /*
            1 2 3
            4 5 6
            7 8 9
         */

//        int[][] arr = new int[3][];

        int[][] arr2 = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        int[][] arr2D = {
                {1, 2, 3}, // 0th index
                {4, 5}, // 1st index
                {6, 7, 8, 9} // 2nd index -> arr2D[2] = {6, 7, 8, 9};
                // arr2D[2][0] = 6;
        };

        int[][] arr = new int[3][3];

        // input
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                arr[i][j] = sc.nextInt();
            }
        }

        // output
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(Arrays.toString(arr[i]));
//        }

        for (int[] a: arr) {
            System.out.println(Arrays.toString(a));
        }




    }
}
