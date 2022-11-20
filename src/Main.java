public class Main {
    public static void main(String[] args) {
        Cat Batyr = new Cat("Batyr", 6);
        Batyr.meow();

        Cat begemot = new Cat("Begemot", -5);
        begemot.meow();
        Batyr.addFriend(begemot);
        System.out.println("Cat " + Batyr.name + " has " + Batyr.getFriends().length + " friends");

        Batyr.friends[0].meow();

    }
}