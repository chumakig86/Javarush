package com.javarush.task.task37.task3711;

/**
 * Created by chumak on 16.08.17.
 */
public class Computer {
    CPU cpu = new CPU();
    Memory memory = new Memory();
    HardDrive hardDrive = new HardDrive();
    void run() {
       cpu.calculate();
       memory.allocate();
       hardDrive.storeData();
    }
}
