/*
A java program to right rotate the given array by k 
Reverse entire array
Reverse first k elements
Reverse remaining n-k elements
*/
import java.util.Scanner;
public class RightRotation{
    static void reverse(int[] array, int start, int end){
            int x=start, y=end-1;
            while(x<y){
                int temp=array[x];
                array[x]=array[y];
                array[y]=temp;
                x++;
                y--;
            }
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty!");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.printf("Enter the %d integer array elements : ",n);
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter k value : ");
        int k=sc.nextInt();
        k=k%n;
        reverse(arr,0,n);
        reverse(arr,0,k);
        reverse(arr,k,n);
        System.out.print("Resultant array : ");
        for(int j=0;j<n;j++){
            System.out.print(arr[j]+" ");
        }
        System.out.println();
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
Auxiliary Space : O(1)

OUTPUT 1: 
Enter the size of the array : 7
Enter the 7 integer array elements : 1 2 3 4 5 6 7
Enter k value : 3
Resultant array : 5 6 7 1 2 3 4 

OUTPUT 2:
Enter the size of the array : 10
Enter the 10 integer array elements : 1 2 3 4 5 6 7 8 9 10
Enter k value : 12
Resultant array : 9 10 1 2 3 4 5 6 7 8 

OUTPUT 3:
Enter the size of the array : 0
Array is Empty!
*/