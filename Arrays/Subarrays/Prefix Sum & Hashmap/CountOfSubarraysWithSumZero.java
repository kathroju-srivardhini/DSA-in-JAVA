/*
A java program to count the number of continuous subarrays whose sum is exactly equal to 0
LOGIC: Keep a running prefix sum, and at each index add to the count how many times sum has already appeared in the HashMap.
*/
import java.util.*;
public class CountOfSubarraysWithSumZero{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("Array is Empty!");
            sc.close();
            return;
        }
        System.out.printf("Enter the %d integer array elements : ",n);
        int[] arr=new int[n];
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        int sum=0, count =0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        for(int r=0; r<n; r++){
                sum+=arr[r];
                if(map.containsKey(sum))
                { 
                      count += map.get(sum);
                }
                map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.print(count);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
auxiliary Space : O(n) //hashmap

OUTPUT 1:
Enter the size of the array : 6
Enter the 6 integer array elements : 1 -1 2 -2 3 -3
6

OUTPUT 2:
Enter the size of the array : 0
Array is Empty!
*/