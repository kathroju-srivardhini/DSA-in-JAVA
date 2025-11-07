import java.util.Scanner;
public class AlphaDiamond{
    public static void main(String[] args){
        System.out.print("Enter the number of rows (for upper half) : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        char ch='A';
        //upper pyramid
        for(int i=0;i<n;i++){
            for(int s=i;s<n;s++){//spaces in each row
                System.out.print(" ");
            }
            for(int j=0;j<=i;j++){
                System.out.print(ch+" ");
            }
            ch++;
            System.out.println();
        }
        ch--;
        //inverted pyramid (lower)
        for(int i=n-1;i>0;i--){//n-1 avoids repeating of row
            ch--;
            for(int s=n;s>=i;s--){
                System.out.print(" ");
            }
            for(int k=0;k<i;k++){
                System.out.print(ch+" ");
            }
            System.out.println();
        }
    }
}
/*
 * Output:
 * Enter the number of rows : 5
     A 
    B B
   C C C 
  D D D D
 E E E E E
  D D D D
   C C C
    B B
     A

NOTE: We can also write this code using ascii values instead of using A directly.
take int a=65;
then while printing use (char)(a)
increment and decrement a as per the need same as we do that for ch here.
 */