public class lc852 {
    public static void main(String[] args) {
//        int[] arr = {0,1,2,3,5,6,4,3,2};
        int[] arr = {1,2,3,4,5,3,1};
        System.out.println(peakIndexInMountainArray(arr));
    }

    static int peakIndexInMountainArray(int[] arr) {
        int start=0;
        int end = arr.length-1;

        while(start<end) {
            int mid = start+(end-start)/2;
            if(arr[mid+1]>arr[mid]) {
                start=mid+1;
            } else if (arr[mid + 1] < arr[mid]) {
                end=mid;
            }
        }
        return start;
    }
}
