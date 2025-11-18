import java.util.Scanner;
class Car{
    String model;
    double price;
    void setModel(String m){
        this.model=m; //means model of current car object is m
    }
    void setPrice(double p){
        this.price=p; //means price of current car object is p
    }
    void sendToGarage(Garage g){
        g.printCar(this); //telling garage to print the details of current car object
    }
}
class Garage{
    void printCar(Car c){
        // This function takes a Car object 'c' and prints its details
         System.out.print("Car Details\nModel : "+c.model+"\nPrice : "+c.price);
    } 
}
public class CarGarage{
    public static void main(String[] args){
        Car c=new Car();
        c.setModel("Hyundai");
        c.setPrice(120000.0);
        Garage g= new Garage();
        g.printCar(c); // print car details that is in garage
        //c.sendToGarage(g);  Send the car to the garage so it can print details
    }
}