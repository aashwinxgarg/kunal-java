public class rotationCount {
    public static void main(String[] args) {
        int[] arr = {4,5,6,7,0,1,2};
        System.out.println(countRotations(arr));
    }

    static int countRotations(int[] arr) {
        int pivot = findPivot(arr);
        return pivot+1;
    }
    static int findPivot(int[] nums) {
        int s=0;
        int e=nums.length-1;
        while(s<e) {
            int m=s+(e-s)/2;
            if(nums[m]>nums[m+1]) {
                return m;
            }
            else if(nums[m]>=nums[e]) {
                s=m;
            }
            else if(nums[m]<=nums[s]) {
                e=m;
            }
            else {
                return -1;
            }
        }
        return -1;
    }

}
