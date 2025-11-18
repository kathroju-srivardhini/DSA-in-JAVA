import java.util.Scanner;
public class Diamond{
    public static void main(String[] args){
        System.out.print("Enter the number of rows (for upper half) : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        //Upper half
        for(int i=0;i<n;i++){//number of rows
            for(int j=i;j<n;j++){//spaces
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        //Lower Half
        for(int i=n-2;i>=0;i--){
            for(int j=n;j>i;j--){
                System.out.print(" ");
            }
            for(int k=0;k<=i;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
 * OUTPUT:
 * Enter the number of rows (for upper half) : 5
     * 
    * *
   * * *
  * * * *
 * * * * *
  * * * *
   * * *
    * *
     *
NOTE: It has 2*n-1 rows
upper half n
lower half n-1
In the lower half loop, i=n-2; i>=0;i-- , is taken to avoid repeating of the row, which is already printed in the upper half.
 */