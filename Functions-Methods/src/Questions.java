import java.util.Scanner;

public class Questions {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        int n = sc.nextInt();

//        boolean ans = isPrime(n);
//        boolean ans = isArmstrong(n,digits(n));
//        System.out.println(ans);

        //printing all the 3 digit armstrong numbers
        for(int i=100;i<1000;i++) {
            if(isArmstrong(i,digits(i))==true) {
                System.out.println(i);
            }
        }

    }
    static boolean isPrime(int n) {
        if(n<=1) {
            return false;
        }
        for(int i=2;i<=Math.sqrt(n);i++) {
            if(n%i==0) {
                return false;
            }
        }
        return true;
    }

    // armstrong or not
    static boolean isArmstrong(int n,int digits) {
        int original = n;
        int sum=0;
        while(n>0) {
            int rem = n%10;
            int powe = (int) Math.pow(rem,digits);
            sum = sum+powe;
            n/=10;
        }
        return original==sum;
    }

    // counting the digits of a number
    static int digits(int n) {
        int count=0;
        while(n>0) {
            count++;
            n/=10;
        }
        return count;
    }
}
