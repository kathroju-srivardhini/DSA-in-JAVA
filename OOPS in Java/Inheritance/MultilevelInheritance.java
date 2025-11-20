class LivingBeing{
    void breathe(){
        System.out.println("Living Beings Breathe Oxygen");
    }
}
class Animal extends LivingBeing{
    void eat(){
        System.out.println("Animals eat food");
    }
}
class Dog extends Animal{
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