/*
Given an array representing a permutation of numbers, rearrange it into the next lexicographically greater permutation.
(rearrange it into the next bigger ordering.)
If no greater permutation exists, rearrange it into the lowest possible order (sorted ascending).
Lexicographyically greater permutation means The very next arrangement in the dictonary ordered list.

LOGIC : 
from the right side:
Find the first decreasing element
Find the next greater element to its right
Swap
Reverse the suffix
*/
import java.util.Scanner;
public class NextPermutation{
    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    public static void reverse(int[] arr, int s, int e){
        int p1=s, p2=e;
        while(p1<p2){
            swap(arr, p1, p2);
            p1++;
            p2--;
        }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty!");
            sc.close();
            return;
        }
        int arr[]=new int[n];
        System.out.print("Enter the integer array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int bp=-1, m=Integer.MAX_VALUE;
        for(int j=n-2;j>=0;j--){
            if(arr[j]<arr[j+1]){
                //breakpoint
                bp=j;
                break;
            }
        }
        if(bp==-1){
            reverse(arr,0,n-1);
        }
        else
        {
          for(int i=n-1;i>bp;i--){
              if(arr[i] > arr[bp]){
                  swap(arr,bp,i);
                    break;
              }
          }
        reverse(arr,bp+1,n-1);
        }
        System.out.print("Next permutation : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)
OUTPUT 1 :
Enter the size of the array : 4
Enter the integer array elements : 1 2 4 3
Next permutation : 1 3 2 4 

OUTPUT 2:
Enter the size of the array : 5
Enter the integer array elements : 5 4 3 2 1
Next permutation : 1 2 3 4 5 

OUTPUT 3:
Enter the size of the array : 0
Array is Empty!
*/