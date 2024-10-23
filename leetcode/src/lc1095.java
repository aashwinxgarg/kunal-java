public class lc1095 {
    public static void main(String[] args) {
        int[] arr = {1,3,4,5,8,5,3,2,1};
        int target = 2;
        int peakIndex = peakIndex(arr);
//        System.out.println(peakIndex);
        int ans = binarySearch(arr,target,0,peakIndex, true);
        if(ans==-1) {
            ans = binarySearch(arr,target,peakIndex,arr.length-1, false);
        }
        System.out.println(ans);
    }
    static int binarySearch(int[] arr, int target, int s, int e, boolean isAsc) {
        while(s<=e) {
            int m = s+(e-s)/2;
            if(target>arr[m]) {
                if(isAsc) {
                    s=m+1;
                }
                else {
                    e=m-1;
                }
            } else if (target < arr[m]) {
                if(isAsc) {
                    e=m-1;
                }
                else {
                   s=m+1;
                }
            }
            else {
                return m;
            }
        }
        return -1;
    }
    static int peakIndex(int[] arr) {
        int s = 0;
        int e=arr.length-1;

        while(s<e) {
            int m = s+(e-s)/2;
            if(arr[m+1] > arr[m]) {
                s=m+1;
            } else if (arr[m + 1] < arr[m]) {
                e=m;
            }
        }
        return s;
    }
}
