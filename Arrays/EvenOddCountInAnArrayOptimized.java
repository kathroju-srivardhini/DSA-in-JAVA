//A simple java program to count the total number of even numbers and total number of odd numbers in an array
import java.util.Scanner;
public class EvenOddCountInAnArrayOptimized{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements in an array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Array is empty.");
            sc.close();
            return;
        }
        int evenCount=0;
        int oddCount=0;
        System.out.print("Enter the elements(integers) of the array : ");
        for(int i=0;i<n;i++){
            int num=sc.nextInt();
            if(num%2==0){
                evenCount++;
            }
            else{
                oddCount++;
            }
        }
        System.out.printf("Total number of even elements in the array is %d\nTotal number of odd elements in the array is %d\n",evenCount,oddCount);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)

OUTPUT 1:
Enter the total number of elements in an array : 8
Enter the elements(integers) of the array : 15 23 46 35 64 108 93 75
Total number of even elements in the array is 3
Total number of odd elements in the array is 5

OUTPUT 2:
Enter the total number of elements in an array : 0
Array is empty.
*/