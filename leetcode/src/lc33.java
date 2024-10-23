public class lc33 {
    public static void main(String[] args) {
        int[] arr = {1,3,5};
        System.out.println(findPivot(arr));
    }
    static int findPivot(int[] arr) {
        int s = 0;
        int e = arr.length-1;
        while(s<e) {
            int m = s+(e-s)/2;
            if(arr[m]>arr[m+1]) {
                return m;
            }
            else if(arr[e]<=arr[m]) {
                s=m;
            }
            else if(arr[s]>=arr[m]) {
                e = m;
            }
            else {
                return -1;
            }
        }
        return -1;
    }

}
