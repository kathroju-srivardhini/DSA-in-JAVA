/*
Sort the given array of integers in ascending order using Selection sort
LOGIC : Push smallest element to beginning in each pass.
repeatedly find the smallest element and swap with the starting index of unsorted elements.
*/
import java.util.Scanner;
public class SelectionSort{
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
        int arr[] =new int[n];
        System.out.printf("Enter the %d integer array elements : ",n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int min_idx;
        for(int i=0; i<n-1;i++) //i represents the first index of unsorted elements
        {
            min_idx=i; 
        //initialize min index to i, to find the min from first index of unsorted array to end
            for(int j=i+1; j<n;j++){
                if(arr[j]<arr[min_idx]){
                    min_idx=j;
                }
            }
            if(min_idx!=i){
               swap(arr,i,min_idx); //push mininum element to front
            }
        }
        System.out.print("Sorted array : ");
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n*n)
Space : O(1)

OUTPUT 1:
Enter the size of the array : 8
Enter the 8 integer array elements : 14 7 9 13 24 60 18 47
Sorted array : 7 9 13 14 18 24 47 60 

OUTPUT 2:
Enter the size of the array : 0
Array is Empty!
*/