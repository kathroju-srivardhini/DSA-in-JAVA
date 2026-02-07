/*
A program to count the number of subarrays of size k whose average >=X.
LOGIC: Using fixed size Sliding window technique.
Compute sum of first window
Slide window by: removing arr[left], adding arr[right]
Check windowSum >= k* X.
This logic works for negative numbers also.
*/
import java.util.*;
public class CountSubarraysBasedOnAvg{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the array size : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Array is Empty!");
            sc.close();
            return;
        }
        System.out.print("Enter size of subarray (k) : ");
        int k=sc.nextInt();
        if(k>n||k==0){
            System.out.println("Invalid size of subarray!");
            sc.close();
            return;
        }
        if(k==1){
            System.out.println("Result : "+n);
            sc.close();
            return;
        }
        System.out.printf("Enter the %d array elements : ",n);
        int[] arr =new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of X : ");
        int x=sc.nextInt();
        int left=0,right=0,windowSum=0, count=0;
        for(right=0; right<k; right++){
            windowSum+=arr[right];
        }
        if(windowSum>= k*x){
            count++;
        }
        for(right=k;right<n;right++){
            windowSum= windowSum - arr[left] + arr[right];
            if(windowSum>=k*x){
               count++;
            }
            left++;
        }
        System.out.println("Result : "+count);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
Auxiliary Space : O(1)

OUTPUT 1:
PS C:\Users\sriva\OneDrive\Documents\project1\1\Arrays\Sliding Window> java DivisibleSubarrays 
Enter the array size : 6
Enter size of subarray (k) : 3
Enter the 6 array elements : 15 12 5 8 7 33
Enter the value of X : 5
Result : 4

OUTPUT 2:
Enter the array size : 5
Enter size of subarray (k) : 2
Enter the 5 array elements : 8 -6 5 0 3
Enter the value of X : 1
Result : 3

OUTPUT 3:
Enter size of the array : 2
Enter size of subarray (k) : 3
Enter the 2 array elements : 15 12
Invalid size of subarray!

OUTPUT 4:
Enter the array size : 0
Array is Empty!
*/