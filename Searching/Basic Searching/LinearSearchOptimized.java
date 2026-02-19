//A java program to search (linear search) target element in the given array in an optimized way
//by reducing the space
import java.util.Scanner;
public class LinearSearchOptimized{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the target element : ");
        int target=sc.nextInt();
        System.out.print("Enter the total number of elements in an array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Array is empty.");
            sc.close();
            return;
        }
        System.out.print("Enter the array elements : ");
        for(int i=0;i<n;i++){
            int num =sc.nextInt();
            if(num==target){
                System.out.println("Target element is found at index "+i);
                sc.close();
                return;
            }
        }
        System.out.println("Target element is not found in the given array.");
        sc.close();
    }

}

/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)

OUTPUT 1:
Enter the target element : 65
Enter the total number of elements in an array : 8
Enter the array elements : 12 64 23 59 82 65 54 9
Target element is found at index 5

OUTPUT 2:
Enter the target element : 55
Enter the total number of elements in an array : 5
Enter the array elements : 14 28 64 97 10
Target element is not found in the given array.

*/