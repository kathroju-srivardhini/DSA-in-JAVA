//Program to read and print the details of employees in Office
import java.util.Scanner;
class Employee{
    String name;
    int id;
    double salary;
    //Parameterized Constructor
    Employee(String n,int ID,double s){
        name=n;
        id=ID;
        salary=s;
    }
    public void display(){
        System.out.printf("Name : %s\nID : %d\nSalary : %.2f\n\n",name,id,salary);
    }
}
public class Office{
    public static void main(String[] args){
        System.out.print("Enter the total number of Employees : ");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Employee[] emp = new Employee[n];
        System.out.println("Enter the details of Employees : ");
        for(int i=0;i<n;i++){
            System.out.printf("Enter employee %d details : \n",i+1);
            sc.nextLine();
            System.out.print("Name : ");
            String NAME=sc.nextLine();
            System.out.print("ID : ");
            int ID=sc.nextInt();
            System.out.print("Salary : ");
            double SALARY=sc.nextDouble();
            emp[i]=new Employee(NAME,ID,SALARY);

        }
        System.out.println("\nAll the Employees details : ");
        for(Employee e: emp){ //for-each loop
            e.display();
        }
       // for(int i=0;i<n;i++){
       //     emp[i].display();
       // }
    }
}