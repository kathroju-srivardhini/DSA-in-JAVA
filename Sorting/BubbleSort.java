/*
Sort the given array of integers in ascending order using Bubble sort
LOGIC : Push largest element to end in each pass.
repeatedly compare adjacent elements and swap if they are in the wrong order.
*/
import java.util.Scanner;
public class BubbleSort{
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
        boolean swapped; //it is used to break the loop, if array is already sorted
        for(int i=0;i<n-1;i++)//i represents the passes
        //After each pass, an element is pushed to end
        swapped=false;
        {
            for(int j=0; j<n-i-1;j++) //compare repeatedly till the largest element placed at end is reached
            {
                if(arr[j]>arr[j+1]) //if they are in wrong order
                {
                    swap(arr, j, j+1); //swap the both
                    swapped=true;
                }
            }
            if(!swapped){
                break;
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
Best case : O(n)
Space : O(1)

OUTPUT 1:
Enter the size of the array : 10
Enter the 10 integer array elements : 5 8 12 1 4 6 13 42 10 15
Sorted array : 1 4 5 6 8 10 12 13 15 42 

OUTPUT 2:
Enter the size of the array : 0
Array is Empty!
*/