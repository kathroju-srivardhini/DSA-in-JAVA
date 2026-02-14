/*
A java program to find upper bound of the given target. i.e. the first element that is strictly greater than target.
upper Bound = first index where element > target
*/
import java.util.Scanner;
public class UpperBound{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements in an array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Array is empty.");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.print("Enter the array elements (sorted in ascending order) : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element : ");
        int key=sc.nextInt();
        int low=0,high=n-1,mid,idx=n;
        while(low<=high){
           mid=low + (high-low)/2;
           if(arr[mid]>key) {
            //to find the upper bound store mid and move left
              idx= mid;
              high=mid-1;
            }
             else low=mid+1; //target>mid, so move right
        }
            System.out.println("Upper Bound index "+idx);
        sc.close();
    }

}
/*
TIME COMPLEXITY : O(log n)
Auxiliary Space : O(1)

OUTPUT 1:
Enter the total number of elements in an array : 8
Enter the array elements (sorted in ascending order) : 1 2 3 4 4 4 5 6
Enter the target element : 4
Upper Bound index 6

OUTPUT 2:
Enter the total number of elements in an array : 12 
Enter the array elements (sorted in ascending order) : 5 6 7 8 9 10 11 11 12 14 16 18
Enter the target element : 15
Upper Bound index 10

OUTPUT 3:
Enter the total number of elements in an array : 4
Enter the array elements (sorted in ascending order) : 2 4 6 8
Enter the target element : 10
Upper Bound index 4
*/