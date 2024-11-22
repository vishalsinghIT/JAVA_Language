package ConditionalStatements;

import java.util.Scanner;

public class Threelargest {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int x=sc.nextInt();
        int y=sc.nextInt();
        int z=sc.nextInt();
        if(x>y && x>z)
        {
            System.out.println("x is largest number "+x);
        }
        else if(y>z)
        {
            System.out.println("Y is largest number "+y);
        }
        else{
            System.out.println("z is largest Number "+z);
        }
        sc.close();
    }
}
