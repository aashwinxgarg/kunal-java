public class TypeCasting {
    public static void main(String[] args) {

//        type casting
        int a = (int)(67.56f);
        System.out.println(a);

//        automatic type promotion in expression
        int ab=257;
        byte b = (byte)(ab); // 257 % 256 = 1

        System.out.println(b);

        byte ac = 40;
        byte bc = 50;
        byte c = 100;

        int d = ac * bc /c;

        System.out.println(d);

        byte bb = 50;
//        bb = bb * 2;
//        when u perform operations on byte it automatically gets changed
//        into int

        int num = 'A';
        System.out.println(num);

        byte bbb = 42;
        char ch = 'a';
        short s = 1024;
        int i = 50000;
        float fl = 5.67f;
        double doo = 0.1234;
        double res = (fl*bbb) + (i/ch) - (doo*s);
        System.out.println((fl*bbb) + " " + (i/ch) + " " + (doo*s));
//        float + int - double = double
        System.out.println(res);


    }
}
