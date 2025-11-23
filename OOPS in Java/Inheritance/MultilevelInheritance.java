/*
Problem Statement:
Demonstrate multilevel inheritance. Create a LivingBeing class with method breathe(), 
extend it to Animal with method eat(), and further extend to Dog with method bark(). 
Use an object of Dog to call all inherited and own methods.
*/
class LivingBeing //GrandParent class
{
    void breathe(){
        System.out.println("Living Beings Breathe Oxygen");
    }
}
class Animal extends LivingBeing //Parent class
{
    void eat(){
        System.out.println("Animals eat food");
    }
}
class Dog extends Animal //child class
{
    void bark(){
        System.out.println("Dog Barks");
    }
}
class MultilevelInheritance{
    public static void main(String[] args){
        Dog puppy=new Dog();
        puppy.breathe();
        puppy.eat();
        puppy.bark();
    }
}
/*
Sample Output:
Living Beings Breathe Oxygen
Animals eat food
Dog Barks
*/