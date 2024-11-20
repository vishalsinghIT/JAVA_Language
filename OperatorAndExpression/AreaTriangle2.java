package OperatorAndExpression;

import java.util.Scanner;

public class AreaTriangle2 {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of a,b and c");
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c=sc.nextInt();
        double s=(a+b+c)/2;
        System.out.println("S is "+s);
        double Area=Math.sqrt(s*(s-a)*(s-b)*(s-c));
        System.out.println("Area is "+Area);
        sc.close();
    }
}
