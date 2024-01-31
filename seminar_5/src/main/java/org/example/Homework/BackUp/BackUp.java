package org.example.Homework.BackUp;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class BackUp {
    public static void runBackUp (Path from, Path to) throws IOException {
        if (!(Files.isExecutable(to) && Files.isDirectory(to))) {
            Files.createDirectory(to);
        }
        int countFiles = 0;
        for (File file : from.toFile().listFiles()) {
            if (!file.isFile()) continue;
            Files.copy(file.toPath(), Paths.get(to + File.separator + file.getName()), REPLACE_EXISTING);
            countFiles++;
        }
        System.out.println("Completed backup for " + countFiles + " files");
    }
}
