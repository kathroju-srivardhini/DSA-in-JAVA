import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args){
        System.out.print("Enter the number for which you want multiplication : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        System.out.print("\nEnter the limit upto which you want the muliplication table : ");
        int m=sc.nextInt();
        System.out.println("Here's the multiplication table of "+n+" : ");
        for(int i=1;i<=m;i++){
            System.out.printf("%d * %d = %d\n",n,i,n*i);
        }
        sc.close();
    }
    
}
