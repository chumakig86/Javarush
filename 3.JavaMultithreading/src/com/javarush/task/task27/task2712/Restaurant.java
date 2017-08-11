package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.kitchen.Waiter;
import com.javarush.task.task27.task2712.statistic.StatisticManager;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.LinkedBlockingQueue;

/**
 * Created by Serhii Boiko on 07.07.2017.
 */
public class Restaurant {
    private final static int ORDER_CREATING_INTERVAL = 100;
    private final static LinkedBlockingQueue<Order> orderQueue = new LinkedBlockingQueue<>();
    public static void main(String[] args)  {
        Locale.setDefault(Locale.ENGLISH);

        Cook cook1 = new Cook("Amigo");
        cook1.setQueue(orderQueue);


        Cook cook2 = new Cook("Amigo2");
        cook2.setQueue(orderQueue);

        List<Tablet> tabletList = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            Tablet tablet = new Tablet(i);
            tablet.setQueue(orderQueue);
            tabletList.add(tablet);

        }

        RandomOrderGeneratorTask generatorTask = new RandomOrderGeneratorTask(tabletList, ORDER_CREATING_INTERVAL);
        Thread thread = new Thread(generatorTask);
        Thread cookThread1 = new Thread(cook1);
        Thread cookThread2 = new Thread(cook2);
        thread.start();
        cookThread1.start();
        cookThread2.start();
        DirectorTablet directorTablet = new DirectorTablet();
        directorTablet.printActiveVideoSet();
        directorTablet.printAdvertisementProfit();
        directorTablet.printArchivedVideoSet();
        directorTablet.printCookWorkloading();
    }
}
