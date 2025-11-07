import java.util.Scanner;
public class AlphaSquare{
    public static void main(String[] args){
        System.out.print("Enter the number of rows : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print((char)(65+i)+" ");
            }
            System.out.println();
        }
        /*Method 2:
        char ch='A';
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                //System.out.print(ch+" ");
            }
            //ch++;
            System.out.println();
        }
        */
    }
}
/*
 * OUTPUT:
 * Enter the number of rows : 5
A A A A A 
B B B B B 
C C C C C 
D D D D D 
E E E E E 
 */