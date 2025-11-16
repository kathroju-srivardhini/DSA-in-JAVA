import java.util.Scanner;

// LOGIC: An Armstrong number is a number that is equal to the sum of its digits each raised to the power of total digits.
// Example: 153 → 1^3 + 5^3 + 3^3 = 153

class Armstrong{
    public long numOfDigits(long n){
        long count=0;
        while(n!=0){
             n=n/10;
             count++;
        }
        return count;
    }
    public boolean isArmstrong(long n){
         long sum=0,r;
         long num=n;
         long power=numOfDigits(n);
         while(n!=0){
            r=n%10;
            sum+=Math.pow(r,power);
            n=n/10;

         }
         if(sum==num){
            return true;
         }
         else
            return false;
    }
}
public class ArmstrongNumbers{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("****MENU****\n1.Check if a number is Armstrong number or not\n2.print all armstrong numbers in a given limit\nChoose an option : ");
        int op=sc.nextInt();
        Armstrong obj=new Armstrong();
        switch(op){
            case 1: System.out.print("Enter a number : ");
                    long l=sc.nextLong();
                    boolean k=obj.isArmstrong(l);
                    if(k){
                        System.out.printf("%d is an Armstrong number.",l);
                    }
                    else{
                       System.out.printf("%d is not an Armstrong number.",l);
                  }
                    break;
             case 2 : System.out.print("Enter the limit (number) upto which you want sequence of Armstrong numbers : ");
                      long z=sc.nextLong();
                      System.out.printf("The sequence of Armstrong numbers upto %d are : ",z);
                      for(long i=0;i<z;i++){
                           boolean m=obj.isArmstrong(i);
                         if(m){
                              System.out.print(i+" ");
                          }
                  }
                  break;
            default : System.out.print("Please Enter correct option.");
        }
        
        sc.close();
    }
}
