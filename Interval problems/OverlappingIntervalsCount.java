/*
Given meeting time intervals,
return the maximum number of intervals overlapping at any time.
LOGIC : If next meeting starts before earliest meeting ends → active++; else active--.
*/
import java.util.Arrays;
import java.util.Scanner;
public class OverlappingIntervalsCount{
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
        int start[]=new int[n];
        int end[]=new int[n];
        for(int i=0;i<n;i++){
            System.out.printf("Meeting %d : ",i+1);
            start[i]=sc.nextInt();
            end[i]=sc.nextInt();
        }
        Arrays.sort(start);
        Arrays.sort(end);
        int active=0, max=0;
        int i=0, j=0;
        while(i<n && j<n){
            if(start[i]<end[j]){
                active++; //new meeting starts
                max=Math.max(max,active);
                i++;
            }
            else{
                active--; //meeting ended
                j++; 
            }
        }
        System.out.println("Result : "+max);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n log n)
SPACE COMPLEXITY : O(n)

OUTPUT 1:
Enter the total no. of meetings : 5
Enter the meetings time intervals (as per 24 hour clock):
Meeting 1 : 6 8
Meeting 2 : 10 12
Meeting 3 : 4 5
Meeting 4 : 8 9
Meeting 5 : 11 14
Result : 2

OUTPUT 2:
Enter the total no. of meetings : 2
Enter the meetings time intervals (as per 24 hour clock):
Meeting 1 : 15 18
Meeting 2 : 20 24
Result : 1

OUTPUT 3:
Enter the total no. of meetings : 0
There are no meetings!
*/