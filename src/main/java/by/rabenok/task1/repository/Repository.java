package by.rabenok.task1.repository;

import by.rabenok.task1.entity.CustomArray;

import java.util.ArrayList;
import java.util.List;

public class Repository {
  private static Repository instance;
  private final List<CustomArray> customArrayList = new ArrayList<>();

  private Repository() {
  }

  public static Repository getInstance() {
    if (instance == null) {
      instance = new Repository();
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
