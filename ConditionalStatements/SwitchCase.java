package ConditionalStatements;

import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Entre the value of day");
        int day=sc.nextInt();
        switch (day) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tue");
                break;
                case 3:
                System.out.println("Wed");
                break;
                case 4:
                System.out.println("thu");
                break;
                case 5:
                System.out.println("Fri");
                break;
                case 6:
                System.out.println("sat");
                break;
                case 7:
                System.out.println("sun");
                break;
            default:
            System.out.println("Number is not correct");
                break;
        }
        sc.close();
    }
}
