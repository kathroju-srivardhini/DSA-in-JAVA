import java.util.Scanner;
public class ReverseAnumber {
    public static void main(String[] args){
         System.out.print("Enter a number : ");
         Scanner sc=new Scanner(System.in);
         int n=sc.nextInt();
         int r, num=0;
         while(n>0){
            r=n%10;
            num=num*10+r;
            n=n/10;
         }
         System.out.printf("\n The number after reversing is "+ num);
         sc.close();
    }
}
