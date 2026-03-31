/*
Given a string, find the length of the longest substring without repeating characters.
CONCEPT: Sliding window + frequency array
LOGIC : Expand window until duplicate appears, then shrink from left.
*/
import java.util.Scanner;
public class LongestSubstringWithoutRepeatingChars{
     public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the string : ");
        String s=sc.nextLine();
        int left=0, right=0;
        int maxlen=0;
        int count[]=new int[256];
        for(right=0;right<s.length();right++){
            count[s.charAt(right)]++;
            while(count[s.charAt(right)]>1){
                    count[s.charAt(left)]--;
                    left++;
            }
            maxlen=Math.max(maxlen,right-left+1);
        }
        System.out.println("Result : "+maxlen);
        sc.close();
     }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)

OUTPUT :
Enter the string : abcabacdd
Result : 4
*/