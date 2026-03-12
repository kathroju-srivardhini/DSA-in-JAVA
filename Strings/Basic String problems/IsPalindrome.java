/*
A java program to check whether a string is a palindrome.
A palindrome reads the same forward and backward.
*/
import java.util.Scanner;
import java.lang.String;
public class IsPalindrome{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s=sc.next();
        s=s.toLowerCase();
        int l=s.length();
        int start=0, end=l-1;
        sc.close();
        while(start<end){
            if(s.charAt(start)!=s.charAt(end)){
                System.out.println("It is not a palindrome.");
                return;
            }
            start++;
            end--;
        }
        System.out.println("It is a palindrome.");
    }
}
/*
TIME COMPLEXITY: O(n/2)
SPACE COMPLEXITY : O(1)

OUTPUT 1:
Enter the string : malayalam
It is a palindrome.

OUTPUT 2:
Enter the string : telugu 
It is not a palindrome.
*/