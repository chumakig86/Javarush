package com.javarush.task.task27.task2712.kitchen;
import com.javarush.task.task27.task2712.ConsoleHelper;
import com.javarush.task.task27.task2712.Tablet;
import com.javarush.task.task27.task2712.ad.AdvertisementManager;
import com.javarush.task.task27.task2712.statistic.StatisticManager;
import com.javarush.task.task27.task2712.statistic.event.CookedOrderEventDataRow;

import java.util.ArrayList;
import java.util.List;
import java.util.Observable;
import java.util.Observer;
import java.util.concurrent.LinkedBlockingQueue;

public class Cook extends Observable implements Observer{
    private LinkedBlockingQueue<Order> queue;
    private String name;
    private volatile boolean caught = false;

    public void setQueue(LinkedBlockingQueue<Order> queue) { this.queue = queue; }

    public Cook(String name) { this.name = name; }





    @Override
    public String toString()
    {
        return name;
    }

    @Override
    public void update(Observable o, Object arg) {
        Order order = (Order) arg;
        ConsoleHelper.writeMessage("Start cooking - " + arg + ", cooking time " + order.getTotalCookingTime() + "min");
        StatisticManager.getInstance().register(new CookedOrderEventDataRow(o.toString(),name,order.getTotalCookingTime()*60,order.getDishes()));
        setChanged();
        notifyObservers(arg);
    }
}