import java.util.Scanner;
public class ThrowsExample{
    static double safeDivide(int a, int b) throws ArithmeticException{
        return a/b;
    }
    public static void main(String[] args){
       System.out.print("Enter two numbers (a b) : ");
       Scanner sc=new Scanner(System.in);
       int a=sc.nextInt();
       int b=sc.nextInt();
       try{
        double result=safeDivide(a,b);
        System.out.println("result : "+result);
       }
       catch(Exception e){
        System.out.println("Error: Cannot divisible by zero");
       }
    }
}
/*
Output 1:
Enter two numbers (a b) : 4 0
Error: Cannot divisible by zero
Output 2:     
Enter two numbers (a b) : 8 2
result : 4.0
*/