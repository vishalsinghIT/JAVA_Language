package Assignments;

import java.util.Scanner;

public class subtractProductAndSum {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number n");
        int n=sc.nextInt();
        int sum=0;
        int pro=1;
        while (n>0) {
            int r=n%10;
            pro=pro*r;
            sum=sum+r;
            n/=10;
        }
        int sub=pro-sum;
        System.out.println("Output is "+sub);
        sc.close();
    }
}
