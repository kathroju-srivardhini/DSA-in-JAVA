/*
Find index i such that:
Sum of elements on left of i,
Sum of elements on right of i are equal
Note: Don't include i in both left sum and right sum
*/
import java.util.Scanner;
public class EquilibriumIndex{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty!");
            sc.close();
            return;
        }
        System.out.print("Enter the integer array elements : ");
        int[] arr=new int[n];
        int totalSum=0, leftSum=0, rightSum;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            totalSum+=arr[i]; //find the total sum
        }
        boolean found=false;
        for(int i=0;i<n;i++){
            rightSum=totalSum-leftSum-arr[i]; //calculate the right sum
            if(rightSum==leftSum){
                System.out.println("Equilibrium index : "+i);
                found=true;
            }
               leftSum+=arr[i];
        }
        if(!found){
            System.out.println("No Equilibrium index found!");
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)

OUTPUT 1:
Enter the size of the array : 6
Enter the integer array elements : 1 7 3 6 5 6
Equilibrium index : 3

OUTPUT 2:
Enter the size of the array : 2
Enter the integer array elements : 5 8
No Equilibrium index found!

OUTPUT 3:
Enter the size of the array : 0
Array is Empty!
*/