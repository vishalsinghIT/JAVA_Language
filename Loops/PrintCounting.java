package Loops;

import java.util.Scanner;

public class PrintCounting {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        // USER Input
        int n=sc.nextInt();
        int counter=1;
        while (counter<=n) {
            System.out.print(counter+ " ");
            counter++;
        }
        System.out.println();
        sc.close();
    }
}
