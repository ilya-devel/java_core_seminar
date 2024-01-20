package home.Homeworks;

/**
 * Домашнее задание для второго семинара (1 part)
 */
public class Homeworks {
    /**
     * Метод, возвращающий количество чётных элементов массива
     *
     * @param array целочисленный массив
     * @return целое число
     */
    public static Integer countEvens(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        Integer count = 0;
        for (int value : array) {
            if (value % 2 == 0) {
                count++;
            }
        }
        return count;
    }

    /**
     * Функция, возвращающая разницу между самым большим и самым маленьким элементами переданного не пустого массива
     *
     * @param array целочисленный массив
     * @return целое число
     */
    public static Integer diffMinMaxArray(Integer[] array) {
        if (array.length == 0) {
            return null;
        }
        Integer min = array[0], max = array[0];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max - min;
    }

    /**
     * Функция, возвращающая истину, если в переданном массиве есть два соседних элемента, с нулевым значением.
     *
     * @param array целочисленный массив
     * @return true or false
     */
    public static Boolean hasZeroInArray(Integer[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            if (array[i] == 0 && array[i + 1] == 0) {
                return true;
            }
        }
        return false;
    }
}
