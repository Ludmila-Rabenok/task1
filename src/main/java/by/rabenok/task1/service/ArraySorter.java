package by.rabenok.task1.service;

import by.rabenok.task1.entity.CustomArray;

public interface ArraySorter {
    int[] bubbleSort(CustomArray customArray);

    int[] selectionSort(CustomArray customArray);
}
