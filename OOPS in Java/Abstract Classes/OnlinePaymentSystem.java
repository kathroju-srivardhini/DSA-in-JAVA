/*
Problem Statement:
Create an abstract class Payment with an abstract method processPayment() and a normal 
method paymentInfo(). Create subclasses UpiPayment and CardPayment that implement 
processPayment() in their own way. In the main method, create objects of both subclasses, 
assign payment details, and display payment information along with how the payment is processed.
*/

abstract class Payment{
    double amount;
    abstract void processPayment();
    void paymentInfo(){
        System.out.println("Processing payment of Rs."+amount);
    }
 }                                 
 class UpiPayment extends Payment{
    String upiId;
    void processPayment(){
        System.out.printf("Payment done using UPI : <%s>\n",upiId);
    }
 }
class CardPayment extends Payment{
    String cardNumber;
    void processPayment(){
        System.out.printf("Payment done using Card : <%s>\n",cardNumber);
    }
}
class OnlinePaymentSystem{
    public static void main(String[] args){
        UpiPayment upi=new UpiPayment();
        upi.amount=2500;
        upi.upiId="raghu1345";
        upi.paymentInfo();
        upi.processPayment();
        
        CardPayment card=new CardPayment();
        card.cardNumber="67374";
        card.amount=1200;
        card.paymentInfo();
        card.processPayment();
    }
}
/* 
Sample Output:
Processing payment of Rs.2500.0
Payment done using UPI : <raghu1345>
Processing payment of Rs.1200.0
Payment done using Card : <67374>
*/