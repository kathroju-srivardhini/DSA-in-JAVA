class Course{
    String category = "General Course";
}
class JavaCourse extends Course{
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