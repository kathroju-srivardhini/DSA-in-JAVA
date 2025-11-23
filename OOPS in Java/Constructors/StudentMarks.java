/*
Create a Student class with default and parameterized constructors using 'this()' and 'this' keyword. 
Read details for multiple students, store them in an array, display each student's info, 
and calculate the class average.
*/
import java.util.Scanner;
class Student{
    String name;
    int rollNo;
    float marks;
    Student(){
        this("Unknown",0,0);//this() method calls Parameterized Constructor. It avoids repetition of code in multiple constructors
    }
    Student(String name,int r,float m){
        this.name=name;//this keyword distinguishes class fields from parameters with the same name.
        rollNo=r;
        marks=m;
    }
    void display(){
        System.out.printf("\nStudent details \nStudent Name : %s\nRoll Number : %d\nMarks  : %.2f\n",name,rollNo,marks);
    }
}
public class StudentMarks{
    public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    System.out.print("Enter the total number of students : ");
    int n=sc.nextInt();
    Student[] students=new Student[n];
    for(int i=0;i<n;i++){
        System.out.printf("Do you want to enter the details for Student %d (y/n) : ",i+1);
        char c=sc.next().charAt(0);
        if(c=='y'||c=='Y'){
            System.out.printf("Enter the details of Student %d \n",i+1);
            sc.nextLine();
            System.out.print("Name : ");
            String NAME=sc.nextLine();
            System.out.print("Roll Number : ");
            int ROLLNO=sc.nextInt();
            System.out.print("Marks : ");
            float MARKS=sc.nextFloat();
            students[i]=new Student(NAME,ROLLNO,MARKS);

        }
        else if(c=='n'||c=='N'){
            students[i]=new Student();
        }
    }
    float sum=0;
    for(Student s : students){
        sum+=s.marks;
        s.display();
    }
    System.out.printf("Average marks of class is %.2f",sum/n);
    sc.close();
    }
}
/*
Sample Output:
Enter the total number of students : 2
Do you want to enter the details for Student 1 (y/n) : y
Enter the details of Student 1 
Name : Sree
Roll Number : 1
Marks : 95
Do you want to enter the details for Student 2 (y/n) : n

Student details 
Student Name : Sree
Roll Number : 1
Marks  : 95.00

Student details 
Student Name : Unknown
Roll Number : 0
Marks  : 0.00

Average marks of class is 47.50
*/