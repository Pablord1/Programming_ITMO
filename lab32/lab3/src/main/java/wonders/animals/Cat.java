package wonders.animals;

import wonders.Animal;
import wonders.actions.*;

public class Cat extends Animal implements Grin, Sit {
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void Grin() {
        System.out.println(this.name + " grins");
    }

    @Override
    public void Sit(String whom) {
        System.out.println(this.name + " sits next to " + whom);
    }
}
