import java.util.Scanner;

public class mainn {
    public static void main(String[] args) {
        // Q : input 2 numbers and print the sum
        Scanner sc = new Scanner(System.in);

        System.out.print("enter number 1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter number 2 : ");
        int num2 = sc.nextInt();

        int sum = num1+num2;
        System.out.println("sum is : " + sum);


    }
}
