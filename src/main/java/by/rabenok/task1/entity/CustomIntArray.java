package by.rabenok.task1.entity;

import java.util.Arrays;

public class CustomIntArray implements CustomArray {
    private int[] array;

    public CustomIntArray(int[] array) {
        this.array = array.clone();
    }

    public int[] getArray() {
        return array.clone();
    }

    public void setArray(int[] array) {
        this.array = array.clone();
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomIntArray that = (CustomIntArray) o;
        return Arrays.equals(array, that.array);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(array);
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "array=" + Arrays.toString(array) +
                '}';
    }
}
