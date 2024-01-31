package org.example.Homework;

import org.example.Homework.BackUp.BackUp;
import org.example.Homework.TicTacToe.TicTacToeService;

import javax.swing.*;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) {
        System.out.println("=== This is result of homeworks ===");

        System.out.println("\n=== TASK 1 ===\n");

        Path from = Paths.get("./src/main/java/org/example/Homework");
        Path to = Paths.get("./.backup");

        try {
            BackUp.runBackUp(from, to);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        System.out.println("\n=== TASK 2 ===\n");

        TicTacToeService.writeStatusGame();


        System.out.println("\n=== TASK 3 ===\n");

        TicTacToeService.loadStatusGame();

    }
}
