package Loops;

import java.util.Scanner;

public class SumOfNnumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the value of n");
        int n=sc.nextInt();
        int counter=0;
        int sum=0;
        while (counter<=n) {
            sum=counter+sum;
            counter++;
        }
        System.out.println("Sum is " +sum);
        sc.close();
    }
}
