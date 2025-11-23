/*
Problem Statement:
Demonstrate the use of super() in constructors. Create a Gadget class with a 
constructor, and extend it with Smartphone class that calls super() in its constructor. 
Create a Smartphone object to show constructor chaining.
*/
class Gadget{
    Gadget(){ //Constructors can print, but they shouldnot print unless it is for understanding or debugging.
        System.out.println("Gadget Created");
    }
}
class Smartphone extends Gadget{
     Smartphone(){
        super(); //super() MUST be the first statement inside a constructor.
        System.out.println("Smartphone Created");
     }
}
class SuperConstructor{
    public static void main(String[] args){
        Smartphone vivo = new Smartphone(); // Constructor is called automatically when object is created.
        
    }
}
/*
Sample Output:
Gadget Created
Smartphone Created
*/