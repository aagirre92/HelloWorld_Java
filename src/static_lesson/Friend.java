package static_lesson;
public class Friend {
    String name;
    static int numberOfFriends;

    //Constructor
    public Friend(String name){
        System.out.println("Constructor for " + name);
        this.name = name;
        numberOfFriends = numberOfFriends+1;
    }

    public static void displayFriends(){
        System.out.println("You have " + numberOfFriends + " friends.");
    }

}
