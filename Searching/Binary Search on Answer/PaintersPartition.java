/*
Problem: Minimum Time to Paint Boards
You have n boards of different lengths
You have k painters (say 2)
Each painter can paint continuous boards only
Time to paint a board = length of the board (1 unit time per length)
Goal: Find the minimum time needed to paint all boards
*/
import java.util.Scanner;
public class PaintersPartition{

    public static boolean isValid(int[] boards, int k, int maxTime)
    //This function checks if it is possible to paint all boards
    // using at most k painters such that no painter paints
    // more than maxTime units.
    {
        int painters=1; //start with first painter
        int sum=0; //assigned work of current painter
        for(int i=0;i<boards.length; i++){
        if(sum+boards[i]>maxTime)
        //If adding current board exceeds maxTime, assign new painter
        {
            painters++;
            sum=boards[i]; //new painter starts with current board
        } 
        else sum+=boards[i]; //same painter continues
        }
        if(painters>k)
        //If no. of painters required is exceed k, not valid    
        {
            return false;
        }
        else return true;
        
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of elements in an array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("Array is empty.");
            sc.close();
            return;
        }
        int[] arr=new int[n];
        System.out.print("Enter the array elements : ");
        arr[0]=sc.nextInt();
        int max_board=arr[0];
        int sum=arr[0]; //total sum of all the boards
        for(int i=1;i<n;i++){
            arr[i]=sc.nextInt();
            max_board=Math.max(max_board, arr[i]);
            sum+=arr[i];
        }
        System.out.print("Enter the no. of painters : ");
        int k=sc.nextInt();
        int low=max_board,//minimum possible answer
         high=sum, //maximum possible answer
         ans=high; //final answer
        while(low<=high){
           int mid = low + (high-low)/2;
           if(isValid(arr,k,mid))
            // Check if mid is a valid maximum time
            {
               ans=mid; //store possible answer
               high=mid-1; //try smaller possible answer
           }
           else low=mid+1; //increase low
        }
        System.out.println("Minimum Time : "+ans);
        sc.close();
    }

}
/*
TIME COMPLEXITY : O(n*log(sum))
Auxiliary Space : O(1)

OUTPUT 1:
Enter the total number of elements in an array : 4
Enter the array elements : 30 10 40 20
Enter the no. of painters : 2
Minimum Time : 60

OUTPUT 2:
Enter the total number of elements in an array : 4
Enter the array elements : 5 5 5 5
Enter the no. of painters : 2
Minimum Time : 10

OUTPUT 3:
Enter the total number of elements in an array : 0
Array is empty!
*/