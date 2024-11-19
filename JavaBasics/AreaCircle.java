package JavaBasics;

import java.util.Scanner;

public class AreaCircle {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int r=sc.nextInt();
         double Area=Math.PI*r*r;
         System.out.println("Area is " +Area);
         sc.close();
    }
}
