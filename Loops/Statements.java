package Loops;

public class Statements {
    public static void main(String[] args) {
        for(int i=1; i<=5; i++)
        {
            // break Statements
            if(i==3)
            {
                break;
            }
            System.out.println(i);
        }
        System.out.println("Out of loop");
        // continue statements 
        for(int i=0; i<=5; i++)
        {
            if(i==2)
            {
                continue;
            }
            System.out.println(i);
        }
    }
}
