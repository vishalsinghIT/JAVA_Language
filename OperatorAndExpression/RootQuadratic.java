package OperatorAndExpression;

import java.util.Scanner;

public class RootQuadratic {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b,c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double r1=(-b+Math.sqrt(b*b-4*a*c))/2*a;
        double r2=(-b-Math.sqrt(b*b-4*a*c))/2*a;
        System.out.println("Root is "+r1);
        System.out.println("2nd root is "+r2);
        sc.close();
    }
}
