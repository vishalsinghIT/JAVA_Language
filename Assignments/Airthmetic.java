package Assignments;

import java.util.Scanner;

public class Airthmetic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of x and y");
        int x=sc.nextInt();
        int y=sc.nextInt();
        System.out.print("Enter the operator (+, -, *, /): ");
        char operator = sc.next().charAt(0);
        if(operator =='+')
        {
            int result = x+y;
            System.out.println("sum is "+result);
        }else if(operator=='-')
        {
            int result = x-y;
            System.out.println("Sub is "+result);
        }else if(operator== '/')
        {
            if(y!=0)
            {
                int result=x/y;
                System.out.println("Div is "+result);
            }
        }else if(operator=='*')
        {
            int result=x*y;
            System.out.println("Multiple is "+result);
        }
        else {
            int result = x%y;
            System.out.println("mod is " +result);
        }
        sc.close();
    }
}
