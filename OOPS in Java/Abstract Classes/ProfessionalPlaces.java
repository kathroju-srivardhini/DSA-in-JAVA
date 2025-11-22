abstract class Professional{
    abstract void wearIdCard();
    void work(){
        System.out.println("Working on a Project..");
    }
}
class College extends Professional{
    public void wearIdCard(){
        System.out.println("Every Student must wear ID card");
    }
}
class Office extends Professional{
    public void wearIdCard(){
        System.out.println("Every employee must wear Id Card");
    }
}
class ProfessionalPlaces{
    public static void main(String[] args){
        College ace=new College();
        Office tech=new Office();
        ace.work();
        ace.wearIdCard();
        tech.work();
        tech.wearIdCard();
    }
}