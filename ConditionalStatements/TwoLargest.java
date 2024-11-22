package ConditionalStatements;

import java.util.Scanner;

public class TwoLargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        if(x>y)
        {
            System.out.println("x is largest Number "+x);
        }
        else
        {
            System.out.println(y);
        }
        sc.close();
    }
}
