class Person{
    String name;
    int age;
    void displayPerson(){
        System.out.printf("Name : %s\nAge : %d\n",name,age);
    }
}
class Employee extends Person{
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