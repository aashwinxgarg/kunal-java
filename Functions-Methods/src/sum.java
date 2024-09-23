import java.util.Scanner;

public class sum {
    public static void main(String[] args) {
//        sum();
//        int ans =  sum2();
        int ans = sum3(20,30);
        System.out.println(ans);

    }
    /*
    return-type name(arguments) {
        //body
        return statement;
    }
     */
    static void sum() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first : ");
        int num1 = sc.nextInt();
        System.out.print("enter second : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        System.out.println("sum : "+ sum);
    }

    /*
    access modifier (we'll look in OOP) return-type name() {
        //body
        return statement;
    }
     */

//    return the value
    static int sum2() {
        Scanner sc = new Scanner(System.in);

        System.out.print("enter first : ");
        int num1 = sc.nextInt();
        System.out.print("enter second : ");
        int num2 = sc.nextInt();

        int sum = num1 + num2;

        return sum;
    }

    // pass the value of parameters when calling the function from main
    static int sum3(int a, int b) {
        int sum = a+b;
        return sum;
    }
}
