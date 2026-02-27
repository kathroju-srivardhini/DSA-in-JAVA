/*
Given an array, find all unique triplets such that:
arr[i] + arr[j] + arr[k] = 0
Concept : Sorting + Two pointer technique
LOGIC : 
Sort the array, fix one element, and use two pointers to find remaining two elements while skipping duplicates.
*/
import java.util.Scanner;
import java.util.Arrays;
public class ThreeSum{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty!");
            sc.close();
            return;
        }
        int arr[]=new int[n];
        System.out.print("Enter the integer array elements : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();

        }
        Arrays.sort(arr); //O(n log n)
        int left=0, right=n-1, temp;
        boolean found=false;
        for(int i=0;i<n-2;i++){ //O(n^2)
            if(i>0 && arr[i] == arr[i-1]) continue; //to stop duplication
            left=i+1;
            right=n-1;
            while(left<right){
                temp=arr[i]+arr[left]+arr[right];
                if(temp==0){
                    found=true;
                    System.out.printf("Result : [%d, %d, %d]\n",arr[i],arr[left],arr[right]);
                    //To avoid duplicates in triplets
                    while(left<right && arr[left]==arr[left+1]) left++;
                    while(left<right && arr[right]==arr[right-1]) right--;
                    left++;
                    right--;
                }
                else if(temp<0){
                    left++;
                }
                else right--;
            }
        }if(!found){
            System.out.println("No triplet found!");
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n^2)
SPACE COMPLEXITY : O(1)

OUTPUT 1:
Enter the size of the array : 8          
Enter the integer array elements : -1 -2 0 5 7 4 3 -5
Result : [-5, -2, 7]
Result : [-5, 0, 5]
Result : [-2, -1, 3]

OUTPUT 2:
Enter the size of the array : 4
Enter the integer array elements : 1 5 8 4
No triplet found!

OUTPUT 3:
Enter the size of the array : 5
Enter the integer array elements : -1 -1 -1 2 2
Result : [-1, -1, 2]

OUTPUT 4:
Enter the size of the array : 0
Array is Empty!
*/