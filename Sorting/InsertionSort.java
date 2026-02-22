/*
Sort the given array of integers in ascending order using Insertion sort
LOGIC : 
At every step, Left side is sorted, Pick next element
Insert it into correct position in left part
*/
import java.util.Scanner;
public class InsertionSort{
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
        int key;
        for(int i=1; i<n; i++)
        {
            int j=i-1;
            key=arr[i]; //store current element
            while(j>=0 && key<arr[j]) //if it is not in correct place 
            {
                   arr[j+1]=arr[j]; //move elements to right
                   j--; //j becomes -1 then loop breaks
            }
            arr[j+1]=key; //place the key in correct position
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
Enter the 8 integer array elements : 15 4 8 6 7 1 5 3
Sorted array : 1 3 4 5 6 7 8 15 

OUTPUT 2:
Enter the size of the array : 0
Array is Empty!
*/