/*
Problem Statement – Aggressive Cows
You are given:
An array stalls[] representing positions of stalls.
An integer k representing number of cows.
Your task:
Place k cows in stalls such that:
Only one cow per stall.
Maximize the minimum distance between any two cows.
Return that maximum possible minimum distance.
*/
import java.util.Scanner;
import java.util.Arrays;
public class AggressiveCows{
    public static boolean isValid(int arr[], int k, int minDis){
        int last_placed_idx=0, cows=1;  //place a cow in first stall
        for(int i=1;i<arr.length; i++){
              if(arr[i]-arr[last_placed_idx]>=minDis){
                last_placed_idx=i;
                cows++;
              }
        }
        if(cows>=k){
            return true;
        }
        else return false;
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total no. of stalls : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.print("There are no stalls!");
            sc.close();
            return;
        }
        int[] stalls=new int[n];
        System.out.print("Enter the position of each stall : ");
        for(int i=0;i<n;i++){
            stalls[i]=sc.nextInt();
        }
        Arrays.sort(stalls); //This works only for sorted array TC:O(n*log n)
        System.out.print("Enter the total no. of cows : ");
        int k=sc.nextInt();
        if(k>n){
            System.out.println("There are no enough stalls!");
            sc.close();
            return;
        }
        if(k==0){
            System.out.print("There are no cows!");
            sc.close();
            return;
        }
        int low=1 ;//minimum possible answer when 2 cows sit in adjacent stalls
        int high=stalls[n-1]-stalls[0];
        int mid;
        int ans=0;
        while(low<=high) //binary search on distance range so TC:O(log(max_distance))
        {
            mid=low+(high-low)/2;
            if(isValid(stalls, k, mid))//O(n)
            {
                ans=mid;
                low=mid+1; //move right to maximize the minimum distance
            } else{
                high=mid-1; //move left
            }
        }
        System.out.println("Result : "+ans);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n*log n + n*log(max_distance))
Auxiliary Space : O(1)

OUTPUT 1 :
Enter the total no. of stalls : 5
Enter the position of each stall : 9 8 1 2 4
Enter the total no. of cows : 3
Result : 3

OUTPUT 2:
Enter the total no. of stalls : 2 
Enter the position of each stall : 5 10
Enter the total no. of cows : 3
There are no enough stalls!

OUTPUT 3:
Enter the total no. of stalls : 0
There are no stalls!

OUTPUT 4:
Enter the total no. of stalls : 2
Enter the position of each stall : 4 6
Enter the total no. of cows : 0
There are no cows!
*/