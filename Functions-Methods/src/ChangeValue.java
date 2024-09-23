import java.util.Arrays;

public class ChangeValue {
    public static void main(String[] args) {
        // create an array
        int[] arr = {1,3,2,45,6};
        change(arr);
        System.out.println(Arrays.toString(arr));
    }
    static void change(int[] nums) {
        nums[0]=99; // if you make a change to the object via this reference
        // variable, same object will be changed.
        // as strings are immutable so if we make change to the string, a new
        // object is created whereas if we make a change in the array, we
        // modify it due to which the original object is changed for both but
        // in string as we create a new object so the ref variable points to
        // another memory and not modify it.
    }
}
