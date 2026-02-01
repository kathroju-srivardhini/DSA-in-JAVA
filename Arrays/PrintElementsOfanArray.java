/*
A simple java program to read and print elements of an array
*/
import java.util.Scanner;
public class PrintElementsOfanArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements : ");
        int n=sc.nextInt();
        int[] arr= new int[n];
        if(n==0){
            System.out.println("Array is empty.");
            return;
        }
        System.out.print("Enter the elements(numbers) : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Elements of Array : ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(n)

Output 1:
Enter the total number of elements : 5
Enter the elements(numbers) : 48 16 5 13 64
Elements of Array : 48 16 5 13 64 

OUTPUT 2:
Enter the total number of elements : 0
Array is empty.
*/