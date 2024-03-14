import static_lesson.Friend;
import interfaces.Rabbit;
import interfaces.Hawk;
import interfaces.Fish;
public class Main {
    public static void main(String[] args) {
        /*
        * static: modifier. A single copy of a variable/method is created and shared
        * the class "owns" the static member
        *
         */


        Friend friend1 = new Friend("spongebob");
        Friend friend2 = new Friend("patrick");
        Friend friend3 = new Friend("calamardo");
        Friend friend4 = new Friend("pepe");
        //System.out.println(static_lesson.Friend.numberOfFriends);
        Friend.displayFriends();


        /*
        * interface: a template that can be applied to a class. Similar to inheritance, but specifies what a class
        * has/must do. Classes can apply more than one interface, inheritance is limited to 1 super
        *

        Rabbit rabbit = new Rabbit();

        rabbit.flee();

        Hawk hawk = new Hawk();
        hawk.hunt();

        // Fish can be either prey or predator!
        Fish fish = new Fish();
        fish.flee();
        fish.hunt();
        * */





    }

}