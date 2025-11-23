/*
Problem Statement:
Demonstrate method overriding and the use of 'super'. Create a SocialMedia class 
with method share(). Override share() in Youtube class and use super.share() to 
call parent method.
*/
class SocialMedia{
    void share(){
        System.out.println("Sharing content on Social Media");
    }
}
class Youtube extends SocialMedia{
    void share() //overrides super class method
    {
        super.share(); //calls overriden method using super
        System.out.println("Sharing content on Youtube");
    }
}
class MethodOverridingWithSuper{
    public static void main(String[] args){
        Youtube channel = new Youtube();
        channel.share();
    }
}
/*
Sample Output:
Sharing content on Social Media
Sharing content on Youtube
*/