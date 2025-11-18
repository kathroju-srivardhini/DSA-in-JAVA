import java.util.Scanner;
public class Swap {
    public static void main(String [] args){
        System.out.print("Enter two numbers a & b :");
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        int a1=a, b1=b;
        int a2=a, b2=b;
        int a3=a, b3=b;
        System.out.printf("\nBefore Swapping: a = %d, b = %d",a,b);
        //Swapping without using a temporary variable
        //Method 1 : using addition & Subtraction
        a1=a1+b1;
        b1=a1-b1;
        a1=a1-b1;
        System.out.printf("\nAfter Swapping using addition & Subtraction: a = %d, b = %d",a1,b1);
        //Limitation: Might overflow if it exceeds integer limit
        //Method 2 : Using multiplication & division
        a2=a2*b2;
        b2=a2/b2;
        a2=a2/b2;
        System.out.printf("\nAfter Swapping Using multiplication & division: a = %d, b = %d",a2,b2);
        //Doesn't work if any one of the two numbers is zero
        //Method 3 : Using XOR logic
        if(a3==b3) 
             System.out.printf("\nAfter Swapping Using XOR logic: a = %d, b = %d",a3,b3);
        else{
            a3=a3^b3;
            b3=a3^b3;
            a3=a3^b3;
            System.out.printf("\nAfter Swapping Using XOR logic : a = %d, b = %d",a3,b3);
        }
        //Doesn't work if both are same numbers
        sc.close();
    }
    
}
