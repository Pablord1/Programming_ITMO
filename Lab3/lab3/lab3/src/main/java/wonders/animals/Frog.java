package wonders.animals;

import wonders.Animal;
import wonders.actions.*;

public class Frog extends Animal implements Talkable, Sittable, Watchable{

    public Frog(String name){
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Roooo Roooo");
    }

    @Override
    public void Sit(String whom) {
        System.out.println(this.name + " sits alone next to " + whom);
    }

    @Override
    public void Talk(String speech) {
        System.out.println(this.name + " says \"" + speech + "\"");
    }

    @Override
    public void Watch(String what) {
        System.out.println(this.name + " watches the " + what);
    }
}