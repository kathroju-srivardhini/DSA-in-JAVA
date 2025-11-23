/*
Problem Statement:
Demonstrate single inheritance. Create a Person class with name and age, and a 
method to display them. Extend it to Employee class with salary and a method to 
display salary. Use an Employee object to access both parent and child methods.
*/
class Person //Parent class
{
    String name;
    int age;
    void displayPerson(){
        System.out.printf("Name : %s\nAge : %d\n",name,age);
    }
}
class Employee extends Person //child class
{
    double salary;
    void displayEmployee(){
        System.out.printf("Salary : %.2f\n",salary);
    }
}
public class SingleInheritance{
    public static void main(String[] args){
        Employee e=new Employee();
        e.name="Priya";
        e.age=19;
        e.salary=120000;
        e.displayPerson();
        e.displayEmployee();
    }
}
/*
Sample Output:
Name : Priya
Age : 19
Salary : 120000.00
*/