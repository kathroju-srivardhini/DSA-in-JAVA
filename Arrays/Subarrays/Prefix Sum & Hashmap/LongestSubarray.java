/*
A java program to find the longest subarray with sum 0. Array may contains negative values too.
Concept : Prefix Sum + Hashmap 
*/
import java.util.*;
public class LongestSubarray{
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
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,-1);
        int sum=0, maxLen=0;
        for(int i=0; i<n; i++){
             sum+=arr[i];
             if(map.containsKey(sum)) 
            //if sum has already appeared in map, that means there is a subarray in the middle whose sum is 0
             {
                maxLen=Math.max(maxLen, i-map.get(sum));
                //length= current index - starting index of the middle subarray
             } 
             else{
                map.put(sum,i);
                //store the first occurrence of the sum with value last index of the subarray
             }

        }
        System.out.print("Result : "+maxLen);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n)
Auxiliary Space : O(n)

OUTPUT 1 : 
Enter the size of the array : 8
Enter the 8 integer array elements : 1 -1 3 2 -2 -3 5 0
Result : 6

OUTPUT 2:
Enter the size of the array : 0
Array is Empty!
*/