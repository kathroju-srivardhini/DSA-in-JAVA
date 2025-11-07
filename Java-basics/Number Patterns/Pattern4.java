import java.util.Scanner;
public class Pattern4{
    public static void main(String[] args){
        System.out.print("Enter the number of rows : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(int k=1;k<=i;k++){
                System.out.print(k+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/*
 * OUTPUT:
 * Enter the number of rows : 5
    1 
   1 2
  1 2 3
 1 2 3 4
1 2 3 4 5
 */
