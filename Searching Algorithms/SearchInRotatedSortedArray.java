/*
A java program to search target in the given rotated sorted array
LOGIC :
In a rotated sorted array, one half is always sorted,
so check which half is sorted and see if the target lies there; 
otherwise, search in the other half using binary search.
*/
import java.util.Scanner;
public class SearchInRotatedSortedArray{
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
        System.out.print("Enter the rotated sorted array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter the target element : ");
        int key=sc.nextInt();
        int low =0, high=n-1, mid;
        while(low<=high)
        {
             mid=low + (high-low)/2;
            if(arr[mid]==key){
                System.out.println("The target element is found at index "+mid);
                sc.close();
                return;
            }
            if(arr[low]<=arr[mid]) //first half is sorted
            {        
                    if(arr[low]<=key && key<arr[mid]){
                        high=mid-1; //if target lies, search target in this subarray
                    }
                    else low=mid+1; //else search in second half
            }
            else if(arr[mid]<arr[high])//second half is sorted
            {   
                if(arr[mid]<key && key<=arr[high]){
                        low=mid+1;
                }
                else high=mid-1;
            }
        }
        System.out.println("The target element is not found!");
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(log n)
Auxiliary Space : O(1)

OUTPUT 1:
Enter the total number of elements in an array : 8
Enter the rotated sorted array elements : 6 7 8 1 2 3 4 5
Enter the target element : 7
The target element is found at index 1

*/