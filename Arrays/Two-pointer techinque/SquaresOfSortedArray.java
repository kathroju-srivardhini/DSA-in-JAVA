/*
A java program that takes a sorted array (may contain negative numbers), return a new array of squares sorted in ascending order.
Negative numbers become large when squared
LOGIC : Using two-pointer technique
one pointer is at start and one is at end. pointer k tracks the elements in the resultant array.
the largest square among two elements at pointers is stored in the resultant array. Then move inward.
*/
import java.util.*;
public class SquaresOfSortedArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements in the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.print("Enter the "+n+" array elements (sorted in ascending order): ");
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        sc.close();
        int start=0, end=n-1,k=n-1;
        int[] res=new int[n]; //O(n)
        while(start<=end){ 
            if(arr[start]*arr[start]< arr[end]*arr[end]){
                  res[k]=arr[end]*arr[end];
                  end--;
                  k--;
            }
            else {
                res[k]=arr[start]*arr[start];
                start++;
                k--;
            }
        }
        System.out.print("Array of Squares : ");
        for(int num=0;num<n;num++){
            System.out.print(res[num]+" ");
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY: O(n)
SPACE COMPLEXITY: O(n)
Auxiliary space : O(n), input space : O(n)

OUTPUT 1:
Enter the total number of elements in the array : 6
Enter the 6 array elements (sorted in ascending order): -8 -3 -1 2 6 9
Array of Squares : 1 4 9 36 64 81 

OUTPUT 2:
Enter the total number of elements in the array : 10
Enter the 10 array elements (sorted in ascending order): -11 -9 -2 -1 0 1 4 6 10 12
Array of Squares : 0 1 1 4 16 36 81 100 121 144 

OUTPUT 3:
Enter the total number of elements in the array : 0
Array is Empty
*/
