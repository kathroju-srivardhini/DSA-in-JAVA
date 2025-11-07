import java.util.Scanner;
public class RightAlignedTriangle {
    public static void main(String[] args){
        System.out.print("Enter the number of rows : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
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
 Enter the number of rows : 5
          * 
        * *
      * * *
    * * * *
  * * * * *
  
 */