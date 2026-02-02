//A java program to check if the given array is sorted or not in ascending order
//This program is space optimized as no array is used.
//Since only adjacent comparison is required, the array storage can be avoided to optimize space
import java.util.Scanner;
public class IsArraySortedOptimized{
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
        int prev=sc.nextInt();
        for(int i=1;i<n;i++){
            int num=sc.nextInt();
            if(prev>num){
               System.out.println("Array is unsorted");
               sc.close();
               return;
            }
            prev=num;
        }
        sc.close();
        System.out.println("The given array is sorted in ascending order.");
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)

OUTPUT 1:
Enter the total number of elements of an array : 8
Enter the 8 array elements : 4 15 19 24 26 49 54 88
The given array is sorted in ascending order.

OUTPUT 2:
Enter the total number of elements of an array : 8
Enter the 8 array elements : 54 72 69 34 62 39 42 94
Array is unsorted

OUTPUT 3:
Enter the total number of elements of an array : 0
Array is Empty
*/