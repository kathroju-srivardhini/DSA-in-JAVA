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