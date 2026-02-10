/*
Problem Statement
Given an array, find the maximum product of any continuous subarray.

LOGIC : 
negative * negetive = positive
So track max and min values
if 0 occurs, restart the subarray
At every index, the maximum product can come from the current element, the previous max, or the previous min (if negative).
At every index, the minimum product can come from the current element, the previous min, or the previous max (if negative).
*/
import java.util.*;
public class MaxProductSubarray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Array is Empty!");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.printf("Enter the %d integer array elements : ",n);
        boolean allZeros=true; 
        // Initialized maxEnd, minEnd, globalMax to 1.
        // Hence explicitly handling all-zero array case.

        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]!=0){
                allZeros=false;
            }
        }
        if(allZeros){
            System.out.println("Result : 0");
            sc.close();
            return;
        }
        int maxEnd=1; //maximum product ending at current index
        int minEnd=1; //minimum product ending at current index
        int globalMax=1; //max of all subarray products. i.e. Best answer so far
        int prevMin=1, prevMax=1; //stores the previous values before updating
        for(int i=0;i<n;i++){
            prevMin=minEnd;
            prevMax=maxEnd;
            if(arr[i]==0){
                maxEnd=1;
                minEnd=1;
            }
            else if(arr[i]<0){
                maxEnd=Math.max(Math.max(arr[i],prevMin*arr[i]), prevMax*arr[i]);
                minEnd=Math.min(Math.min(arr[i],prevMin*arr[i]), prevMax*arr[i]);
            }
            else
                maxEnd*=arr[i];
            globalMax=Math.max(globalMax,maxEnd);
        }
        System.out.println("Result : "+globalMax);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
Auxiliary Space : O(1)

OUTPUT 1:
Enter the size of the array : 6
Enter the 6 integer array elements : 2 3 -2 -6 -3 9
Result : 162

OUTPUT 2:
Enter the size of the array : 8
Enter the 8 integer array elements : 2 -5 0 6 -1 -3 0 1
Result : 18

OUTPUT 3:
Enter the size of the array : 2
Enter the 2 integer array elements : 0 0
Result : 0

OUTPUT 4:
Enter the size of the array : 0
Array is Empty!
*/