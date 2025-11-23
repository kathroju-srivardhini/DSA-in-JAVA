/*
Problem Statement:
Demonstrate combination of interface and inheritance. Create an interface Playable 
with method play(), and a class Game with score and displayScore(). Extend Game 
with CricketGame that implements Playable. Use an object to call both interface and 
inherited methods.
*/
interface Playable{
    void play();
}
class Game{
    int score;
    public void displayScore(){
        System.out.println("Score of the Game is "+score);
    }
}
class CricketGame extends Game implements Playable
//It is the combination of both Interface and inheritance
{
    public void play(){
        System.out.println("Cricket match is going on..");
    }
}
class CricketMatch{
    public static void main(String[] args){
        CricketGame match1=new CricketGame();
        match1.play(); //implemented from interface Playable
        match1.score=36; //inherited from Game
        match1.displayScore();
    }
}
/*
Sample Output:
Cricket match is going on..
Score of the Game is 36
*/