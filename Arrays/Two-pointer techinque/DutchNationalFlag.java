/*
Given an array containing only:
0s, 1s, and 2s
Sort it in-place.
Concept : Two-pointers
Logic : Maintain three regions and shrink the unknown region.
*/
import java.util.Scanner;
public class DutchNationalFlag{
    public static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
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
        System.out.print("Enter the array elements with range (0-2) : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int low=0, high=n-1, i=0;
        //i represents current index
        //the region between low and high is unsorted
        while(i<=high){
           if(arr[i]==0){ //0's keep at front
            swap(arr, low, i);
            low++;
            i++;
           }
           else if(arr[i]==1){ //1's will be at middle
            i++;
           }
           else{ //2's move to end
              swap(arr, high, i);
              high--;
           }
        }
        System.out.print("Sorted array : ");
        sc.close();
        for(int num : arr){
            System.out.print(num+" ");
        }
        System.out.println();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE : O(1)

OUTPUT 1:
Enter the size of the array : 10
Enter the array elements with range (0-2) : 2 0 1 2 0 0 1 2 0 1    
Sorted array : 0 0 0 0 1 1 1 2 2 2 

OUTPUT 2:
Enter the size of the array : 0
Array is Empty!
*/