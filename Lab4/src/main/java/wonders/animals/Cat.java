package wonders.animals;

import wonders.Animal;
import wonders.actions.*;

public class Cat extends Animal implements Grinable, Sittable {
    public Cat(String name){
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println("Meow");
    }

    @Override
    public void Grin() {
        System.out.print(this.name + " grins");

        class Smile {
            void showTeeth(){
                System.out.println(" (His smile shows many teeth)");
            }
        }

        Smile smile = new Smile();
        smile.showTeeth();
    }

    @Override
    public void Sit(String whom) {
        System.out.println(this.name + " sits next to " + whom);
    }

    public static class Mishi {

    }
}
