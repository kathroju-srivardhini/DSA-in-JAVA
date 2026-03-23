/*
A java program to reverse a given string
LOGIC : Use two pointers and swap characters.
*/
import java.util.Scanner;
public class ReverseString{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the String : ");
        String s=sc.nextLine();
        if(s.isEmpty()){
            System.out.println("Empty String Entered!");
            sc.close();
            return;
        }
        char[] str=s.toCharArray(); //converting string to character array
        int len=s.length();
        int start=0, end=len-1;
        char temp;
        while(start<end){
            temp=str[start];
            str[start]=str[end];
            str[end]=temp;
            start++;
            end--;
        }
        System.out.print("Reversed String : ");
        for(char c:str){
            System.out.print(c);
        }
        System.out.println();
        sc.close();
    }
}
/*
TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(n) //for character array

OUTPUT 1:
Enter the String : internet
Reversed String : tenretni

OUTPUT 2:
Enter the String : 
Empty String Entered!
*/