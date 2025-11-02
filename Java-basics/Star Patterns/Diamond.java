import java.util.Scanner;
public class Diamond {
    public static void main(String[] args){
        System.out.print("Enter the number of rows : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j++){
                System.out.print("  ");
            }
            for(int k=1;k<=2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        for(int i=n;i>0;i--){
            for(int j=n;j>i;j--){
                System.out.print("  ");
            }
            for(int k=0;k<2*i-1;k++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}