package home.ArraysOperation;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ArrayOperationInteger {
    public static Integer getMaxValue(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        Integer maxValue = array[0];
        for (Integer value : array) {
            if (value > maxValue) {
                maxValue = value;
            }
        }
        return maxValue;
    }

    public static Integer getMinValue(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        Integer minValue = array[0];
        for (Integer value : array) {
            if (value < minValue) {
                minValue = value;
            }
        }
        return minValue;
    }

    public static Boolean checkBalance(Integer[] array) {
        if (array.length == 0 || array.length == 1) {
            return false;
        }
        Integer left = array[0], right = 0;
        for (int i = 0; i < array.length - 1; i++) {
            left = sumArray(Arrays.copyOfRange(array, 0, i + 1));
            right = sumArray(Arrays.copyOfRange(array, i + 1, array.length));
            if (left == right) {
                return true;
            }
        }
        return false;
    }

    public static Integer sumArray(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        Integer result = 0;
        for (Integer value : array) {
            result += value;
        }
        return result;
    }
}
