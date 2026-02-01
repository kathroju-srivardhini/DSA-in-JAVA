/*
A simple java program to print sum of all elements of an array
*/
import java.util.Scanner;
public class SumOfArrayElements{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements of an array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Array is Empty. So sum is zero");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        int sum=0;
        System.out.print("Enter the elements of the array : ");
        for(int i=0; i<arr.length; i++){
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        System.out.println("Sum of all Elements of the Array is "+sum);
        sc.close();
    }
}

/*
TIME COMPLEXITY : O(n) //looping n times
SPACE COMPLEXITY : O(n) //array of n elements

OUTPUT 1:
Enter the total number of elements of an array : 4
Enter the elements of the array : 48 16 12 4
Sum of all Elements of the Array is 80

OUTPUT 2:
Enter the total number of elements of an array : 0
Array is Empty. So sum is zero

*/
