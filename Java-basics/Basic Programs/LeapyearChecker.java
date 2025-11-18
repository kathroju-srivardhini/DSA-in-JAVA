//Every 4th year is leap, except century years (like 1900, 2100)... unless they’re multiples of 400
import java.util.Scanner;
public class LeapYearChecker{
    public static void main(String[] args){
        System.out.print("Enter the year : ");
        Scanner sc= new Scanner(System.in);
          int year=sc.nextInt();
          if(year%100==0){
            if(year%400==0){
                System.out.printf("\n%d is a leap year",year);
            }
            else{
                System.out.printf("\n%d is not a leap year",year);
            }
          }
          else if (year%4==0){
            System.out.printf("\n%d is a leap year",year);
            }
          else{
            System.out.printf("\n%d is not a leap year",year);
          }
          sc.close();
    }
    
}
