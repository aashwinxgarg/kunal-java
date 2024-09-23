import java.util.Scanner;

public class StringExample {
    public static void main(String[] args) {
//        String msg = greet();
//        System.out.println(msg);

        Scanner sc = new Scanner(System.in);
        System.out.print("enter your name : ");
        String name = sc.nextLine();
        String personalised = mygreet(name);
        System.out.println(personalised);
    }

    static String mygreet(String name) {
        String message = "Hello " + name;
        return message;
    }

    static String greet() {
        String greeting = "how are you";
        return greeting;
    }

}
