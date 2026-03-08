/*
Given an integer array of size n, find all elements that appear more than n/3 times.
Return the elements in any order.
There can be at most two such elements.
*/
import java.util.Scanner;
public class MajorityVote{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Array is empty!");
            sc.close();
            return;
        }
        int arr[]=new int[n];
        int count1=0, count2=0;
        int cand1=-1, cand2=-1;
        System.out.print("Enter the integer array elements (votes) : ");
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
            if(arr[i]==cand1){
                count1++;
            }
            else if(arr[i]==cand2){
                count2++;
            }
            else if(count1==0){
                cand1=arr[i];
                count1=1;
            }
            else if(count2==0){
                cand2=arr[i];
                count2=1;
            }
            else{
                count1--;
                count2--;
            }
        }
        count1=0;
        count2=0;
        for(int num: arr){
            if(num==cand1) count1++;
            else if(num==cand2) count2++;
        }
        if(count1>n/3 && count2>n/3){
            System.out.printf("Majority elements are %d and %d\n",cand1,cand2);
        }
        else if(count1>n/3 && count2<=n/3){
            System.out.println("Majority Element is "+cand1);
        }
        else if(count1<=n/3 && count2>n/3){
            System.out.println("Majority Element is "+cand2);
        }
        else{
            System.out.println("There no majority element!");
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
SPACE COMPLEXITY : O(1)
OUTPUT 1:
Enter the size of the array : 8
Enter the integer array elements (votes) : 1 2 5 1 2 5 1 2
Majority elements are 1 and 2

OUTPUT 2:
Enter the size of the array : 0
Array is empty!
*/