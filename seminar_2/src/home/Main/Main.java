package home.Main;

import java.util.Arrays;

import home.ArraysOperation.*;
import home.Homeworks.Homeworks;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = { 1, 3, 4, 5, 7, 9, 2 };
        System.out.println(ArrayOperationInteger.getMaxValue(arr));

        Integer[][] arr2 = JobWith2DArray.create2DArray(7);
        JobWith2DArray.fillArraySquadDiagonal(arr2);
        JobWith2DArray.show2DArray(arr2);

        Integer[] arr3 = { 1,1,1,1,4};
        System.out.println(ArrayOperationInteger.checkBalance(arr3));

        Integer[] arr4 = Arrays.copyOfRange(arr3, 0, 3);
        System.out.println(ArrayOperationInteger.sumArray(arr4));

        System.out.println("Checking homeworks");
        System.out.println("\nTask 1");
        System.out.println(Homeworks.countEvens(arr));
        System.out.println(Homeworks.countEvens(arr3));
        System.out.println(Homeworks.countEvens(new Integer[] {3,1,7,5,9}));

        System.out.println("\nTask 2");
        System.out.println(Homeworks.diffMinMaxArray(new Integer[] {3,2,7,5,9}));

        System.out.println("\nTask 3");
        System.out.println(Homeworks.hasZeroInArray(new Integer[] {3,2,7,5,9}));
        System.out.println(Homeworks.hasZeroInArray(new Integer[] {}));
        System.out.println(Homeworks.hasZeroInArray(new Integer[] {1}));
        System.out.println(Homeworks.hasZeroInArray(new Integer[] {3,2,0,5,9}));
        System.out.println(Homeworks.hasZeroInArray(new Integer[] {3,2,0,0,9}));
    }
}
