/*
A simple java program to find out the maximum element of an array in an optimized way
 i.e. Reducing the space complexity from O(n) to O(1)
*/
import java.util.Scanner;
public class MaxElementOfAnArrayOptimized{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements of an Array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty");
            sc.close();
            return;
        }
        System.out.print("Enter the Array Elements : ");
        int max=sc.nextInt();//first element of the array
        for(int i=1; i<n; i++){
            int element=sc.nextInt();
            if(element>max){
                max=element;
            }
        }
        System.out.println("Maximum element of the Array is "+max);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)

OUTPUT 1:
Enter the total number of elements of an Array : 6
Enter the Array Elements : 12 13 49 34 63 27
Maximum element of the Array is 63

OUTPUT 2:
Enter the total number of elements of an Array : 0
Array is Empty
*/