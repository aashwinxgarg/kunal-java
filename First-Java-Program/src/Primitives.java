import java.util.Scanner;
public class Primitives {
    public static void main(String[] args) {

        int rollno = 64;

//        String is not primitive
        String name = "Kunal";
//        can be broken into characters
        char letter = 'r';
        float marks = 98.67f;
//        why do we add f here
//        by default we have double
        double largeDecimalNumbers = 45567654.4567;
        long largeInteger = 34567834567876543L;
//        why do we add L here
//        by default we have int
        boolean check = false;

        Integer rno = 64;
//        rno.

        Scanner sc = new Scanner(System.in);
        System.out.print("please enter some input : ");
        int rollnumber = sc.nextInt();
        System.out.println("Your roll no is : "+rollnumber);

        int a = 10;
//        10 is a literal and a is an identifier.

        int b = 234_000_000;
        System.out.println(b);

        System.out.print("enter second input ");
        String namee = sc.next();
        System.out.println(namee);

        float maks = sc.nextFloat();
        System.out.println(maks);




    }
}
