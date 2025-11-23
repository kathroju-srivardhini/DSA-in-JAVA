//Compile-time polymorphism
/*
Problem Statement:
Demonstrate compile-time polymorphism using method overloading. Create an Area class 
with multiple area() methods to calculate area of a square, rectangle, and circle. 
Call appropriate methods using objects.
*/
class Area{
    int side;
    int length;
    int breadth;
    double radius;
    void area(int side){
        int a=side*side;
        System.out.printf("Area of Square %d\n",a);
    }
    void area(int length,int breadth){
        int b=length*breadth;
        System.out.printf("Area of rectangle is %d\n",b);
    }
    void area(double radius){
        double c=(Math.PI)*radius*radius;
        System.out.printf("Area of circle is %.2f\n",c);
    }
    //Here the 3 method names are same, only parameters are different. This is known as Method Overloading
}
class MethodOverloadingEg{
    public static void main(String[] args){
        Area a=new Area();
        a.side=5;
        a.area(5);
        a.area(6,8);
        a.area(4.2);
    }
}
/*
Sample Output:
Area of Square 25
Area of rectangle is 48
Area of circle is 55.42
*/