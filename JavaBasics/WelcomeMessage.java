package JavaBasics;

import java.util.Scanner;

public class WelcomeMessage {
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Please Enter your name");
        String name=sc.nextLine();
        System.out.println( "Welcome " +name);
        sc.close();
    }
}
