/*
A java program to reverse the given array in-place (without using another array) 
LOGIC : Two-pointer technique.
Take one pointer at start and another one at end.
swap the values present in them, and move the pointers inward. Repeat the same while start<end

*/
import java.util.Scanner;
public class ReverseAnArray{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements in the array : ");
        int n=sc.nextInt();
        if(n<2){
            System.out.print("Array can't be reversed.");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.print("Enter the "+n+" array elements : ");
        for(int a=0;a<n;a++){
            arr[a]=sc.nextInt();
        }
        int i=0,j=n-1;
        while(i<j){
            int temp=arr[i];
            arr[i]=arr[j];
            arr[j]=temp;
            i++;
            j--;
        }
        System.out.print("Reversed array : ");
        for(int m=0;m<n;m++){
            System.out.print(arr[m]+" ");
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE (for input array):O(n)
Auxiliary space : O(1)

OUTPUT 1:
Enter the total number of elements in the array : 8
Enter the 8 array elements : 64 32 55 12 0 16 28 4
Reversed array : 4 28 16 0 12 55 32 64 

OUTPUT 3:
Enter the total number of elements in the array : 5
Enter the 5 array elements : 42 43 44 45 46
Reversed array : 46 45 44 43 42 

OUTPUT 3:
Enter the total number of elements in the array : 1
Array can't be reversed.
*/