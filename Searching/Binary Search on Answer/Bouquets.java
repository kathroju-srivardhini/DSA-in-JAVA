/*
Minimum Days to Make M Bouquets
You are given:
bloomDay[]
m bouquets
k flowers for each bouquet
Each bouquet needs k adjacent bloomed flowers.
A flower can be used in only one bouquet.
Find the minimum days to make m bouquets.
*/
import java.util.Scanner;
public class Bouquets{
    public static boolean isValid(int arr[], int k,int m, int max_value){
        int bouq=0, cons=0; //counts consecutive flowers
        for(int i=0; i<arr.length; i++){
            if(arr[i]<=max_value){
                cons++;
            } 
            else {
                cons=0; //if flower not blooms, consecutive becomes 0
            }
            if(cons==k){ //if there are enough flowers in a bouquet
               bouq++; //take a new bouquet
               cons=0;
            }
        }
            if(bouq>=m){
                return true;
            }
            else {
                return false;
            }

    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the total number of flowers to bloom : ");
        int n=sc.nextInt();
        if(n==0){
            System.out.println("There are no flowers to bloom!");
            sc.close();
            return;
        }
        int bloomDay[] =new int[n];
        System.out.print("Enter the no. of days need to bloom for each flower : ");
        bloomDay[0]=sc.nextInt();
        int max=bloomDay[0], min=bloomDay[0];
        for(int i=1;i<n;i++){
            bloomDay[i]=sc.nextInt();
            max=Math.max(max, bloomDay[i]);
            min=Math.min(min, bloomDay[i]);
        }
        System.out.print("Enter the total no. of bouquets required : ");
        int m=sc.nextInt();
        System.out.print("Enter the no. of flowers required per bouquet : ");
        int k=sc.nextInt();
        if(k==0){
            System.out.println("There are empty bouquets!");
            sc.close();
            return;
        }
        if(m*k>n){
            System.out.println("There are no enough flowers!");
            sc.close();
            return;
        }
        int low=min, high=max, mid, ans=high;
        while(low<=high){
             mid= low + (high-low)/2;
             if(isValid(bloomDay, k, m, mid)){
                ans=mid; //store ans and shrink to minimize the days
                high=mid-1;
             }
             else low=mid+1;
        }
        System.out.println("Result : "+ans);
        sc.close();
    }
}
/*
TIME COMPLEXITY : O(n*log(max-min))
Auxiliary Space : O(1)

OUTPUT 1:
Enter the total number of flowers to bloom : 8
Enter the no. of days need to bloom for each flower : 5 2 6 12 3 1 8 4
Enter the total no. of bouquets required : 2
Enter the no. of flowers required per bouquet : 3
Result : 8

OUTPUT 2:
Enter the total number of flowers to bloom : 5
Enter the no. of days need to bloom for each flower : 2 4 6 8 10
Enter the total no. of bouquets required : 3
Enter the no. of flowers required per bouquet : 2
There are no enough flowers!

OUTPUT 3:
Enter the total number of flowers to bloom : 2
Enter the no. of days need to bloom for each flower : 5 8
Enter the total no. of bouquets required : 1
Enter the no. of flowers required per bouquet : 0
There are empty bouquets!

OUTPUT 4:
Enter the total number of flowers to bloom : 0
There are no flowers to bloom!
*/