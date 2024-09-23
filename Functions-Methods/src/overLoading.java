public class overLoading {
    public static void main(String[] args) {
//        fun(5);
//        fun("kunal kushwaha");
        int ans = sum(3,4,6);
        System.out.println(ans);
//        sum(10,20,30);
    }
    static void fun(int a) {
        System.out.println(a);
    }
    static void fun(String name) {
        System.out.println(name);
    }
    static int sum(int a, int b) {
        return a+b;
    }
    static int sum(int a, int b, int c) {
        return a+b+c;
    }
}
