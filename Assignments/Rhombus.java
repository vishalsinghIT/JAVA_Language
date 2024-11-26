package Assignments;

import java.util.Scanner;

public class Rhombus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of Rhombus");
        int d1=sc.nextInt();
        int d2=sc.nextInt();
        double area = (d1*d2)/2;
        System.out.println("Area is "+area);
        sc.close();
    }
}
