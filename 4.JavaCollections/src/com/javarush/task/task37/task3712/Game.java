package com.javarush.task.task37.task3712;

/**
 * Created by chumak on 16.08.17.
 */
public abstract class Game {
    abstract  void prepareForTheGame();
    abstract void playGame();
    abstract void congratulateWinner();
    public void run () {
        prepareForTheGame();
        playGame();
        congratulateWinner();
    }

}
