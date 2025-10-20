import java.util.Scanner;
class Account{
    float balance;
    public Account(float b){
        balance=b;
    }
    public void deposit(float bal){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to deposit : ");
        float d=sc.nextFloat();
        balance=balance+d;
        System.out.println("\nDeposited Successfully!!");
    }
    public void withdraw(float bal){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw : ");
        float draw=sc.nextFloat();
        balance=balance-draw;
        System.out.println("\nWithdrawn successfully!!");
    }
    public void display(){
        System.out.println("\nCurrent Account Balance: "+balance);
    }
}
public class Program2{
    public static void main(String[] args){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the Account balance:");
    float bal=sc.nextFloat();
    Account a1=new Account(bal);
    a1.deposit(bal);
    a1.display();
    a1.withdraw(bal);
    a1.display();
    }
}
