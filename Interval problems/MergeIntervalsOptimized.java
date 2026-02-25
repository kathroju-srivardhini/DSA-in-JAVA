/*
A java program to merge the overlapping intervals in-place i.e. without using an extra array
Space optimized from O(n) to O(1)
LOGIC : 
 Sort 
 compare with last merged interval
 merge or store.
 All merged intervals are stored from index 0 to k.
*/
import java.util.Arrays;
import java.util.Scanner;
public class MergeIntervalsOptimized{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total no. of intervals : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("There no intervals!");
            sc.close();
            return;
        }
        int [][] arr = new int[n][2];
        for(int i=0; i<n; i++){
            System.out.printf("Enter the interval %d : ",i+1);
            for(int j=0; j<2; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]); //O(n log n)
        int k=0;
       for(int i=1; i<n; i++){
        if(arr[i][0]<=arr[k][1])//if overlapping
        {
            arr[k][1]=Math.max(arr[k][1], arr[i][1]);
        }
        else{
            k++;
            arr[k][0]=arr[i][0];
            arr[k][1]=arr[i][1];
        }
       }
        System.out.println("Intervals after merging : ");
        for(int a=0;a<=k;a++){
            System.out.printf("Interval %d : ",a+1);
            for(int j=0;j<2;j++){
                System.out.print(arr[a][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n log n)
Auxiliary space : O(1)

OUTPUT 1:
Enter the total no. of intervals : 6
Enter the interval 1 : 1 5
Enter the interval 2 : 2 4
Enter the interval 3 : 6 8
Enter the interval 4 : 9 10
Enter the interval 5 : 7 11
Enter the interval 6 : 15 16
Intervals after merging : 
Interval 1 : 1 5
Interval 2 : 6 11
Interval 3 : 15 16

OUTPUT 2:
Enter the total no. of intervals : 0
There no intervals!
*/