/*
Given intervals (meeting times),
determine if a person can attend all meetings.
Return true if no intervals overlap.
*/
import java.util.Arrays;
import java.util.Scanner;
public class Meetings1{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total no. of meetings : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("There are no meetings!");
            sc.close();
            return;
        }
        System.out.print("Enter the meetings time intervals (as per 24 hour clock):\n");
        int arr[][]=new int[n][2];
        for(int i=0;i<n;i++){
            System.out.printf("Meeting %d : ",i+1);
            arr[i][0]=sc.nextInt();
            arr[i][1]=sc.nextInt();
        }
        Arrays.sort(arr, (a, b) -> a[0] - b[0]); //O(n log n)
        for(int i=0;i<n;i++){
            if(i+1<n && arr[i][1]>arr[i+1][0]){ //if overlaps return false
                System.out.println("Meetings are overlapping!\nThe person cannot attend all the meetings.");
                sc.close();
                return;
            }
        }
        System.out.println("The person can attend all the meetings.");
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n log n)
SPACE COMPLEXITY : O(1)

OUTPUT 1:
Enter the total no. of meetings : 4
Enter the meetings time intervals (as per 24 hour clock):
Meeting 1 : 1 2
Meeting 2 : 3 6
Meeting 3 : 7 9
Meeting 4 : 10 11
The person can attend all the meetings.

OUTPUT 2:
Enter the total no. of meetings : 6
Enter the meetings time intervals (as per 24 hour clock):
Meeting 1 : 4 8
Meeting 2 : 6 10
Meeting 3 : 1 2
Meeting 4 : 3 4
Meeting 5 : 5 6
Meeting 6 : 11 12
Meetings are overlapping!
The person cannot attend all the meetings.

OUTPUT 3:
Enter the total no. of meetings : 0
There are no meetings!
*/