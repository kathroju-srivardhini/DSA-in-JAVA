/*
A java program to find lower bound of the given target. i.e. the first element that is not smaller than target.
Lower Bound = first index where element ≥ target
*/
import java.util.Scanner;
public class LowerBound{
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
           if(arr[mid]>=key) {
            //to find the lower bound store mid and move left
              idx= mid;
              high=mid-1;
            }
             else low=mid+1; //target>mid, so move right
        }
            System.out.println("Lower Bound index "+idx);
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
Lower Bound index 3

OUTPUT 2:
Enter the total number of elements in an array : 5
Enter the array elements (sorted in ascending order) : 1 3 5 7 9
Enter the target element : 6
Lower Bound index 3

OUTPUT 3:
Enter the total number of elements in an array : 4
Enter the array elements (sorted in ascending order) : 2 4 6 8
Enter the target element : 10
Lower Bound index 4
*/