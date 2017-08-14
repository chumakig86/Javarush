package com.javarush.task.task36.task3601;

import java.util.List;

/**
 * Created by chumak on 14.08.17.
 */
public class Model {
    private static Service service = new Service();

    public List<String> getStringDataList() {
        return service.getData();
    }
}
