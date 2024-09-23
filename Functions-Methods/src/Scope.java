public class Scope {
    public static void main(String[] args) {
        int a = 10; // initialising
        int b = 20;
//        a = 90;
        String name = "Kunal";
        {
//            int a = 78; // already initialised outside the block in the same
            // function / method, hence cannot initialise again.
            a = 100; // updating // reassign the original reference variable to
            // some
            // other value
            // can change the value tho
            int c = 99;
            // values initialised in this block will remain in this block
            name = "Rahul";
            System.out.println(a);
            System.out.println(name);
        }
        System.out.println(a);
        System.out.println(name);
//        System.out.println(c); // cannot use outside the block


        // scoping in for loops
        for (int i = 0; i < 4; i++) {
            System.out.println(i);
            int num=90;
        }
//        System.out.println(i);


    }
    static void random(int marks) {
        int num = 67;
        System.out.println(num);
        System.out.println(marks);
    }
}
