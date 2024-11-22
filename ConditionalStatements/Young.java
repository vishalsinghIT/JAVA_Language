package ConditionalStatements;

import java.util.Scanner;

public class Young {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the age of persons");
        int age=sc.nextInt();
        if(age<14)
        {
            System.out.println("Person is Child");
        }else if(age>=14 && age<=55){
            System.out.println("Person is Young");
        }else
        {
            System.out.println("Person is old");
        }
        sc.close();
    }
}
