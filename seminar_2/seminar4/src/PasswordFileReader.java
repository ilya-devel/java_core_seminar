import java.io.*;
import java.util.Collections;
import java.util.LinkedList;

public class PasswordFileReader {
    public static LinkedList<String> readFile(String fileName) {
        try (BufferedReader reader = new BufferedReader(new InputStreamReader(new FileInputStream(fileName)))) {
            String row = reader.readLine();
            LinkedList<String> result = new LinkedList<>();
            if (row != null) {
                Collections.addAll(result, row.split(" "));
                if (result.size() != 3) {
                    throw new WrongFileData("В файле не достаточно данных для работы, необходимы: логин, пароль, пароль повторно разделённые пробелом");
                }
                return result;
            }
            return null;
        } catch (IOException | WrongFileData e) {
            throw new RuntimeException(e);
        }
    }
}

class WrongFileData extends Exception {
    public WrongFileData(String message) {
        super(message);
    }
}