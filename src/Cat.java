import java.util.Arrays;

public class Cat {
     String name;
     int age;
     Cat[] friends;

    public Cat(String name, int age){
        this.name = name;
        if(age >= 0) {
            this.age = age;
        } else {
            this.age = Math.abs(age);
        }
        friends = new Cat[0];
    }
    public void meow(){
        System.out.println("Meow");
        System.out.println("My name is " + name);
        System.out.println("I am " + age + " years old");
    }

    Cat[] getFriends(){
        if(friends == null){
            friends = new Cat[0];
        }
        return friends;
    }

    void addFriend(Cat friend){
        this.friends = Arrays.copyOf(getFriends(), getFriends().length + 1);
        this.friends[this.friends.length - 1] = friend;
    }
}
