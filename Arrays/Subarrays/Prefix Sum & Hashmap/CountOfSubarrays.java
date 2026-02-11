/*
A java program to count the number of continuous subarrays whose sum is exactly equal to K
LOGIC: Keep a running prefix sum, and at each index add to the count how many times (currentSum − K) has already appeared in the HashMap.
*/
import java.util.*;
public class CountOfSubarrays{
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
        System.out.print("Enter K value : ");
        int k=sc.nextInt();
        for(int r=0; r<n; r++){
                sum+=arr[r];
                if(map.containsKey(sum-k))
                //a subarray ending here has sum K
                { 
                      count += map.get(sum - k);
                }
                map.put(sum,map.getOrDefault(sum,0)+1);
        }
        System.out.print(count);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
Auxiliary Space : O(n) //Hashmap

OUTPUT 1:
Enter the size of the array : 5
Enter the 5 integer array elements : 2 -2 1 5 1
Enter K value : 1
3
*/