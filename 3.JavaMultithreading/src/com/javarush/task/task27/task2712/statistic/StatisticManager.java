package com.javarush.task.task27.task2712.statistic;
import com.javarush.task.task27.task2712.kitchen.Cook;
import com.javarush.task.task27.task2712.statistic.event.EventDataRow;
import com.javarush.task.task27.task2712.statistic.event.EventType;

import java.util.*;

public class StatisticManager {
    private static StatisticManager ourInstance = new StatisticManager();
    private StatisticStorage statisticStorage = new StatisticStorage();
    private Set<Cook> cooks=new HashSet<>();
    public static StatisticManager getInstance() {
        return ourInstance;
    }
    private StatisticManager() {
    }
    public void register(EventDataRow data) {
        statisticStorage.put(data);

    }
    public void register(Cook cook){
        cooks.add(cook);
    }
    private static class StatisticStorage {
        private Map<EventType, List<EventDataRow>> storage = new HashMap<>();
        public StatisticStorage() {
            for (EventType type : EventType.values()) {
                storage.put(type, new ArrayList<EventDataRow>());
            }
        }
        private void put(EventDataRow data) {
            storage.get(data.getType()).add(data);
        }
    }
}