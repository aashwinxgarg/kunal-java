public class findAllPairsWithSumK {
    public static void main(String[] args) {
        int[] arr = {2,4,6,8,10};
        int k = 10;
        System.out.println(binarySearch(arr,k));
    }
    static int binarySearch(int[] arr, int k) {
        int start = 0;
        int end = arr.length-1;
        int count=0;
        while(start<end) {
            if(arr[start]+arr[end]==k) {
                count++;
                start++;
            }
            else if(arr[start]+arr[end]>k) {
                end--;
            }
            else {
                start++;
            }
        }
        return count;
    }
}
