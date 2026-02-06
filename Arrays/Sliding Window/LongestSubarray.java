/*
Problem Statement :
Given an array of positive integers and a number k,
find the length of the longest subarray whose sum ≤ k.
LOGIC : Variable-size Sliding Window
Expand the window to include more elements,
shrink it only when the sum exceeds K,
and keep track of the maximum valid window size.
*/
import java.util.Scanner;
public class LongestSubarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty!");
            sc.close();
            return;
        }
        System.out.print("Enter the "+n+" array elements : ");
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the value of k : ");
        int k=sc.nextInt();
        int left=0;
        int sum=0, maxLen=0;
       for(int right=0;right<n;right++) 
        {
            sum+=arr[right]; //incoming element
            while(sum>k) 
            {
                sum-=arr[left]; //outgoing element
                left++;
            }
            maxLen = Math.max(maxLen, right - left + 1);
        }
        System.out.printf("Length of longest subarray whose sum <= %d is %d\n",k,maxLen);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
right moves n times
left moves at most n times
Total operations ≤ 2n
Even though there is a while loop inside a for loop It is NOT O(n²)
Because the inner loop does not restart from 0 each time
Auxiliary Space : O(1)

OUTPUT 1:
Enter the size of the array : 8
Enter the 8 array elements : 4 2 1 6 15 18 9 13
Enter the value of k : 40
Length of longest subarray whose sum <= 40 is 5

OUTPUT 2:
Enter the size of the array : 1
Enter the 1 array elements : 5
Enter the value of k : 2
Length of longest subarray whose sum <= 2 is 0

OUTPUT 3:
Enter the size of the array : 0
Array is Empty!
*/