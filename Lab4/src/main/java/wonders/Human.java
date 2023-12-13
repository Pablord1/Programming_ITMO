package wonders;

import wonders.actions.*;
import wonders.types.Age;

import java.util.Objects;

public class Human implements Talkable, Sittable, Holdable, Cookable, Walkable, Watchable, Jumpable, Knockable{
    private final String name;
    private final Age age;


    public Human(String name, Age age){
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return this.name;
    }

    @Override
    public void Cook() {
        System.out.println(this.name + " is cooking.");

    }

    @Override
    public void Hold(String whom) {
        System.out.println(this.name + " is holding " + whom);

    }

    @Override
    public void Jump() {
        System.out.println(this.name + " jumps.");
    }

    @Override
    public void Sit(String whom) {
        System.out.println(this.name + "sits next to " + whom);
    }

    @Override
    public void Talk(String speech) {
        System.out.println(this.name + " says \"" + speech + "\"");

    }

    @Override
    public void Walk(String whom) {
        System.out.println(this.name + " walks towards to " + whom);
    }

    @Override
    public void Watch(String whom) {
        System.out.println(this.name + " watches " + whom);
    }

    @Override
    public void Knock(int times) {
        System.out.println(this.name + " knocks the door " + times + " times.");
    }

    public int hashCode() {
        return Objects.hash(name, age);
    }
    public boolean equals(Object object) {
        if (this == object) return true;
        return false;
    }
}
