public class shadowing {
    static int x = 40;
    public static void main(String[] args) {
        System.out.println(x);
        x = 90; // modifying the global static variable
        System.out.println(x);
        int x = 100; // initialising the local variable x
        // the class variable initialised in line 4 is shadowed by this

        int a;
//        System.out.println(a); // scope will actually begin when the
//        variable is initialised and not just declared.
        a = 10;

        System.out.println(x);
        prin(); // calling a func to print global x variable
    }
    static void prin(){
        System.out.println(x);
    }
}
