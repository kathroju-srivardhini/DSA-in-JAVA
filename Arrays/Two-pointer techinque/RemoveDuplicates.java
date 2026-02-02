/*
A java program to remove duplicates from a sorted array using two pointer technique
*/
import java.util.Scanner;
public class RemoveDuplicates{
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
            System.out.println("Array contains only one element. So no duplicates exists.");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.print("Enter the "+n+" array elements (sorted in ascending order): ");
        for(int i=0;i<n;i++){ 
            arr[i]=sc.nextInt();
        }
        int i=0,j=1;
        //i indicates last index of the unique elements
        while(j<n){
            if(arr[j]!=arr[i]){ //unique element found
                i++; //one more index is extended in unique elements
                arr[i]=arr[j]; //the index is updated to the unique value
            }
            //if duplicate is present, ignore
            j++;
        }
        System.out.print("Unique elements array : ");
        for(int num=0;num<=i;num++){
            System.out.print(arr[num]+" ");
        }
            
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(n) //for input array
Auxiliary space complexity : O(1)

OUTPUT 1:
Enter the total number of elements in the array : 15
Enter the 15 array elements (sorted in ascending order): 1 2 5 5 18 18 18 21 21 43 64 64 64 97 100
Unique elements array : 1 2 5 18 21 43 64 97 100 

OUTPUT 2:
Enter the total number of elements in the array : 0
Array is Empty

OUTPUT 3:
Enter the total number of elements in the array : 1
Array contains only one element. So no duplicates exists.
*/