package by.rabenok.task1.repository;

import by.rabenok.task1.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class DataBase {
    private static DataBase instance;
    private final List<CustomArray> customArrayList = new ArrayList<>();

    private DataBase() {
    }

    public static DataBase getInstance() {
        if (instance == null) {
            instance = new DataBase();
        }
        return instance;
    }

    public void addCustomArray(CustomArray customArray) {
        customArrayList.add(customArray);
    }

    public List<CustomArray> getAllCustomArray() {
        return customArrayList;
    }
}
