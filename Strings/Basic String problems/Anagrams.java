/*
A java program to check if the given two strings are anagrams are not
Two strings are anagrams if they contain same characters with same frequency
Order does not matter
LOGIC : 
convert to character arrays
sort them
if both arrays are equal -> anagrams
else not anagrams
*/
import java.util.Scanner;
import java.util.Arrays;
public class Anagrams{
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
        char[] arr1=s1.toCharArray();
        char[] arr2=s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2); //O(n log n)
        if(Arrays.equals(arr1, arr2)){
            System.out.println("The two strings are anagrams.");
        }
        else
            System.out.println("The two strings are not anagrams.");
        sc.close();
     }
}
/*
TIME COMPLEXITY : O(n log n) 
SPACE COMPLEXITY : O(n)

OUTPUT 1:
Enter the first string : listen
Enter the second string : silent
The two strings are anagrams.

OUTPUT 2:
Enter the first string : maintain
Enter the second string : silence
The two strings are not anagrams.
*/