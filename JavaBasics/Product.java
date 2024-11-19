package JavaBasics;

import java.util.Scanner;

public class Product {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int mul=x*y;
        System.out.println("Mul is "+mul);
        sc.close();
    }
}
