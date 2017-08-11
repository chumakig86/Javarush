package com.javarush.task.task27.task2712.kitchen;

import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;

import java.util.Observable;
import java.util.Observer;
import java.util.Set;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Serhii Boiko on 07.07.2017.
 */
public class Cook implements Runnable  {
    private LinkedBlockingQueue<Order> queue;
    private volatile boolean caught = false;
    public void setQueue(LinkedBlockingQueue<Order> queue) {
        this.queue = queue;
    }

    private String name;
    private boolean busy;

    public Cook(String name) {
        this.name = name;
    }

    public boolean isBusy() {
        return busy;
    }

    @Override
    public String toString() {
        return name;
    }
    public void startCookingOrder(Order order) {
        busy = true;
        int coolingTime = order.getTotalCookingTime();
        ConsoleHelper.writeMessage("Start cooking - " + order.toString() + ", cooking time " + coolingTime + "min");
        StatisticManager.getInstance().register(new CookedOrderEventDataRow((order).getTablet().toString(),
                this.name, (order).getTotalCookingTime() ,(order).getDishes()));

        try {
            Thread.sleep(coolingTime*10);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        busy = false;
    }




            @Override
            public void run() {
                while (true) {
                    try {
                        startCookingOrder(queue.take());
                    }
                    catch (InterruptedException e) {}
                    try {
                        Thread.sleep(10);
                    }
                    catch (InterruptedException e) {
                        caught = true;
                    }
                    if (caught && queue.isEmpty()) break;
                }
    }
}
