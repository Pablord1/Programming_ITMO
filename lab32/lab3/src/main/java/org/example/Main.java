package org.example;


import wonders.*;
import wonders.animals.*;
import wonders.types.Age;

public class Main {
    public static void main(String[] args) {
        Frog Footman = new Frog("Footman");
        Human Alice = new Human("Alice", Age.TEENAGER);
        Human Duchess = new Human("Duchess", Age.SENIOR);
        Human Baby = new Human("Baby", Age.BABY);
        Human Cook = new Human("Cook", Age.ADULT);
        Cat CheshireCat = new Cat("Cheshire Cat");

        Alice.Knock();
        Footman.Talk("There's no sort of use in knocking. And that for two reasons. First, because I'm on\n" +
                "the same side of the door as you are; secondly, because they're making such a noise inside, no one\n" +
                "could possibly hear you");
        Alice.Talk("Please how am I to get in?");
        Footman.Talk("There might be some sense in your knocking. if we\n" +
                "had the door between us. For instance, if you were inside, you might knock, and I could let you out,\n" +
                "you know.");
        Footman.Watch("sky");
        Footman.Sit(Alice.toString());
        Alice.Knock();
        Alice.Walk(Duchess.toString());
        Alice.Jump();
        Duchess.Hold(Baby.toString());
        Cook.Cook();
    }
}