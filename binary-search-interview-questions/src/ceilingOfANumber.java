public class ceilingOfANumber {
    public static void main(String[] args) {
        int[] arr = {1,4,7,10,13,16,19,22,25,28,31};
        int target = 8;
        System.out.println(ceiling(arr,target));
    }
    static int ceiling(int[] arr, int target) {
        int s = 0;
        int e = arr.length-1;



        while(s<=e) {
            int mid = s+(e-s)/2;
            if(arr[mid]==target) {
                return arr[mid];
            } else if (arr[mid] > target) {
                e=mid-1;
            } else if (target > arr[mid]) {
                s=mid+1;
            }
        }
        return arr[e];
    }
}
