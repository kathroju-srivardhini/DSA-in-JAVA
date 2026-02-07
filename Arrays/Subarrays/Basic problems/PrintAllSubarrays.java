/*
A java program to print all the subarrays for the given array
*/
import java.util.*;
public class PrintAllSubarrays{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Array is Empty!");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.printf("Enter the %d integer array elements : ",n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int i=0,j=0,k=0;
        System.out.print("Subarrays : ");
        while(i<n){
            j=i;
            while(j<n){
                System.out.print("[");
                for(k=i;k<=j;k++){
                    if(k==j){
                        System.out.print(arr[k]);
                    }
                    else{
                        System.out.print(arr[k]+", ");
                    }
                }
                if(i==n-1){
                    System.out.print("]");
                }
                else{
                    System.out.print("], ");
                }
                j++;
            }
            i++;
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n^3)
Auxiliary Space : O(1)

OUTPUT 1:
Enter the size of the array : 5
Enter the 5 integer array elements : 1 2 3 4 5
Subarrays : [1], [1, 2], [1, 2, 3], [1, 2, 3, 4], [1, 2, 3, 4, 5], [2], [2, 3], [2, 3, 4], [2, 3, 4, 5], [3], [3, 4], [3, 4, 5], [4], [4, 5], [5]

OUTPUT 2:
Enter the size of the array : 0
Array is Empty!
*/