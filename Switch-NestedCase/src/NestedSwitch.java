import java.util.Scanner;

public class NestedSwitch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int empID = sc.nextInt();
        String dept = sc.next();

        switch(empID) {
            case 1:
                System.out.println("Kunal Kushwaha");
                break;
            case 2:
                System.out.println("Rahul Rana");
                break;
            case 3 :
                System.out.println("checking department");
                switch(dept) {
                    case "management" :
                        System.out.println("management dept");
                        break;
                    case "it":
                        System.out.println("it dept");
                        break;
                    default:
                        System.out.println("invalid dept");
                }
                break;
            default:
                System.out.println("invalid empID");
        }


    }
}
