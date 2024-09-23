public class orderAgnosticBinarySearch {
    public static void main(String[] args) {
//        int[] arr = {1,2,3,4,5};
//        int[] arr = {-18, -12, -4, 0, 2, 3, 4, 15, 16, 18, 22, 45, 89};
        int[] arr = {99, 80, 75, 22, 11, 10, 5, 2, -3};
        System.out.println(orderAgonsticBinarySearch(arr,22));
        System.out.println(orderAgnosticBS(arr,22));

    }
    static int orderAgnosticBS(int[] arr, int target) {
        int start = 0;
        int end = arr.length - 1;

        // find whether the array is sorted in ascending or descending
        boolean isAsc = arr[end]>arr[start];

        while (start <= end) {
            // find the middle element
//            int middle = (start+end)/2; // might be a possibility that the
//            (start+end) thing exceeds the range of int in java
            int mid = start + (end - start) / 2;
            if (arr[mid] == target) {
                return mid;
            }

            if(isAsc) {
                if (target > arr[mid]) {
                    start = mid + 1;
                } else if (target < arr[mid]) {
                    end = mid - 1;
                }
            } else {
                if (target < arr[mid]) {
                    start = mid + 1;
                } else if (target > arr[mid]) {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
    static int orderAgonsticBinarySearch(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;
        boolean isAsc = arr[e]>arr[s];
        while(s<=e) {
            int m = s+(e-s)/2;
            if(arr[m]==target) {
                return m;
            } else if (target > arr[m] && isAsc) {
                s=m+1;
            } else if (target>arr[m] && !isAsc) {
                e=m-1;
            } else if (target<arr[m] && isAsc){
                e=m-1;
            } else if (target<arr[m] && !isAsc){
                s=m+1;
            }
        }
        return -1;
    }
}
