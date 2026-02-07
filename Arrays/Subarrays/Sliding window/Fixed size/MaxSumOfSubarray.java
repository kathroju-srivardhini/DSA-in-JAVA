/*
Problem Statement : 
Given an integer array and a number k,
find the maximum sum of any subarray of size k
LOGIC : Sliding Window concept
*/
import java.util.*;
public class MaxSumOfSubarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements in the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Array is Empty!");
            sc.close();
            return;
        }
        System.out.print("Enter the size of subarray (k) : ");
        int k=sc.nextInt();
        if(n<k){
            System.out.print("Invalid input!");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.print("Enter the "+n+" integer array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int windowSum=0;
        for(int j=0;j<k;j++) //loop to calculate sum of first window
        { //TC : O(k)
            windowSum+=arr[j];
        }
        int maxSum=windowSum;
        for(int m=k;m<n;m++) //TC:O(n-k)
        { 
            // Sliding window sum = Previous sum − outgoing element + incoming element
            windowSum = windowSum - arr[m-k] + arr[m];
            maxSum= Math.max(maxSum, windowSum);
        }
        System.out.println("Maximum sum of a subarray is "+maxSum);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
Auxiliary Space : O(1)

OUTPUT 1:
Enter the total number of elements in the array : 9
Enter the size of subarray (k) : 3
Enter the 9 integer array elements : 5 6 8 2 14 12 1 22 19
Maximum sum of a subarray is 42

OUTPUT 2:
Enter the total number of elements in the array : 0
Array is Empty!

OUTPUT 3:
Enter the total number of elements in the array : 2
Enter the size of subarray (k) : 3
Invalid input!
*/