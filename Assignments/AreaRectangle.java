package Assignments;

import java.util.Scanner;

public class AreaRectangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the length and breadth of triangle");
        int length=sc.nextInt();
        int breadth=sc.nextInt();
        double area=length*breadth;
        System.out.println("Area is "+area);
        sc.close();
    }
}
