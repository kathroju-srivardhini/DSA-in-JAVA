/*
Sort the given array in ascending order using heap Sort
LOGIC : Build max heap, repeatedly move largest to end, and restore heap.
*/
import java.util.Scanner;
public class HeapSort{
    static void swap(int[] arr, int a, int b){
      int temp=arr[a];
      arr[a]=arr[b];
      arr[b]=temp;
    }
    static void heapSort(int arr[], int n){
         //Build max heap
         for(int i=n/2 -1; i>=0; i--){ //O(n)
           heapify(arr, n, i);
         }
         //Extract elements one by one
         for(int i=n-1; i>=0; i--){ //O(n)
           swap(arr, i, 0); //place largest at root
           heapify(arr, i ,0); //O(log n)
           //restore max heap
         }
    }
    static void heapify(int arr[], int n, int i){
      if(i>=0){
         //find largest among root, left child and right child, then swap
         int largest=i;
         int left=2*i+1;
         int right=2*i+2;
         if(left<n && arr[left]>arr[largest]){
            largest=left;
         }
         if(right<n && arr[right]>arr[largest]){
            largest=right;
         }
         if(largest!=i){
            swap(arr, largest, i);
            heapify(arr,n,largest); //to keep max heap property in child nodes
         }
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
         int [] arr = new int[n];
         System.out.printf("Enter the %d integer array elements : ",n);
         for(int i=0; i<n; i++){
            arr[i]=sc.nextInt();
         }
         int low=0, high=n-1;
         heapSort(arr,n);
         System.out.print("Sorted Array : ");
         for(int i=0; i<n; i++){
            System.out.print(arr[i]+" ");
         }
         System.out.println();
         sc.close();
    }
}
/*
TIME COMPLEXITY : O(n log n)
Auxiliary Space : O(1)

OUTPUT 1:
Enter the size of the array : 9
Enter the 9 integer array elements : 18 7 6 5 12 1 4 9 16
Sorted Array : 1 4 5 6 7 9 12 16 18 

OUTPUT 2:
Enter the size of the array : 0
Array is Empty!
*/