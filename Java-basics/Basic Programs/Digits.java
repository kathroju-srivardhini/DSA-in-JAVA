import java.util.Scanner;
public class Digits {
    public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc= new Scanner(System.in);
        long num=sc.nextLong();
        System.out.printf("\nNumber of Digits in %d is %d",num,count(num));
        System.out.printf("\nSum of Even Digits in %d is %d",num,evenSum(num));
        sc.close();
    }
    public static int count(long n){
         int c=0;
         long r;
         while(n>0){
            r=n%10;
            n=n/10;
            c++;
         }
         return c;
    }
    public static int evenSum(long n){
        int sum=0;
        long r;
        while(n>0){
            r=n%10;
           if(r%2==0){
            sum+=r;
           }
           n=n/10;
        }
        return sum;
    }
}
