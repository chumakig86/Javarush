package com.javarush.task.task21.task2113;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by chumak on 09.06.17.
 */
public class Hippodrome {

    private List<Horse> horses;
    static Hippodrome game;

    public List<Horse> getHorses() {
        return horses;
    }

    public Hippodrome(List<Horse> horses) {
        this.horses = horses;
    }

    public void run () throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            move();
            print();
            Thread.sleep(200);
        }
    }
    public void move () {
        for (Horse hors : horses) {
            hors.move();
        }
    }
    public void print () {
        for (Horse hors : horses) {
            hors.print();
        }
        for (int i = 0; i < 10; i++) System.out.println();
    }
    public Horse getWinner() {
        double max = Integer.MIN_VALUE;
        Horse horse1 = new Horse("1",0,0);
        for (Horse horse : horses)
        {
            if (horse.distance > max) {max = horse.distance; horse1 = horse;}
        }
        return horse1;
    }
    public void printWinner() {System.out.printf("Winner is %s!",getWinner().name);}

    public static void main(String[] args) throws InterruptedException {
    List<Horse> list = new ArrayList<Horse>();
    list.add(new Horse("Horse1", 3, 0));
        list.add(new Horse("Horse2", 3, 0));
        list.add(new Horse("Horse3", 3, 0));
    game = new Hippodrome(list);
    game.run();
    game.printWinner();
    }
}
