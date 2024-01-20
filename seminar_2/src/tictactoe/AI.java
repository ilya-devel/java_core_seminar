package tictactoe;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Random;

public class AI {
    private final char DOT;
    private Random random;

    public AI(char ch) {
        DOT = ch;
        random = new Random();
    }

    void turnOld(Field field) {
        int x, y;
        do {
            x = random.nextInt(field.getSize());
            y = random.nextInt(field.getSize());
        } while (!field.isCellValid(x, y));
        field.setDot(x, y, DOT);
    }

    void turn(Field field) {
        LinkedHashMap<Integer, LinkedList<Integer[]>> lstPos = new LinkedHashMap<>();
        lstPos.put(2, new LinkedList<>());
        lstPos.put(1, new LinkedList<>());
        lstPos.put(0, new LinkedList<>());

        for (int i = 0; i < field.getSize(); i++) {
            LinkedList<Integer[]> rowLst = new LinkedList<>(), colLst = new LinkedList<>();
            for (int j = 0; j < field.getSize(); j++) {
                colLst.add(new Integer[] {j, i});
                rowLst.add(new Integer[] {i, j});
            }
            LinkedHashMap<Integer, LinkedList<Integer[]>> resultCol = checkValue(colLst, field);
            LinkedHashMap<Integer, LinkedList<Integer[]>> resultRow = checkValue(rowLst, field);

            for (Integer key: resultCol.keySet()) {
                LinkedList<Integer[]> tmpLstCol = lstPos.get(key);
                if (tmpLstCol != null) {
                    for (Integer[] pos : resultCol.get(key)) {
                        tmpLstCol.add(pos);
                    }
                }
            }
            for (Integer key: resultRow.keySet()) {
                LinkedList<Integer[]> tmpLstRow = lstPos.get(key);
                if (tmpLstRow != null) {
                    for (Integer[] pos : resultRow.get(key)) {
                        tmpLstRow.add(pos);
                    }
                }
            }
        }

        Integer x = 0, y = 0;
        for (int i = 0; i < 3; i++) {
            if (!lstPos.get(i).isEmpty()) {
                Integer ind = random.nextInt(lstPos.get(i).size());
                x = lstPos.get(i).get(ind)[0];
                y = lstPos.get(i).get(ind)[1];
                field.setDot(x, y, DOT);
                return;
            }
        }
    }

    LinkedHashMap<Integer, LinkedList<Integer[]>> checkValue(LinkedList<Integer[]> row, Field field) {
        Integer aiCount = 0, userCount = 0, emptyCount = 0;
        LinkedList<Character> charRow = new LinkedList<>();
        LinkedList<Integer[]> emptyPos = new LinkedList<>();
        for (int i = 0; i < row.size(); i++) {
            Integer x = row.get(i)[0];
            Integer y = row.get(i)[1];
            charRow.add(field.getMap()[x][y]);
            if (field.getMap()[x][y] == field.getEMPTY_DOT()) {
                emptyPos.add(new Integer[] {x, y});
            }
        }
        for (Character sign : charRow) {
            if (sign == field.getHumanDot()) userCount++;
            if (sign == field.getEMPTY_DOT()) emptyCount++;
            if (sign == field.getAIDot()) aiCount++;
        }
        Integer levelWarning = null;
        if (userCount == 2 && aiCount == 0) levelWarning = 0;
        if (userCount == 1 && aiCount == 1) levelWarning = 1;
        if (emptyCount > 1) levelWarning = 2;

        LinkedHashMap<Integer, LinkedList<Integer[]>> result = new LinkedHashMap<>();
        result.put(levelWarning, emptyPos);
        return result;
    }
}
