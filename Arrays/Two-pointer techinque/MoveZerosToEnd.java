/*
A java program to move all the zeros presnt in the array to the end (in-place).
Without using another array. 
Maintain the relative order of non-zero elements
It can be done using two-pointer technique
*/
import java.util.Scanner;
public class MoveZerosToEnd{
 public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total number of elements in the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty");
            sc.close();
            return;
        }
        if(n==1){
            System.out.println("Array contains only one element. So we can't move zero to end (if any).");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.print("Enter the "+n+" array elements : ");
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        int i=-1,j=0;
        //i indicates last index of the non-zero elements
        while(j<n){
            if(arr[j]!=0){ //if non-zero element found
                i++; //increment i
                if(i>=n) break;
                if(i!=j){
                arr[i]=arr[j]; //place the non-zero element in place of i
                arr[j]=0;
                }
            }
            j++;
        }
        System.out.print("Updated Array : ");
        for(int num=0; num<n; num++){
            System.out.print(arr[num]+" ");
        }
        sc.close();
 }
}
/*
TIME COMPLEXITY : O(n)
Space used for input array : O(n)
Auxiliary Space : O(1)

OUTPUT 1:
Enter the total number of elements in the array : 10
Enter the 10 array elements : 25 0 0 6 2 0 14 34 0 10
Updated Array : 25 6 2 14 34 10 0 0 0 0 

OUTPUT 2:
Enter the total number of elements in the array : 8
Enter the 8 array elements : 0 5 0 0 16 0 2 4
Updated Array : 5 16 2 4 0 0 0 0 

OUTPUT 3:
Enter the total number of elements in the array : 1
Array contains only one element. So we can't move zero to end (if any).

OUTPUT 4:
Enter the total number of elements in the array : 0
Array is Empty
*/