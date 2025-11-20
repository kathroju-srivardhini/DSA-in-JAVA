class Vehicle{
    void start(){
        System.out.println("Fueling the Engine..");
    }
}
class Car extends Vehicle{
    void drive(){
        System.out.println("Driving the Car..");
    }
}
class Bike extends Vehicle{
    void ride(){
        System.out.println("Riding the bike..");
    }
}
class HierarchicalInheritance{
    public static void main(String[] args){
        System.out.println("\nCar Details");
        Car Tata=new Car();
        Tata.start();
        Tata.drive();
        System.out.println("\nBike Details");
        Bike Pulser=new Bike();
        Pulser.start();
        Pulser.ride();
    }
}