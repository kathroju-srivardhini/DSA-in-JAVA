//This is the calculator program using class, object and methods.
import java.util.Scanner;
class Calculate {//class
    public void add(int x, int y){//method1
    System.out.printf("\n%d + %d = %d",x,y,x+y);
  }
    public void subtract(int x, int y){//method2
       System.out.printf("\n%d - %d = %d",x,y,x-y);
  }
    public void multiply(int x, int y){//method3
      System.out.printf("\n%d * %d = %d",x,y,x*y);
  }
    public void divide(int x, int y){//method4
        if(y==0){
            System.out.print("Error! DivisionByZero!");
        }
        else
          System.out.printf("\n%d / %d = %d",x,y,x/y);
    }
    public void modulo(int x, int y){//method5
        if(y==0){
            System.out.print("Error! DivisionByZero!");
        }
        else
          System.out.printf("\n%d %% %d = %d",x,y,x%y);
    }
}
//main program
public class Calculator{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);//scanner should be defined only once, so it should be always outside the loops
        while(true){
        System.out.print("Enter the two operands : ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        System.out.print("\nEnter the operator (+,-,*,/,%) or 'x' to exit : ");
        char op=sc.next().charAt(0);
        Calculate c= new Calculate();
        switch(op){
            case 'x':
            case 'X': 
               System.out.print("Exiting the program! Thank you!");
               sc.close();//close the scanner before exiting the program
               System.exit(0);
               break;
            //Here case 'x' and case 'X' follows the same statements in case 'X' since there is no 'break;'
            case '+' : c.add(a,b);
                      break;
            case '-' : c.subtract(a,b);
                       break;
            case '*' : c.multiply(a,b);
                      break;
            case '/' : c.divide(a,b);
                        break;
            case '%' : c.modulo(a,b);
                       break;
            default : System.out.print("\nWrong Input!Try again");
            break;
        }
        System.out.print("\nDo you want to continue (y/n) : ");
        char txt =sc.next().charAt(0);
        if(txt=='n'|| txt=='N'){
            System.out.print("Exiting the program! Thank you!");
            break;//stops the loop 
        }
    }
    sc.close();//once closed it cannot be used again, so we have to close outside the loop
    }
}