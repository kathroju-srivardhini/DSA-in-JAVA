class BankAccount{
    //In this class the variable and methods on the variable are encapsulated.
    private double balance; //can't access this variable directly in other classes
    //It can be accessed through the methods
    public double deposit(double amount){
        balance+=amount;
        return balance;
    }
    public double withdraw(double amount){
        if(amount<=balance){
           balance-=amount;
        } else{
            System.out.println("Insufficient balance");
        }
        return balance;
    }
    public void getBalance(){
        System.out.printf("Balance Amount : Rs. %.2f",balance);
    }
}
public class Bank{
    public static void main(String[] args){
        BankAccount xyz=new BankAccount();
        xyz.deposit(200);
        xyz.withdraw(50);
        xyz.getBalance();
    }
}
//Output:
//Balance Amount : Rs. 150.00
