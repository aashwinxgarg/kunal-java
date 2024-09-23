import java.util.Scanner;

public class CaseCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

//        String word = "Hello";
//        System.out.println(word.charAt(0));

        char ch = sc.next().trim().charAt(0);
        /*
        .next() takes an input
        .trim() removes the extra space in thr front and last of the words
        .charAt(0) gives u the character at the 0th index of the string.
         */

        if(ch>='a' && ch<='z') {
            System.out.println("Lower Case");
        } else {
            System.out.println("Upper Case");
        }

    }
}
