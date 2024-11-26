package Assignments;

import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of time rate and principle");
        int rate =sc.nextInt();
        int time =sc.nextInt();
        int principle=sc.nextInt();
        double si=(rate*time*principle)/100;
        System.out.println("The simple interst is "+si);
        sc.close();
    }
}
