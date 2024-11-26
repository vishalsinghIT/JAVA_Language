package Assignments;

import java.util.Scanner;

public class WelocmeMessage {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the name of a persons");
        String name=sc.next();
        System.out.println("Welocme to my home "+name);
        sc.close();
    }
}
