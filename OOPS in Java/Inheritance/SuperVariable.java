/*
Problem Statement:
Demonstrate the use of super and this to access variables. Create a Course class with 
a category field. Extend it with JavaCourse that has its own category field. Display 
both superclass and subclass categories using super and this.
*/
class Course //parent class
{
    String category = "General Course";
}
class JavaCourse extends Course //child class
{
    String category="Programming in Java";
    void showCategories(){
        System.out.println("Super class Category : "+super.category);
        System.out.println("Sub class Category : "+this.category);

    }
}
class SuperVariable{
    public static void main(String[] args){
        JavaCourse c = new JavaCourse();
        c.showCategories();
    }
}
/*
Sample Output:
Super class Category : General Course
Sub class Category : Programming in Java
*/