/*
A simple java program to find out the maximum element of an array
*/
import java.util.Scanner;
public class MaxElementOfAnArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements of an Array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        int max=arr[0];
        System.out.print("Enter the Array Elements : ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("Maximum element of the Array is "+max);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(n)

OUTPUT 1:
Enter the total number of elements of an Array : 6
Enter the Array Elements : 12 13 49 34 63 27
Maximum element of the Array is 63

OUTPUT 2:
Enter the total number of elements of an Array : 0
Array is Empty
*/