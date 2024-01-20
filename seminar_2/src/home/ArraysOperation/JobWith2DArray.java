package home.ArraysOperation;

public class JobWith2DArray {
    public static Integer[][] create2DArray(Integer width, Integer height) {
        Integer[][] newArr = new Integer[height][width];
        for (int i = 0; i < newArr.length; i++) {
            for (int y = 0; y < newArr.length; y++) {
                newArr[i][y] = 0;
            }
        }
        return newArr;
    }

    public static Integer[][] create2DArray(Integer size) {
        return create2DArray(size, size);
    }

    public static void fillArraySquadDiagonal(Integer[][] array) {
        if (array.length != array[0].length) {
            System.out.println("Error: array is not squad");
            ;
        }
        for (int i = 0; i < array.length; i++) {
            array[i][i] = 1;
            array[array.length - i - 1][i] = 1;
        }
        // return array;
    }

    public static void show2DArray (Integer[][] array) {
        for (int i = 0; i < array.length; i++){
            for (int y = 0; y < array.length; y++) {
                System.out.printf("%d ", array[i][y]);
            }
            System.out.printf("\n");
        }
    }
}
