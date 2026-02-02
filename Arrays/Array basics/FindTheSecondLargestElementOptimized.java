//A java program to find the second largest element in the given array without updating the original array
// in an optimized way by reducing the space for storing array elements and time for more looping statements
//LOGIC: Whenever a new largest is found, the old largest becomes second largest;
//otherwise, if a number lies between them, it updates second largest
import java.util.Scanner;
public class FindTheSecondLargestElementOptimized{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements in an array : ");
        int n=sc.nextInt();
        if(n<2){
            System.out.println("The Second Largest Element does not exist");
            sc.close();
            return;
        }
        System.out.print("Enter the "+n+" array elements : ");
        int largest=Integer.MIN_VALUE;
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }
            else if(num>secondLargest && num!=largest){
                secondLargest=num;
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            System.out.println("The Second Largest Element does not exist");
        }
        else{
        System.out.println("Second largest element in the given array is "+secondLargest);
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)

OUTPUT 1:
Enter the total number of elements in an array : 6
Enter the 6 array elements : 43 63 23 93 33 15
Second largest element in the given array is 63

OUTPUT 2:
Enter the total number of elements in an array : 0
Array is empty
*/