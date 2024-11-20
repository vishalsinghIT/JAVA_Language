package OperatorAndExpression;

import java.util.*;
public class AreaTriangle {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the base and height");
        int base=sc.nextInt();
        int height=sc.nextInt();
        int Area=(base*height)/2;
        System.out.println("Area is "+Area);
        sc.close();
    }
}
