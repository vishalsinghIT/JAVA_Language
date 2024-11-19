package JavaBasics;

import java.util.Scanner;

public class DecimalSum {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        float x=sc.nextFloat();
        float y=sc.nextFloat();
        float sum=x+y;
        System.out.println("Sum is" +sum);
        sc.close();
    }
}
