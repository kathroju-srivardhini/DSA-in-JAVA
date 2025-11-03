import java.util.Scanner;
public class Pattern2{
    public static void main(String[] args){
        System.out.print("Enter the number of rows : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+" ");
            }
            System.out.println();
        }
        sc.close();
    }
}
/* Output:
Enter the number of rows : 5
1 
2 2
3 3 3
4 4 4 4
5 5 5 5 5
 */