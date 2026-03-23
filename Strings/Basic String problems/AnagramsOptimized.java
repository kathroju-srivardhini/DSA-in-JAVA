/*
A java program to check if the given two strings are anagrams are not in an optimized way using frequency count
Two strings are anagrams if they contain same characters with same frequency
Order does not matter
LOGIC : 
Increase count for s1 and decrease for s2.
Create int[26] //for 26 characters(Alphabets)
count[s1[i]-'a']++
count[s2[i]-'a']--
If all values become 0 -> Anagram.
*/
import java.util.Scanner;
import java.util.Arrays;
public class AnagramsOptimized{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the first string : ");
        String s1=sc.next();
        System.out.print("Enter the second string : ");
        String s2=sc.next();
        if(s1.length()!=s2.length()){
            System.out.println("The two strings are not anagrams.");
            sc.close();
            return;
        }
        char[] count=new char[26];
        for(int i=0;i<s1.length(); i++){
            count[s1.charAt(i)-'a']++;
            count[s2.charAt(i)-'a']--;
        }
        for(char c:count){
            if(c!=0){
                System.out.println("The two strings are not anagrams");
                sc.close();
                return;
            }
        }
        System.out.println("The two strings are anagrams");
        sc.close();
     }
}
/*
TIME COMPLEXITY : O(n) 
SPACE COMPLEXITY : O(1)

OUTPUT 1:
Enter the first string : listen
Enter the second string : silent
The two strings are anagrams.

OUTPUT 2:
Enter the first string : maintain
Enter the second string : silence
The two strings are not anagrams.
*/