/*
Problem Statement:
Given an array, find the maximum sum of any continuous subarray
LOGIC : Carry the previous sum only if it increases the current subarray; otherwise start fresh.
*/
import java.util.*;
public class KadaneMaxSubarraySum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty!");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.printf("Enter the %d integer array elements : ",n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int curSum=arr[0], maxSum=arr[0];
            for(int j=1;j<n;j++){
                curSum=Math.max(arr[j], curSum+arr[j]);
                maxSum=Math.max(curSum, maxSum);
            }
        System.out.print("Maximum Subarray sum : "+maxSum);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
Auxiliary Space : O(1)

OUTPUT 1:
Enter the size of array : 9
Enter the 9 integer array elements : -2 1 -3 4 -1 2 1 -5 4
Maximum Subarray sum : 6

OUTPUT 2:
Enter the size of array : 0
Array is Empty!
*/