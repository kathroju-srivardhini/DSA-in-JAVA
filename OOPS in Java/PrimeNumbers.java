import java.util.Scanner;
class Prime{
    public boolean isPrime(int n){
//We know that factors are in pairs, in each pair the smaller number is always less than root n. So we just need to check divisibility only upto root n.
        for(int i=2;i*i<=n;i++){
            if(n%i==0){
                return false;
            }    
        }
        return true ;
     }
    }
public class PrimeNumbers{
    public static void main(String[] args){
        System.out.print("Enter the limit upto which you want prime numbers : ");
        Scanner sc=new Scanner(System.in);
        int num=sc.nextInt();
        Prime obj=new Prime();
        if(num==0||num==1){
        System.out.print("There are no prime numbers in this limit.");
        }
        else{ 
        System.out.printf("Prime numbers upto %d are : ",num);
        for(int i=2;i<=num;i++){
            boolean k=obj.isPrime(i);
            if(k){ 
                System.out.print(i +" ");
            }
        }
        sc.close();
    }
 }
}
/* Output:
Enter the limit upto which you want prime numbers : 100
Prime numbers upto 100 are : 2 3 5 7 11 13 17 19 23 29 31 37 41 43 47 53 59 61 67 71 73 83 89 97
*/