/*
A java program to find the first negative element in every window of size k. 
If there is no negative element then return 0.
LOGIC: Fixed sliding window technique is used.
When the window moves, remove indices that go out of range and add new negative indices in queue.
The front of the queue always gives the first negative element of the current window.
*/
import java.util.*;
public class FirstNegative{
public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the size of the array : ");
    int n=sc.nextInt();
    if(n==0){
        System.out.print("Array is Empty!");
        sc.close();
        return;
    }
    int[] arr = new int[n];
    System.out.print("Enter the "+n+" array elements : ");
    for(int i=0;i<n;i++){
        arr[i]=sc.nextInt();
    }
    System.out.print("Enter the window size (k) : ");
    int k=sc.nextInt();
    if(k > n){
    System.out.print("Invalid window size!");
    return;
    }
    Queue<Integer> q = new LinkedList<>();
    int left=0,right=0;
    for(right=0;right<k;right++) //O(k)
    {
          if(arr[right]<0) {
          q.add(right);
          }
    }
    if(q.isEmpty()){
                System.out.print("0 ");
    }
    else System.out.print(arr[q.peek()]+" ");
    left++;
    for(right=k;right<n;right++) //O(n-k)
    {
            if(arr[right]<0) //checking the incoming element
            {
                q.add(right);
            }
            if(q.isEmpty()){
                System.out.print("0 ");
            }
            else System.out.print(arr[q.peek()]+" ");
        
            if(!q.isEmpty() && q.peek()==left) //checking the outgoing element
            {
            q.poll();
            }
            left++;
    }
    sc.close();
}
}
/*
TIME COMPLEXITY : O(n)
Auxiliary Space : O(k) //for storing values in queue

OUTPUT 1:
Enter the size of the array : 8
Enter the 8 array elements : 12 -1 -7 8 -15 30 16 28
Enter the window size (k) : 3
-1 -1 -7 -15 -15 0 

OUTPUT 2:
Enter the size of the array : 12
Enter the 12 array elements : 14 -3 -1 4 5 2 -12 -9 32 10 -11 55
Enter the window size (k) : 3
-3 -3 -1 0 -12 -12 -12 -9 -11 -11 

OUTPUT 4:
Enter the size of the array : 2
Enter the 2 array elements : 4 -1
Enter the window size (k) : 3
Invalid window size!

OUTPUT 3:
Enter the size of the array : 0
Array is Empty!
*/