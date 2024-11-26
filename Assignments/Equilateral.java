package Assignments;

import java.util.Scanner;

public class Equilateral {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the side of Equilateral triangle ");
        int side=sc.nextInt();
        double area=(Math.sqrt(3)/4)*side*side;
        System.out.println("Area is "+area);
        sc.close();
    }
}
