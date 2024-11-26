package Assignments;

import java.util.Scanner;

public class Areacircle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of radius ");
        int r=sc.nextInt();
        double area=Math.PI*r*r;
        System.out.println("Area is "+area);
        sc.close();
    }
}
