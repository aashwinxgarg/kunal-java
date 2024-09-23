import java.util.Arrays;

public class searchIn2dArray {
    public static void main(String[] args) {
        int[][] arr = {
                {23, 4, 1},
                {18, 12, 3, 9},
                {78, 99, 34, 56},
                {18, 12}
        };
        int target = 56;
//        int[] ans = search(arr,target); // format of return value {row,col}
//        System.out.println(Arrays.toString(ans));

        int ans = max(arr);
        System.out.println(ans);

        System.out.println(Integer.MIN_VALUE);
    }


    static int max(int[][] arr) {
        int max = Integer.MIN_VALUE;
        for (int[] internalArray : arr) {
            for (int element : internalArray) {
                if (element > max) {
                    max = element;
                }
            }
        }
        return max;
    }


    static int[] search(int[][] arr, int target) {
        for (int row = 0; row < arr.length; row++) {
            for (int col = 0; col < arr[row].length; col++) {
                if (arr[row][col] == target) {
                    return new int[]{row, col};
                }
            }
        }
        return new int[]{-1, -1};
    }
}
