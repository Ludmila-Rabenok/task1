package by.rabenok.task1.factory.impl;

import by.rabenok.task1.entity.CustomIntArray;
import by.rabenok.task1.factory.ArrayFactory;
import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.repository.DataBase;

public class CustomArrayFactory implements ArrayFactory {
    @Override
    public CustomArray create(int[] array) {
        CustomArray customArray = new CustomIntArray(array);
        DataBase.getInstance().addCustomArray(customArray);
        return customArray;
    }
}
