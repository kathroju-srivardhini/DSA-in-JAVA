/*
Problem Statement:
Demonstrate a combination of abstract class and interfaces. Create an abstract
class Payment with processPayment() and paymentInfo(). Create interfaces Refundable 
(refund()) and Receipt (printReceipt()). Implement these in UPIPayment and CardPayment 
classes and demonstrate payment, refund, and receipt functionality.
*/

// This is a Combination of Abstract class and Interface
abstract class Payment{
    double amount;
    abstract void processPayment();
    void paymentInfo(){
        System.out.printf("Payment of Rs.%.2f has been processed\n",amount);
    }
}
interface Refundable{
      void refund();
}
interface Receipt{
    void printReceipt();
}
class UPIPayment extends Payment implements Refundable{
    void processPayment(){
            System.out.printf("Processing the payment of Rs.%.2f using UPI Payment\n",amount);
    }
    public void refund(){
        System.out.println("Refunding the amount processed..\n");
    }
}
class CardPayment extends Payment implements Receipt{
    void processPayment(){
        System.out.printf("Processing the payment of Rs.%.2f using card\n",amount);
    }
    public void printReceipt(){
        System.out.println("Printing the receipt..");
    }
}
class PaymentSystem{
    public static void main(String[] args){
        UPIPayment upi=new UPIPayment();
        CardPayment card=new CardPayment();
        upi.amount=1600;
        upi.processPayment();
        upi.paymentInfo();
        upi.refund();
        card.amount=4800;
        card.processPayment();
        card.paymentInfo();
        card.printReceipt();
    }
}
/*
Sample Output:
Processing the payment of Rs.1600.00 using UPI Payment
Payment of Rs.1600.00 has been processed
Refunding the amount processed..

Processing the payment of Rs.4800.00 using card
Payment of Rs.4800.00 has been processed
Printing the receipt..
*/