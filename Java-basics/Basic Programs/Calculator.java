/*
Program to create an Arithmetic Calculator in Java that:
Continuously takes two numbers from the user.
Accepts an operator (+, -, *, /, %) to perform arithmetic operations.
performs the corresponding operation using switch-case, with support for exit command. 
Handles division by zero by showing an error.
*/
import java.util.Scanner;
public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        while(true){
        System.out.println("****Arithmetic Calculator****");
        System.out.print("Enter two numbers : ");
        int a= sc.nextInt();
        int b= sc.nextInt();
        System.out.print("\nEnter an operator (+,-,*,/,%) or 'x' to exit : ");
        char op=sc.next().charAt(0);
        switch(op){
            case 'x' :
            case 'X' : System.out.println("Exiting.. Thank you!");
            sc.close();
            System.exit(0);
            case '+' : System.out.printf("\n%d + %d = %d\n",a,b,a+b);
            break;
            case '-' : System.out.printf("\n%d - %d = %d\n",a,b,a-b);
            break;
            case '*' : System.out.printf("\n%d * %d = %d\n",a,b,a*b);
            break;
            case '/' : if(b==0){
                System.out.println("\nError : Division by zero.");
            }
            else{
                System.out.printf("\n%d / %d = %d\n",a,b,a/b);
            }
            break;
            case '%' : if(b==0){
                System.out.printf("\nError : Division by zero.");
            }
            else{
                System.out.printf("\n%d %% %d = %d\n",a,b,a%b);
            }
            break;
            default : System.out.print("Wrong Input! Try again!");
            break;
        }
        System.out.println("\nDo you want to continue (y/n) : ");
        char choice=sc.next().charAt(0);
        if(choice=='n'||choice=='N'){
            System.out.print("Program Ended!");
            sc.close();
            break;
        }

    }
    }
}
