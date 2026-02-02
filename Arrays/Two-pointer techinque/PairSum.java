/*
A java program to check whether there exists a pair of elements in the given sorted array whose sum is equal to the given target.

LOGIC : Using Two pointer technique. As the array is sorted take one pointer at start and one at end.
FInd sum of values at start and end. If it is equal to target print. Else if it is lesser, move start to it's next position.
Else move end to it's before position
*/
import java.util.Scanner;
public class PairSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the target sum : ");
        int target=sc.nextInt();
        System.out.print("Enter the total number of elements in the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty");
            sc.close();
            return;
        }
        if(n==1){
            System.out.println("Array contains only one element. So no pair exists.");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.print("Enter the "+n+" array elements (sorted in ascending order): ");
        for(int i=0;i<n;i++){ //TC:O(n)
            arr[i]=sc.nextInt();
        }
        sc.close();
        int start=0, end=n-1, count=0;
        while(start<end){
            if(arr[start]+arr[end]==target){
                System.out.printf("Pair found : (%d, %d)\n",arr[start],arr[end]);
                count++;
                start++;
                end--;
            }
            else if(arr[start]+arr[end]<target){
                start++;
            }
            else end--;
        }
        if(count==0){
            System.out.println("No such pair exists..");
        }
    
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(n) //for input array

OUTPUT 1:
Enter the target sum : 80
Enter the total number of elements in the array : 6
Enter the 6 array elements (sorted in ascending order): 20 35 45 60 90 148
Pair found : (20, 60)
Pair found : (35, 45)

OUTPUT 2:
Enter the target sum : 96
Enter the total number of elements in the array : 5
Enter the 5 array elements (sorted in ascending order): 2 3 50 62 90
No such pair exists..

OUTPUT 3:
Enter the target sum : 25
Enter the total number of elements in the array : 0
Array is Empty

OUTPUT 4:
Enter the target sum : 43
Enter the total number of elements in the array : 1
Array contains only one element. So no pair exists.
*/