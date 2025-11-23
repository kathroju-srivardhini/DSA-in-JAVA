//Program to print fibonacci Series of a given number, in both methods iterative and recursive
//using class, object, and methods.
//Fibonacci series logic : the current number is the sum of previous two numbers
import java.util.Scanner;
class fibonacci{
    int i=0,a=0,b=1,c;
    public void iterative(int n){
        if(n==0){
            System.out.print("Fibonacci Series using iterative method : ");

        }
        else if (n==1){
            System.out.print("Fibonacci Series using iterative method : "+a);
        }
        else{
            System.out.print("Fibonacci Series using iterative method : "+a+" "+b);
            for(i=1;i<n-1;i++){
                c=a+b;
                a=b;
                b=c;
                System.out.print(" "+c);
            }
        }
    }
    public int recursive(int n){
        if(n==0){
            return 0; // 1st number in the sequence
        }
        else if(n==1){
            return n; //2nd number in the sequence
        }
        else{
            return recursive(n-1)+recursive(n-2); //Sum of last two numbers in the sequence
        }

    }
}
public class FibonacciSeries{
    public static void main(String[] args){
        System.out.print("Enter how many numbers do you want in the sequence : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        fibonacci fib=new fibonacci();
        fib.iterative(num);
        System.out.print("\nFibonacci Series using recursion method : ");
        for(int i=0;i<num;i++){ //starts the process from 0 as 1st number in the sequence and goes up to num numbers
            System.out.print(fib.recursive(i)+" ");
        }
        sc.close();
    }
}
/* OUTPUT:
Enter how many numbers do you want in the sequence : 12
Fibonacci Series using iterative method : 0 1 1 2 3 5 8 13 21 34 55 89
Fibonacci Series using recursion method : 0 1 1 2 3 5 8 13 21 34 55 89 
*/
