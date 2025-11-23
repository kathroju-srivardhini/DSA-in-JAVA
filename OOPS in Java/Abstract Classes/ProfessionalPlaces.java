/*
Type: Abstract Class + Inheritance
Problem Statement:
Create abstract class Professional with abstract method wearIdCard() and normal 
method work(). Subclasses College and Office implement wearIdCard(). Demonstrate 
working and ID card rules for students and employees.
*/

abstract class Professional{
    abstract void wearIdCard();
    void work(){
        System.out.println("Working on a Project..");
    }
}
class College extends Professional{
    public void wearIdCard(){
        System.out.println("Every Student must wear ID card");
    }
}
class Office extends Professional{
    public void wearIdCard(){
        System.out.println("Every employee must wear Id Card");
    }
}
class ProfessionalPlaces{
    public static void main(String[] args){
        College ace=new College();
        Office tech=new Office();
        ace.work();
        ace.wearIdCard();
        tech.work();
        tech.wearIdCard();
    }
}
/*

Sample Output:
Working on a Project..
Every Student must wear ID card
Working on a Project..
Every employee must wear Id Card
 */