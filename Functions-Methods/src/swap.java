public class swap {
    public static void main(String[] args) {
        int a = 10;
        int b = 20;

        // swap numbers code
//        int temp = a;
//        a = b;
//        b = temp;

        swap(a,b);

        System.out.println(a);
        System.out.println(b);

        String name = "Kunal Kushwaha";
        changeName(name);
        System.out.println(name);
        // as strings are immutable so if we make change to the string, a new
        // object is created whereas if we make a change in the array, we
        // modify it due to which the original object is changed for both but
        // in string as we create a new object so the ref variable points to
        // another memory and not modify it.

    }

    static void changeName(String name) {
        name = "Rahul Rana";
    }

    static void swap(int a, int b) {
        int temp = a;
        a = b;
        b = temp;

        // this change will be valid in this function scope only
    }
}
