import java.util.Scanner;
class Book{
    String title;
    double price;
    //Default Constructor
    Book(){
        title="Programming in JAVA";
        price=120.00;
    }
    //Parameterized Constructor
    Book(String t, double p){
        title=t;
        price=p;
    }

    //Both default and parameterized constructors work in the same class, this is "Constructor Overloading"
    
    //Method to display
    public void display(){
        System.out.println("Book details : \nTitle : "+title+"\nPrice : $"+price);
    }
}
public class ConstructorExample{
    public static void main(String[] args){
        Book b1=new Book();
        Book b2=new Book("Data Structures",140.00);
        b1.display();
        System.out.println();
        b2.display();
    }
}
/*OUTPUT:
Book details : 
Title : Programming in JAVA
Price : $120.0

Book details :
Title : Data Structures
Price : $140.0
 */