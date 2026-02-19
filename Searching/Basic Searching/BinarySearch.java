/*
A java program to search target element in the given sorted array using binary Search
LOGIC : 
At every step, cut the array into two halfs using mid. This reduces time complexity to O(log n)
if target<mid, move left
if target>mid, move right
*/
import java.util.Scanner;
public class BinarySearch{
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
        int low=0,high=n-1,mid;
        while(low<=high){
        //mid=(low+high)/2 : May exceeds the integer size when large values are added
           mid=low + (high-low)/2; 
        //add the half distance to low to get mid
           if(arr[mid]==key){
              System.out.println("The target is found at index "+mid);
              sc.close();
              return;
          }
          else if(key<arr[mid]){
            high=mid-1; //move left
          }
          else low=mid+1; //target>mid, so move right
       }
        System.out.println("Target element not found!");
        sc.close();
    }

}
/*
TIME COMPLEXITY : O(log(n))
Auxiliary Space : O(1)

OUTPUT 1:
Enter the total number of elements in an array : 8
Enter the array elements (sorted in ascending order) : 1 2 3 4 55 66 99 1111
Enter the target element : 99
The target is found at index 6

OUTPUT 2:
Enter the total number of elements in an array : 9
Enter the array elements (sorted in ascending order) : 11 12 13 14 15 16 17 18 19
Enter the target element : 25
Target element not found!

OUTPUT 3:
Enter the total number of elements in an array : 0
Array is empty!
*/