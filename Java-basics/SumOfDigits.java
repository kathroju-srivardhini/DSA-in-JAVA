import java.util.Scanner;
public class SumOfDigits{
    public static void main(String[] args){
        System.out.print("Enter a number: ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int r,sum=0;
        while(n>0){
            r=n%10;
            n=n/10;
            sum+=r;
        }
        System.out.printf("\nSum of digits in the given number is %d. ",sum);
        sc.close();
    }
}
