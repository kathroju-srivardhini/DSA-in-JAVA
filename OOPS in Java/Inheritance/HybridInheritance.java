class Device{
    String brand;
    void powerOn(){
        System.out.println("Device is powering on..");
    }
}
class Computer extends Device{
    int ramCapacity;
    void boot(){
        System.out.println("Computer is booting..");
    }
}
class Phone extends Device{
    int storage;
    void call(){
        super.powerOn(); //using super in multilevel inheritance
        System.out.println("Phone is making a call..");
    }
}
class SmartPhone extends Phone{
    String os;
    void runApps(){
        super.call();
        System.out.println("SmartPhone is running apps..");
    }
}
class HybridInheritance{
    public static void main(String[] args){
        SmartPhone mobile=new SmartPhone();
        mobile.brand="Samsung";
        mobile.storage=128;
        mobile.os="Android";
        mobile.runApps();
    }
}