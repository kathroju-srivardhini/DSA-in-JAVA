/*
Sort given integer array in ascending order using Quick Sort
LOGIC :
Pick a pivot
Place pivot in its correct sorted position
Recursively sort left and right of pivot
*/
import java.util.Scanner;
public class QuickSort{
    static void swap(int[] arr, int a, int b){
        int temp=arr[a];
        arr[a]=arr[b];
        arr[b]=temp;
    }
    static void quickSort(int[] arr, int low, int high){ //each time array is divided into halves : O(log n)
        if(low<high){
            int pi=partition(arr,low,high);
            quickSort(arr, low, pi-1);
            quickSort(arr, pi+1, high);
        }
    }
    static int partition(int[] arr, int low, int high){
            int pivot=arr[high];
            int i=low-1;
            for(int j=low; j<high; j++){ //O(n)
                if(arr[j]<pivot){
                    i++;
                    swap(arr, i, j);
                }
            }
            swap(arr, i+1, high);
            return i+1;
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
         int [] arr = new int[n];
         System.out.printf("Enter the %d integer array elements : ",n);
         for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
         }
         int low=0, high=n-1;
         quickSort(arr, low, high);
         System.out.print("Sorted Array : ");
         for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
         sc.close();
    }
}
/*

TIME COMPLEXITY :
Best case : O(n log n)
Average case : O(n log n)
Worst case : O(n*n) 
Worst case occurs when Pivot always becomes the smallest or largest element ex: when array is already sorted

OUTPUT 1:
Enter the size of the array : 8
Enter the 8 integer array elements : 14 19 2 23 35 1 4 16
Sorted Array : 1 2 4 14 16 19 23 35 

OUTPUT 2:
Enter the size of the array : 0
Array is Empty!
*/