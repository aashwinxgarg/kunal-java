public class floorOfANumber {
    public static void main(String[] args) {
        int[] arr = {2,3,5,9,14,16,18};
        int target = 2;
        System.out.println(floor(arr,target));
    }

    static int floor(int[] arr, int target) {
        int s=0;
        int e=arr.length-1;

        if(arr[s]>target) {
            return -1;
        }

        while(s<=e) {
            int m = s+(e-s)/2;

            if(arr[m]==target) {
                return m;
            } else if (target > arr[m]) {
                s=m+1;
            } else if (target < arr[m]) {
                e=m-1;
            }
        }
        return arr[e];
    }
}
