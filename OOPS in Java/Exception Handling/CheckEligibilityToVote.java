/*Write a program:
Ask for age
If age < 18, throw an exception with message:
Not eligible to vote
Catch it and print the message*/
import java.util.Scanner;
public class CheckEligibilityToVote{
    public static void main(String[] args){
        System.out.print("Enter your age : ");
        Scanner sc=new Scanner(System.in);
        int age=sc.nextInt();
        try{
        if(age<18){
            // Manually creating an exception if under 18
            throw new ArithmeticException("Not eligible to vote");
        }
        // If age >= 18, eligible
        System.out.println("You are eligible to vote");
    }
    catch (Exception e){
        System.out.println(e);
    }
    }
}
/*
Output 1:
Enter your age : 19
You are eligible to vote
Output 2:
Enter your age : 16
java.lang.ArithmeticException: Not eligible to vote
*/