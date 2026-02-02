//A java program to check if an array is palindrome or not
//PALINDROME : the array that reads same from backward and from forward
//LOGIC : Using Two-pointer technique
//one is start and another one is end. 
//while start<=end if arr[start]!=arr[end] then it is not a palindrome. Update start++, end--
//if loop completes then it is a palindrome
import java.util.Scanner;
public class IsPalindrome{
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
        System.out.print("Enter the "+n+" array elements : ");
        for(int i=0;i<n;i++){ //TC:O(n)
            arr[i]=sc.nextInt();
        }
        sc.close();
        int start=0, end=n-1;
        while(start<end){ //TC:O(n/2)
            if(arr[start]!=arr[end]){
                System.out.println("It is not a palindrome");
                return;
            }
            start++;
            end--;
        }
        System.out.println("It is a palindrome");
    }
} 
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(n)
Auxiliary Space Complexity : O(1)
Input Space : O(n)


OUTPUT 1:
Enter the total number of elements in the array : 6
Enter the 6 array elements : 5 9 2 2 9 5
It is a palindrome

OUTPUT 2:
Enter the total number of elements in the array : 6
Enter the 6 array elements : 1 2 3 4 2 1
It is not a palindrome

OUTPUT 3:
Enter the total number of elements in the array : 0
Array is Empty
*/