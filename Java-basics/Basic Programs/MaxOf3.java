import java.util.Scanner;
public class MaxOf3 {
    public static void main(String[] args){
         System.out.print("Enter 3 numbers :");
         Scanner sc=new Scanner(System.in);
         int a=sc.nextInt();
         int b=sc.nextInt();
         int c=sc.nextInt();
         if(a>b){
            if(a>c){
                System.out.printf("\n%d is largest among the 3 numbers",a);
            }
            else{
                System.out.printf("\n%d is largest among the 3 numbers",c);
            }
         }
         else if(b>c){
            System.out.printf("\n%d is largest among the 3 numbers",b);
         }
         else{
            System.out.printf("\n%d is largest among the 3 numbers",c);
         }
         sc.close();
    }
}
