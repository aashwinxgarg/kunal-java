import java.util.Scanner;

public class Temperature {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Please enter temp in C : ");
        float c = sc.nextFloat();
        float f = ((c * 9)/5) + 32;

        System.out.println(f);

    }
}