/*
A java program to create a game of guessing random number
*/
import java.util.Scanner;
import java.util.Random;
public class GuessNumber{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        Random r=new Random();
        int num=r.nextInt(1,100);
        int attempts=0;
        while(true){
            System.out.print("Guess a number (1-100): ");
            int n=sc.nextInt();
            if(n==num){
                attempts++;
                System.out.println("Correct! No. of Attempts : "+attempts);
                sc.close();
                break;
            }
            if(n>num){
                System.out.println("Lower than "+n);
                attempts++;
            }
            else{
                System.out.println("Higher than "+n);
                attempts++;
            }
        }
        sc.close();
    }
}
/*
OUTPUT:
Guess a number (1-100): 62
Higher than 62
Guess a number (1-100): 82
Lower than 82
Guess a number (1-100): 75
Lower than 75
Guess a number (1-100): 70
Lower than 70
Guess a number (1-100): 64
Higher than 64
Guess a number (1-100): 68
Correct! No. of Attempts : 6
*/