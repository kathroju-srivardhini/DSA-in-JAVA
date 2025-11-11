import java.util.Scanner;
import java.math.BigInteger;//to use BigInteger which has bigger size than long and int
class factorial{
    public BigInteger iterative(int n){
        BigInteger fact = BigInteger.ONE;//assigns fact=1
        if(n==0||n==1){
            return BigInteger.ONE;//returns 1
        }
        for(int i=n; i>1;i--){
            fact=fact.multiply(BigInteger.valueOf(i));//this is same as fact*=i, which is used in case of int
        }
        return fact;
    }
    public BigInteger recursive(int n){
        if(n==0){
            return BigInteger.ONE;//returns 1
        }
        if(n==1){
            return BigInteger.valueOf(n);//returns n
        }
        return BigInteger.valueOf(n).multiply(recursive(n-1));//this is same as n*recursive(n-1)
    }
}
public class FactorialOfANumber{
    public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        factorial f=new factorial();
        System.out.printf("Using iterative method : %d! = %d\nUsing recursive method : %d! = %d",num,f.iterative(num),num,f.recursive(num));
        sc.close();
    }
}
