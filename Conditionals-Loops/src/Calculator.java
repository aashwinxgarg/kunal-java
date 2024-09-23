import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // take input from user until user does not press x pr X
        int ans = 0;
        while(true) {
            System.out.print("operand : ");
            char ch = sc.next().trim().charAt(0);

            if(ch=='*' || ch=='/' || ch=='+' || ch=='-' || ch=='%') {

                System.out.print("Num1 : ");
                int num1 = sc.nextInt();
                System.out.print("Num2 : ");
                int num2 = sc.nextInt();

                if(ch == '%') {
                    System.out.println(num1%num2);
                } else if(ch == '+') {
                    System.out.println(num1+num2);
                } else if (ch == '-') {
                    System.out.println(num1-num2);
                } else if (ch == '*') {
                    System.out.println(num1*num2);
                } else if (ch == '/') {
                    if(num2!=0) {
                        System.out.println(num1/num2);
                    }
                    else {
                        System.out.println("invalid number");
                    }
                }

            }
            else if(ch=='X' || ch == 'x'){
                System.out.println("thanku for using the calculator !");
                break;
            }
            else {
                System.out.println("invalid operator");
            }
        }
    }
}
