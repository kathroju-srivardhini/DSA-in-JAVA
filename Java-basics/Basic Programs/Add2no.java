import java.util.Scanner;
public class Add2no{
    public static void main(String [] args){
        System.out.print("Enter two numbers: ");
        Scanner sc= new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        add(a,b);
        sc.close();
    }
static void add(int x, int y){
    System.out.printf("Addition of %d and %d is %d",x,y,x+y);
}
}