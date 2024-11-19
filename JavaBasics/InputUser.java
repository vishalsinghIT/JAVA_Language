package JavaBasics;

import java.util.Scanner;

public class InputUser {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println("Number is "+a);
        float b=sc.nextFloat();
        System.out.println(b);
        double c=sc.nextDouble();
    System.out.println(c);
    String d=sc.next();
    System.out.println(d);
    String e=sc.nextLine();
    System.out.println(e);
    sc.close();

    }
}
