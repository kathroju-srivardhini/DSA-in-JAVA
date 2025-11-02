import java.util.Scanner;
public class SquarePattern{
    public static void main(String[] args){
        System.out.print("Enter the number of rows : ");
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        System.out.println();
        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        sc.close();
    }
}