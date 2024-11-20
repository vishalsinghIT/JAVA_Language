package OperatorAndExpression;

import java.util.*;
public class Arithmetic {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        // Airthmetic operators(Binary)
        System.out.println("Enter the value of x and y");
        int x=sc.nextInt();
       int  y=sc.nextInt();
       int sum=x+y;
       System.out.println("Sum is "+sum);
       int sub=x-y;
       System.out.println("sub is "+sub);
       int mul=x*y;
       System.out.println("mul is "+mul);
       int div=x/y;
       System.out.println("Div is "+div);
       int mod=x%y;
       System.out.println("mod is "+mod);
       // AIRTHMETIC Opreator(unary)
       int a=5;
       int b=++a;
       int c=a++;
       System.out.println(a);
       System.out.println(b);
       System.out.println(c);
       sc.close();
    }
}
