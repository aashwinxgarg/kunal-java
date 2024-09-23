public class binarySearch {
    public static void main(String[] args) {
//        int[] arr = {2,4,6,9,11,12,14,20,36,48};
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int target = 22;
        System.out.println(binarysearch(arr, target));
    }

    //return the index
    // return -1 if it does not exist
    static int binarysearch(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            // find the middle element
//            int middle = (start+end)/2; // might be a possibility that the
//            (start+end) thing exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            } else if (target > arr[mid]) {
                start = mid + 1;
            } else if (target < arr[mid]) {
                end = mid - 1;
            }
        }
        return -1;
    }
}