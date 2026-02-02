//A simple java program to reverse the given array in-place without using another array
//LOGIC : Take two pointers, one is at starting and another is at the end of the array. Swap the both. 
// Then move start to it's next position and end to it's before position. Repeat the same while start<=end
import java.util.Scanner;
public class ReversingAnArray{
    public static void main(String[] args){
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements in an array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Array is empty.");
            sc.close();
            return;
        }
        if(n==1){
            System.out.print("Enter the Array Element : ");
            int num= sc.nextInt();
            System.out.print("Reversed Array : "+num);
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.print("Enter the elements(integers) of the array : ");
        for(int i=0;i<arr.length;i++){
            arr[i]=sc.nextInt(); //TC: O(n)
        }
        int start=0, end=n-1;
        while(start<end){ //TC: O(n/2)
           int temp=arr[start];
           arr[start]=arr[end];
           arr[end]=temp;
           start++;
           end--;
        }
        System.out.println("Reversed Array : ");
        for(int i=0;i<arr.length;i++){ //O(n)
            System.out.print(arr[i]+" ");
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(n)

OUTPUT 1:
Enter the total number of elements in an array : 4 
Enter the elements(integers) of the array : 15 64 73 96
Reversed Array : 
96 73 64 15

OUTPUT 2:
Enter the total number of elements in an array : 0
Array is empty.

OUTPUT 3:
Enter the Array Element : 45
Reversed Array : 45

*/