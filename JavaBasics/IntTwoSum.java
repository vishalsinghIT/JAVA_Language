package JavaBasics;

import java.util.Scanner;

public class IntTwoSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x");
        int x=sc.nextInt();
        System.out.println("Enter the value of y");
        int y=sc.nextInt();
        int sum=x+y;
        System.out.println("Sum is "+sum);
        sc.close();
    }
}
