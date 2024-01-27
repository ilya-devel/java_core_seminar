import AuthentificationFunc.AuthentificationFunc;

import java.io.FileWriter;
import java.io.IOException;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        System.out.println("Seminar 4");

        try {
            LinkedList<String> logPas = PasswordFileReader.readFile("test");
            String login = logPas.get(0), password = logPas.get(1), confirmPassword = logPas.get(2);
            if (AuthentificationFunc.isValid(login, password, confirmPassword)) {
                System.out.println("Данные корректны");
            }
        } catch (Exception e) {
            System.out.println(e);
            logging(e.getMessage());
        }
    }

    public static void logging (String msg) {
        try (FileWriter fw = new FileWriter("log", true)) {
                fw.write(msg + "\n");
            }
        catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}