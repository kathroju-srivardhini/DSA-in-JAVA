class Mobile{
    String brand;
    double price;
    void setBrand(String b){
        this.brand=b;
    }
    void setPrice(double p){
        this.price=p;
    }
    void sendToShop(Shop s){
        s.printMobile(this);
    }
}
class Shop{
    void printMobile(Mobile m){
        System.out.print("\nMobile Details\nBrand : "+m.brand+"\nPrice : "+m.price);
    }
}
public class MobileShop{
    public static void main(String[] args){
        Mobile mob=new Mobile();
        mob.setBrand("Samsung");
        mob.setPrice(12500);
        Shop sh=new Shop();
        //sh.printMobile(mob);
        mob.sendToShop(sh);
    }
}