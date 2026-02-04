/*
Given an array where each element represents height of a vertical line, find two lines that form a container holding maximum water.
LOGIC: Using two-pointer technique
Use two pointers at ends, calculate area, move the pointer with smaller height to try to increase area.
Area = min(height[left], height[right]) * (right - left); 
*/
import java.util.*;
public class ContainerWithMostWater{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements in the array : ");
        int n=sc.nextInt();
        if(n<2){
            System.out.println("Atleast two heights (elements) are required");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.print("Enter the "+n+" array elements : ");
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        sc.close();
        int left=0, right=n-1;
        int maxArea=0;
        int i=0,j=0;
        while(left<right){
            if(Math.min(arr[left], arr[right]) * (right - left) > maxArea ){
                  maxArea = Math.min(arr[left], arr[right]) * (right - left);
                  i=left;
                  j=right;
            }
            if(arr[left]<=arr[right]) left++;
            else right--;
        }
        System.out.printf("The two heights are : %d and %d\n",arr[i],arr[j]);
    }
}
/*
TIME COMPLEXITY : O(n)
Auxiliary Space used : O(1)
Space for input array : O(n)

OUTPUT 1:
Enter the total number of elements in the array : 8
Enter the 8 array elements : 5 12 18 22 24 32 44 55
The two heights are : 18 and 55

OUTPUT 2:
Enter the total number of elements in the array : 5
Enter the 5 array elements : 6 2 18 4 1
The two heights are : 6 and 4

OUTPUT 3:
Enter the total number of elements in the array : 1
Atleast two heights (elements) are required.

*/