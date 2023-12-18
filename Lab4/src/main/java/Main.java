import wonders.*;
import wonders.animals.*;
import wonders.types.Age;

import java.util.InputMismatchException;
import java.util.Scanner;
import exceptions.*;
import java.io.FileNotFoundException;
import java.io.File;
import java.lang.Exception;

class Cl {
    public void makeNoise(){}
}

public class Main {
    public static void main(String[] args) throws IncorrectFileNameException, NotIntegerException, NotKnockingException, NegativeKnockException {
        Frog Footman = new Frog("Footman");
        Human Alice = new Human("Alice", Age.TEENAGER);
        Human Duchess = new Human("Duchess", Age.SENIOR);
        Human Baby = new Human("Baby", Age.BABY);
        Human Cook = new Human("Cook", Age.ADULT);
        Cat CheshireCat = new Cat("Cheshire Cat");

        //To ask reader how much times he/she wants Alice to knock the door
        Scanner scanner = new Scanner(System.in);  // Create a Scanner object
        System.out.print("---How much times will Alice knock the door?---   ");
        try{
            int times = scanner.nextInt();  // Read user input
            if (times == 0){
                throw new NotKnockingException("Alice did not knock");
            } else if(times < 0){
                throw new NegativeKnockException("Alice cannot knock a negative number of times");
            }else {
                Alice.Knock(times);
            }
        } catch(InputMismatchException err) {
            throw new NotIntegerException("Not an integer provided", err);
        }

        String fileName1 = "D:\\ITMO\\Programming\\Labs\\Lab4\\src\\main\\java\\texts\\Footman.txt";
        try (Scanner file = new Scanner(new File(fileName1))) {
            if (file.hasNextLine()) {
                Footman.Talk(file.nextLine());
            }
        } catch (FileNotFoundException err) {
            System.out.println("File not found!!!");
            throw new IncorrectFileNameException("Incorrect filename", err);
        }


        String fileName2 = "D:\\ITMO\\Programming\\Labs\\Lab4\\src\\main\\java\\texts\\Alice1.txt";
        try (Scanner file = new Scanner(new File(fileName2))) {
            if (file.hasNextLine()) {
                Alice.Talk(file.nextLine());
            }
        } catch (FileNotFoundException err) {
            throw new IncorrectFileNameException("Incorrect filename. 1st Alice's speech");
        }

        String fileName3 = "D:\\ITMO\\Programming\\Labs\\Lab4\\src\\main\\java\\texts\\Footman2.txt";
        try (Scanner file = new Scanner(new File(fileName3))) {
            if (file.hasNextLine()) {
                Footman.Talk(file.nextLine());
            }
        } catch (FileNotFoundException err) {
            throw new IncorrectFileNameException("Incorrect filename. 2nd Footman's speech");
        }

        Footman.Watch("sky");
        Footman.Sit(Alice.toString());
        Alice.Knock(3);

        Cl rat = new Cl() {
            @Override
            public void makeNoise() {
                System.out.println("Chchchchch");
            }
        };
        try {
            Cl newInst = rat.getClass().newInstance();
            newInst.makeNoise();
        } catch (InstantiationException | IllegalAccessException e) {
            throw new RuntimeException(e);
        }

        System.out.print("(A rat passes)\n- Rat: ");
        rat.makeNoise();

        Alice.Walk(Duchess.toString());
        Alice.Jump();
        Duchess.Hold(Baby.toString());
        Cook.Cook();
        CheshireCat.Grin();
    }
}