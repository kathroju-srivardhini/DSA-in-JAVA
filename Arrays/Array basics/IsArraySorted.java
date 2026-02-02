//A java program to check if the given array is sorted or not in ascending order
import java.util.Scanner;
public class IsArraySorted{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the total number of elements of an array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty");
            sc.close();
            return;
        }
        System.out.print("Enter the "+n+" array elements : ");
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
            if(i==0){
                continue;
            }
            if(arr[i-1]>arr[i]){
               System.out.println("Array is unsorted");
               sc.close();
               return;
            }
        }
        sc.close();
        System.out.println("The given array is sorted in ascending order.");
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(n)

OUTPUT 1:
Enter the total number of elements of an array : 10
Enter the 10 array elements : 8 15 32 47 68 75 97 176 219 512
The given array is sorted in ascending order.

OUTPUT 2:
Enter the total number of elements of an array : 10
Enter the 10 array elements : 54 62 12 39 72 106 114 159 26 99
Array is unsorted

OUTPUT 3:
Enter the total number of elements of an array : 0
Array is Empty
*/