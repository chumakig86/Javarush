package com.javarush.task.task36.task3601;

/**
 * Created by chumak on 14.08.17.
 */
public class View {
    private static Controller controller = new Controller();

    public void fireEventShowData() {
        System.out.println(controller.onDataListShow());
    }
}
