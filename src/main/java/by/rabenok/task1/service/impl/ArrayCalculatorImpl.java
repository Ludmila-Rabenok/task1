package by.rabenok.task1.service.impl;

import by.rabenok.task1.entity.CustomArray;
import by.rabenok.task1.service.ArrayCalculator;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.Arrays;

public class ArrayCalculatorImpl implements ArrayCalculator {
    public static final Logger LOGGER = LogManager.getLogger();
    //Нужны ли логеры в сервисных классах?

    @Override
    public int sumOfArray(CustomArray customArray) {
        int[] array = customArray.getArray();
        int sum = Arrays.stream(array).sum();
        LOGGER.info("sum = " + sum);
        return sum;
    }
}
