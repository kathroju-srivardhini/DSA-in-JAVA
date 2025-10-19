import java.util.Scanner;
public class Avg {
    public static void main(String[] args){
        System.out.print("Enter how many numbers:");
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt();
        int sum=0;
        System.out.print("\nEnter the"+n+ "numbers one by one: \n");
        for(int i=0;i<n;i++){
           int num=sc.nextInt();
           sum+=num;

        }
        double avg=sum/n;
        System.out.printf("The average of given numbers is %.2f",avg);
    }
    
}
