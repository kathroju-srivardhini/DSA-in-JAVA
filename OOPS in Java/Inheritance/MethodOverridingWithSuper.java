class SocialMedia{
    void share(){
        System.out.println("Sharing content on Social Media");
    }
}
class Youtube extends SocialMedia{
    void share(){
        super.share();
        System.out.println("Sharing content on Youtube");
    }
}
class MethodOverridingWithSuper{
    public static void main(String[] args){
        Youtube channel = new Youtube();
        channel.share();
    }
}