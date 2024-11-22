package ConditionalStatements;

import java.util.Scanner;

public class Grade {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the marks of math,english, science");
        double math=sc.nextDouble();
        double english=sc.nextDouble();
        double science=sc.nextDouble();
        double total=(math+english+science);
        System.out.println("Total is "+total);
        double avg=total/3;
        System.out.println("Average is "+avg);
        if(avg>=70)
        {
            System.out.println("Grade is A");
        }
        else if(avg<70 && avg>=60)
        {
            System.out.println("Grade is B");
        }
        else if(avg<60&& avg>=50)
        {
            System.out.println("Grade is C");
        }
        else if(avg<50 && avg>=40)
        {
            System.out.println("Grade is D");
        }
        else
        {
            System.out.println("F");
        }
        sc.close();
    }
}
