/*
Given a non-overlapping list of intervals and a new interval to add.
Write a java program to insert the new interval and merge the overlapping intervals using an extra array
LOGIC : 
 Scan intervals once, add non-overlapping ones directly, merge overlapping ones by expanding the new interval, and append the remaining.
*/
import java.util.Arrays;
import java.util.Scanner;
public class InsertAndMergeIntervals{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total no. of intervals : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("There are no intervals!");
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
        System.out.print("Enter the new interval you want to add : ");
        int new_start=sc.nextInt();
        int new_end=sc.nextInt();
        int [][] res=new int[n+1][2];
        int k=0;
        int i=0;
        //Phase 1: interval lies before new interval
        while(i<n && arr[i][1]<new_start){
            res[k][0]=arr[i][0];
            res[k][1]=arr[i][1];
            i++;
            k++;
        }
        //Phase 2: interval overlaps new interval
        while(i<n && arr[i][0]<=new_end){
            new_start=Math.min(new_start, arr[i][0]);
            new_end=Math.max(new_end,arr[i][1]);
            i++;
        }
        //Add merged interval or new interval
        res[k][0]=new_start;
        res[k][1]=new_end;
        k++;
        //Phase 3: Interval comes after the new interval (Remaining intervals)
        while(i<n){
            res[k][0]=arr[i][0];
            res[k][1]=arr[i][1];
            k++;
            i++;
        }
        System.out.println("Intervals after merging : ");
        for(int a=0;a<k;a++){
            System.out.printf("Interval %d : ",a+1);
            for(int j=0;j<2;j++){
                System.out.print(res[a][j]+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n log n)
Auxiliary space : O(n)

OUTPUT 1:
Enter the total no. of intervals : 5
Enter the interval 1 : 1 5
Enter the interval 2 : 6 10
Enter the interval 3 : 11 15
Enter the interval 4 : 16 20
Enter the interval 5 : 21 25
Enter the new interval you want to add : 12 18
Intervals after merging : 
Interval 1 : 1 5
Interval 2 : 6 10
Interval 3 : 11 20
Interval 4 : 21 25

OUTPUT 2:
Enter the total no. of intervals : 0
There are no intervals!
*/