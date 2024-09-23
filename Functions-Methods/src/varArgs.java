import java.util.Arrays;

public class varArgs {
    public static void main(String[] args) {
//        fun(2,3,4,5,56,87,23,45,65);
//        multiple (1,2,"kunal","akash","rahul rana","kushwaha","gill");
//        demo(3,4,78,9);
//        demo("Kunal", "rahul");
    }

    static void multiple ( int a , int b , String ...v) {

    }

    static void fun(int ...v) {
        // ...v means not knowing how much length do we need. so it is
        // declared as an array of int ( in this case ) with unknown length
        System.out.println(Arrays.toString(v));
    }

    static void demo(int ...v) {
        System.out.println(Arrays.toString(v));
    }

    static void demo(String ...v) {
        System.out.println(Arrays.toString(v));
    }
}
