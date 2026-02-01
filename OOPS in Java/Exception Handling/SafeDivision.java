/*Safe Division
Write a program that:
Takes two numbers
Divides them
Uses try-catch to handle division by zero*/

import java.util.Scanner;
public class SafeDivision{
    public static void main(String[] args){
        System.out.print("Enter two numbers (a b) : ");
         Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int c;
        try{
            c=a/b;
            // Print result if no error
            System.out.printf("%d\n",c);
        }
        catch(Exception e){
            // Runs if division by zero happens
            System.out.println(e);
        }
        finally{
            // This block always runs
            System.out.println("Finally block is executed");
        }
    }
}
/*
Output 1:
Enter two numbers (a b) : 8 0
java.lang.ArithmeticException: / by zero
Finally block is executed
Output 2:
Enter two numbers (a b) : 9 5
1
Finally block is executed
*/