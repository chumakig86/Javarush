package com.javarush.task.task27.task2712.statistic.event;

import java.util.Date;

/**
 * Created by user on 30.07.2017.
 */
public interface EventDataRow {
    public EventType getType();
    public Date getDate();
    int getTime();
}
