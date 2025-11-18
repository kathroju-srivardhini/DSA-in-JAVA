import java.util.Scanner;
public class PascalsTriangle{
    public static void main(String[] args){
        System.out.print("Enter the number of rows : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int i,j,k;
        for(i=0;i<n;i++){//Outer loop controls the number of rows
            for(j=i;j<n;j++){//controls the spaces
                System.out.print(" ");
            }
            int num=1;//setting num=1, before each row
            for(k=0;k<=i;k++){//inner loop prints the numbers in each row
                System.out.print(num+" ");
                // Formula for next number in the row:
                // next = current * (i - k) / (k + 1)
                num=num*(i-k)/(k+1);
            }
            System.out.println();//prints new line after each row
        }
        sc.close();
    }
}
/*
LOGIC:
From the formula of combinations
C(n,r)=n!/(r!×(n−r)!)​
C(n,r+1)=C(n,r)×(n−r)/(r+1)
we get the formula for next number in the row:
         next = current * (i - k) / (k + 1)​
 * Output:
 * Enter the number of rows : 6
     1 
    1 1
   1 2 1
  1 3 3 1
 1 4 6 4 1
1 5 10 10 5 1
 */