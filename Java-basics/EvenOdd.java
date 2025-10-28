import java.util.Scanner;
public class EvenOdd {
    public static void main(String[] args){
            System.out.print("Enter a number : ");
            Scanner sc=new Scanner(System.in);
            int n=sc.nextInt();
            if(n%2==0){
                System.out.printf("\n%d is a even number",n);
            }
            else
                System.out.printf("\n%d is an odd number",n);
            sc.close();
    }
}
