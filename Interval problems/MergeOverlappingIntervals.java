/*
A java program to merge the overlapping intervals using an extra array
LOGIC : 
 Sort 
 compare with last merged interval
 merge or store.
*/
import java.util.Arrays;
import java.util.Scanner;
public class MergeOverlappingIntervals{
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
        int [][] temp = new int[n][2];
        for(int i=0; i<n; i++){
            System.out.printf("Enter the interval %d : ",i+1);
            for(int j=0; j<2; j++){
                arr[i][j]=sc.nextInt();
            }
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]); //O(n log n)
        int k=0, i=0;
        while(i<n){
            int start=arr[i][0];
            int end=arr[i][1];
             while(i+1<n && arr[i+1][0]<=end){ //while overlapping, merge
                    end=Math.max(end, arr[i+1][1]);
                    i++;
                }
                    temp[k][0]=start;
                    temp[k][1]=end;
                    k++;
                    i++;
           
        }
        //TC of nested while loop is O(n) because each interval is processed exactly once.
        System.out.println("Intervals after merging : ");
        for(int a=0;a<k;a++){
            System.out.printf("Interval %d : ",a+1);
            for(int j=0;j<2;j++){
                System.out.print(temp[a][j]+" ");
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
Enter the total no. of intervals : 6
Enter the interval 1 : 1 4
Enter the interval 2 : 3 6
Enter the interval 3 : 4 8
Enter the interval 4 : 9 12
Enter the interval 5 : 13 15
Enter the interval 6 : 14 16
Intervals after merging : 
Interval 1 : 1 8 
Interval 2 : 9 12
Interval 3 : 13 16

OUTPUT 2:
Enter the total no. of intervals : 0
There no intervals!
*/