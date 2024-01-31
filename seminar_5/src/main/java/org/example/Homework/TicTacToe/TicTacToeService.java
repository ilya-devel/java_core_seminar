package org.example.Homework.TicTacToe;

import java.io.*;
import java.util.LinkedList;

public class TicTacToeService {
    enum CellStatus {EMPTY, CROSS, ZERO, RESERVE}

    private static String fileName = "./statusGame";

    public static void writeStatusGame() {
        CellStatus[] cellStatuses = new CellStatus[]{
                CellStatus.CROSS, CellStatus.EMPTY, CellStatus.CROSS,
                CellStatus.ZERO, CellStatus.ZERO, CellStatus.EMPTY,
                CellStatus.ZERO, CellStatus.CROSS, CellStatus.CROSS
        };

        System.out.println("Status list for saving:");
        showCellStatus(cellStatuses);

        try (FileOutputStream fos = new FileOutputStream(fileName)) {
            for (int i = 0; i < 9; i += 3) {
                int b = 0;
                for (int j = 0; j < 3; j++) {
                    b += cellStatuses[i + j].ordinal();
                    b = b << 2;
                }
//                System.out.println("--" + Integer.toBinaryString(b) + " " + b + " " + (byte) b);
                fos.write(b);
            }
        } catch (IOException e) {
            System.out.println(e);
        }

        System.out.println("File saved");
    }

    public static void loadStatusGame() {
        try (FileInputStream fis = new FileInputStream(fileName)) {
            int s;
            LinkedList<CellStatus> lstCell = new LinkedList<>();
            while ((s = fis.read()) != -1) {
//                System.out.println("--" + Integer.toBinaryString(s) + " " + s + " " + (byte) s);
                char[] arrayBin;
                if (Integer.toBinaryString(s).length() == 7) {
                    arrayBin = ("0" + Integer.toBinaryString(s)).toCharArray();
                } else {
                    arrayBin = (Integer.toBinaryString(s)).toCharArray();
                }
                for (int i = 0; i < 3; i++) {
                    StringBuilder tmpBin = new StringBuilder();
                    tmpBin.append(arrayBin[i * 2]);
                    tmpBin.append(arrayBin[i * 2 + 1]);
                    CellStatus tmpStatus = CellStatus.values()[Integer.parseInt(tmpBin.toString(), 2)];
                    lstCell.add(tmpStatus);
                }
            }
            System.out.println("Status list after loading");
            showCellStatus(lstCell);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("File loaded");
    }

    public static void showCellStatus(CellStatus[] array) {
        for (CellStatus cell : array) {
            System.out.printf("%s, ", cell);
        }
        System.out.println("\n");
    }

    public static void showCellStatus(LinkedList<CellStatus> array) {
        for (CellStatus cell : array) {
            System.out.printf("%s, ", cell);
        }
        System.out.println("\n");
    }
}
