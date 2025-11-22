interface Playable{
    void play(); //this is public abstract method by default
}
class MusicPlayer implements Playable{
    public void play() //subclass that implements the abstract class, must implement the abstract method
    {
        System.out.println("Playing Music....");
    }
}
class VideoPlayer implements Playable{
    public void play(){
        System.out.println("Playing a video...");
    }
}
//It is like Hierarchical inheritance
class MediaPlayer{
    public static void main(String[] args){
        MusicPlayer music=new MusicPlayer();
        VideoPlayer video=new VideoPlayer();
        music.play();
        video.play();
    }
}