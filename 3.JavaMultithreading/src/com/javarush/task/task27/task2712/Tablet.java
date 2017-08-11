package com.javarush.task.task27.task2712;

import com.javarush.task.task27.task2712.ad.AdvertisementManager;
import com.javarush.task.task27.task2712.ad.NoVideoAvailableException;
import com.javarush.task.task27.task2712.kitchen.Order;
import com.javarush.task.task27.task2712.kitchen.TestOrder;

import java.io.IOException;
import java.util.Observable;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * Created by Serhii Boiko on 07.07.2017.
 */
public class Tablet {
    private LinkedBlockingQueue<Order> queue;
    final int number;
    private static Logger logger = Logger.getLogger(Tablet.class.getName());

    public Tablet(int number) {
        this.number = number;
    }

    public Order createOrder() {
        try {
            Order order = new Order(this);
            order(order);
            return order;
        }
        catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");
            return null;
        }
    }
    public void createTestOrder() {
        try {
            Order order = new TestOrder(this);
            order(order);

        }
        catch (IOException e) {
            logger.log(Level.SEVERE, "Console is unavailable.");

        }
    }

    private void order(Order order) {
        ConsoleHelper.writeMessage(order.toString());
        if (!order.isEmpty()) {
            try {
                queue.put(order);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            try {

                new AdvertisementManager(order.getTotalCookingTime()*60).processVideos();
            } catch (NoVideoAvailableException e) {
                logger.log(Level.INFO, "No video is available for the order " + order);
            }
        }
    }

    @Override
    public String toString() {
        return "Tablet{" +
                "number=" + number +
                '}';
    }
    public void setQueue(LinkedBlockingQueue<Order> queue) { this.queue = queue; }

}
