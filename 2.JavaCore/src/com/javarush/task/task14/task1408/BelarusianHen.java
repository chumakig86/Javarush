package com.javarush.task.task14.task1408;

/**
 * Created by chumak on 12.05.17.
 */
public class BelarusianHen extends Hen {
    @Override
    int getCountOfEggsPerMonth() {
        return 1;
    }
    String getDescription () {
        return (super.getDescription() + " Моя страна - " + Country.BELARUS + ". Я несу " + getCountOfEggsPerMonth() + " яиц в месяц.");
    }
}
