package com.javarush.task.task25.task2506;

/**
 * Created by user on 08.07.2017.
 */
public class LoggingStateThread extends Thread {
    private Thread thread;
    public LoggingStateThread(Thread thread) {
        this.thread = thread;
        //System.out.println(thread.getState());
    }
    public void run() {
        State st = thread.getState();
        System.out.println(st);
        while(st != State.TERMINATED){
            if(st != thread.getState()) {
                st = thread.getState();
                System.out.println(st);
            }
        }
    }
}
