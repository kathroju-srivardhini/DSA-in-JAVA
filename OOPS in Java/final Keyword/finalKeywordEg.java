//Demostration of final keyword as variable, method and class
class Spaceship{
    final int MAX_SPEED = 100; //This is final variable
    // once initilized, cannot be changed
    void show(){
        //MAX_SPEED= 200; 
        //Error! final variable cannot be changed, once initialized
        System.out.printf("MAX speed of the Spaceship is %d\n", MAX_SPEED);
    }
}
class Astronaut{
    final void performMission()
    //This is final method, cannot be overriden
    {
        System.out.println("Astronaut performing mission..");
    }
}
class Fresher{
    void showFresher(){
        System.out.println("This is Fresher class");
    }
   /*
    void performMission() //Error! final method cannot be overriden
    {
        System.out.println("The final method is overriden");
    }
    */
}
final class GalaxyMap
//This is the final class. It cannot be inherited to subclass
{    
    void showGalaxy(){
      System.out.println("This is the Galaxy Map..");
    }
}
/* 
class AdvancedGalaxyMap extends GalaxyMap
//Error! final class cannot be inherited
{ 
    void showAdvanced(){
    System.out.println("This is the Advanced Galaxy map..");
    }
}
*/
class finalKeywordEg{
    public static void main(String[] args){
        Spaceship s=new Spaceship();
        s.show();
        Astronaut a=new Astronaut();
        a.performMission();
        Fresher f=new Fresher();
        f.showFresher();
        //f.performMission();
        GalaxyMap g=new GalaxyMap();
        g.showGalaxy();
        // AdvancedGalaxyMap ag=new AdvancedGalaxyMap();
        //ag.showAdvanced();
    }
}
/*
MAX speed of the Spaceship is 100
Astronaut performing mission..
This is Fresher class
This is the Galaxy Map..

*/