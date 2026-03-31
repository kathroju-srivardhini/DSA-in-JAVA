/*
Given a string, find the first character that does not repeat.
Which character appears only once
AND appears first
LOGIC : Count frequency of characters, then find first character with count = 1.
*/
import java.util.Scanner;
public class FirstNonRepeatingChar{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a string : ");
        String s=sc.next();
        s=s.toLowerCase();
        int count[]=new int[26];
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i))){
                count[s.charAt(i)-'a']++;
            }
        }
        for(int i=0;i<s.length();i++){
            if(Character.isLetter(s.charAt(i)) && count[s.charAt(i)-'a']==1){
                System.out.println("The first non-repeating character is '"+s.charAt(i)+"'");
                sc.close();
                return;
            }
        }
        System.out.println("There is no non-repeating character");
        sc.close();
    }
}
/*
TIME COMPLEXITY: O(n)
SPACE COMPLEXITY : O(1)

OUTPUT 1:
Enter a string : aabbccddeffghhijk
The first non-repeating character is 'e'

OUTPUT 2:
Enter a string : aabbccddee
There is no non-repeating character

OUTPUT 3:
Enter a string : a2dgA
The first non-repeating character is 'd'
*/