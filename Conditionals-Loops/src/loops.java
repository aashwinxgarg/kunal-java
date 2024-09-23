import java.util.Scanner;

public class loops {
    public static void main(String[] args) {


        // Q : print numbers from 1 to 5
//        System.out.println(1);
//        System.out.println(2);
//        System.out.println(3);
//        System.out.println(4);
//        System.out.println(5);


        // Q : print hello world 5 times
//        System.out.println("Hello World !");
//        System.out.println("Hello World !");
//        System.out.println("Hello World !");
//        System.out.println("Hello World !");
//        System.out.println("Hello World !");


        /*
        Syntax of for loops :
        for( initialisation;condition;increment/decrement ) {
            // body
        }
        */


        // Q : print numbers from 1 to 5
//        for(int num=1;num<=5;num+=2) {
//            System.out.println(num);
//        }

        // Q : print numbers from 1 to n
//        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();
//        for(int i=1;i<=n;i++) {
//            System.out.println(i);
//        }


        // while loops
        /*
        Syntax of while loops :
            while(condition) {
                //body
            }
         */

//        int num=1;
//        while(num<=5) {
//            System.out.println(num);
//            num+=1;
//        }


//        do-while loop
        /*
        Syntax of do-while loop :
            do {
                //body
            } while ( condition );
         */

        int n=1;
        do{
            System.out.println(n);
            n++;
        }while(n<=5);


    }
}
