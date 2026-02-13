/*
A java program to left rotate the given array by k 
LOGIC :
Reverse first k elements
Reverse remaining n-k elements
Reverse entire array
*/
import java.util.Scanner;
public class LeftRotation{
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
        reverse(arr,0,k);
        reverse(arr,k,n);
        reverse(arr,0,n);
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
Enter the size of the array : 15
Enter the 15 integer array elements : 5 10 15 20 25 30 35 40 45 50 55 60 65 70 75
Enter k value : 5
Resultant array : 30 35 40 45 50 55 60 65 70 75 5 10 15 20 25 

OUTPUT 2:
Enter the size of the array : 0
Array is Empty!
*/