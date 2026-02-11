/*
A java program to find the length of the longest continuous subarray whose sum is exactly K
Concepts used : Prefix sum + Hashmap
*/
import java.util.*;
public class LengthOfLongestSubarray{
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
        map.put(0, -1);
        int sum=0;
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        System.out.print("Enter K value : ");
        int k=sc.nextInt();
        int maxLen=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
            if(sum==k) //if sum k is found, update max length
            {
                maxLen=Math.max(maxLen, i+1);
            }
            if(map.containsKey(sum-k)) 
            //sum-k indicates the sum of middle subarrays whose sum is k
            //if sum-k has appeared before, update max length
            {
                maxLen=Math.max(maxLen,i-map.get(sum-k)); //current index - starting index of the middle subarray
            }
            if(!map.containsKey(sum)) //if sum is not found in map, put it in map with index to know the length
            {
                map.put(sum,i);
            }
        }
        System.out.println("Result : "+maxLen);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
Auxiliary Space : O(n) // for hashmap

OUTPUT 1: 
Enter the size of the array : 10
Enter the 10 integer array elements : 1 2 3 4 -5 6 0 3 15 -12
Enter K value : 12
Result : 5

OUTPUT 2:
Enter the size of the array : 0
Array is Empty!
*/