/*
Problem statement:
Given an array of positive integers and a value X,
find the minimum length subarray whose sum is ≥ X.
LOGIC: Using variable size sliding window
Expand window until condition is met,
then shrink it to find the minimum size.
*/
import java.util.*;
public class SmallestSubarray{
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
        System.out.print("Enter the value of X : ");
        int x=sc.nextInt();
        if (x <= 0) {
              System.out.println("Result : 1");
              sc.close();
              return;
        }
        int left=0, right=0, windowSum=0, minLength=Integer.MAX_VALUE;
        for(right=0;right<n;right++){
             windowSum += arr[right];
             while(windowSum>=x){
              minLength=Math.min(minLength,right-left+1);
              windowSum -= arr[left];
              left++;
             }
        }
        if(minLength==Integer.MAX_VALUE){
            System.out.println("Result : 0");
        } else{
            System.out.printf("Result : %d\n",minLength);
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
right moves from 0 → n-1
left also moves from 0 → n-1
Each element enters & exits window once
Auxiliary Space : O(1)

OUTPUT 1:
Enter the size of the array : 10
Enter the 10 array elements : 5 1 3 5 10 7 4 9 2 8
Enter the value of X : 15
Result : 2

OUTPUT 2:
Enter the size of the array : 2 
Enter the 2 array elements : 5 6
Enter the value of X : 0
Result : 1

OUTPUT 3:
Enter the size of the array : 0
Array is Empty!
*/