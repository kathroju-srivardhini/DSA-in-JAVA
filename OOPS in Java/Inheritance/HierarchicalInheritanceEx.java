
import java.util.Scanner;
class Library{
    void display(){
        System.out.println("This is Library. Please Maintain Silence.");
    }
}
class Programming extends Library{
    void show(){
        super.display();
        System.out.println("This is Programming Section");
    }
}
class Arts extends Library{
    void show(){
        System.out.println("This is Arts Section");
    }
}
public class HierarchicalInheritanceEx{
    public static void main(String[] args){
        Programming java=new Programming();
        java.show();
        Arts a=new Arts();
        a.show();
    }
}