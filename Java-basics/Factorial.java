import java.util.Scanner;
public class Factorial {
    public static void main(String[] args){
        System.out.print("Enter a number : ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.printf("\nFactorial of %d is %d.",n,fact(n));
        sc.close();
    }
public static int fact(int num){
    if (num==0){
        return 1;
    }
    if(num==1){
        return num;
    }
    return num*=fact(num-1);
}
}