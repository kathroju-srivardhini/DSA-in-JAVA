/*
Given meeting time intervals,
return the minimum number of rooms needed so that no meetings overlap in the same room.
LOGIC :
If a meeting starts before the earliest meeting ends, increase room count;
otherwise free a room
*/
import java.util.Arrays;
import java.util.Scanner;
public class MeetingRooms{
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
        int rooms=0, max=0;
        int i=0, j=0;
        while(i<n && j<n){
            if(start[i]<end[j]){
                rooms++; //new meeting starts
                max=Math.max(max,rooms);
                i++;
            }
            else{
                rooms--; //meeting ended
                j++; 
            }
        }
        System.out.println("Number of rooms required : "+max);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n log n)
SPACE COMPLEXITY : O(n)

OUTPUT 1:
Enter the total no. of meetings : 6
Enter the meetings time intervals (as per 24 hour clock):
Meeting 1 : 1 8
Meeting 2 : 7 18
Meeting 3 : 20 24
Meeting 4 : 6 7
Meeting 5 : 5 9
Meeting 6 : 12 16
Number of rooms required : 3

OUTPUT 2:
Enter the total no. of meetings : 2
Enter the meetings time intervals (as per 24 hour clock):
Meeting 1 : 15 18
Meeting 2 : 20 24
Number of rooms required : 1

OUTPUT 3:
Enter the total no. of meetings : 0
There are no meetings!
*/