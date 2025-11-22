abstract class Course{
     String courseName;
     abstract void startLesson();//abstract method. It doesn't have body.
     //  Every subclass must contain the startLesson() method.
     //Abstract methods can be only implemented in the subclasses.
     //abstract method must be only written in an abstract class.

    void showCourse() //normal method
    {
        System.out.println("Course : "+courseName);
    }
}
class VideoCourse extends Course{
    int duration;
    void startLesson() //Subclasses override the abstract method
    {
        System.out.printf("Playing video lesson for <%d> minutes\n",duration);
    }
}
class TextCourse extends Course{
    int pageCount;
    void startLesson() //Subclasses override the abstract method
    {
        System.out.printf("Opening the text lesson of <%d> pages",pageCount);
    }
}
class OnlineCourses{
    public static void main(String[] args){
        VideoCourse v=new VideoCourse();
        TextCourse cs=new TextCourse();
        v.duration=120;
        v.courseName="Spoken English"; //Accessing the super class variable with subclass object
        v.showCourse();
        v.startLesson();
        cs.pageCount=50;
        cs.courseName="Software Engineering";
        cs.showCourse();
        cs.startLesson();

    }
}