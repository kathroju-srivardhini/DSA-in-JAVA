import java.util.Scanner;
class BankAccount{
    private double balance;
    public double deposit(double amount){
        return balance+=amount;
    }
    public void withdraw(double amount){
        try{
            if(amount>balance){
                throw new ArithmeticException("Insufficient Balance");
            }
            balance-=amount;
            System.out.println("Amount Withdrawn Successfully!");
        }
        catch(Exception e){
            System.out.println("Error: "+e.getMessage());
        }
    }
    public void getBalance(){
        System.out.println("Account Balance : Rs."+balance);
    }
}
public class BankEH{
    public static void main(String[] args){
        System.out.print("Enter initial amount : Rs. ");
        Scanner sc=new Scanner(System.in);
        BankAccount abc=new BankAccount();
        double bal=sc.nextDouble();
        abc.deposit(bal);
        System.out.print("Enter withdraw amount : Rs. ");
        double money=sc.nextDouble();
        abc.withdraw(money);
        abc.getBalance();
    }
}
/*
Output 1:
Enter initial amount : Rs. 1600
Enter withdraw amount : Rs. 800
Amount Withdrawn Successfully!
Account Balance : Rs.800.0
Output 2:
Enter initial amount : Rs. 1200
Enter withdraw amount : Rs. 1500
Error: Insufficient Balance
Account Balance : Rs.1200.0
*/