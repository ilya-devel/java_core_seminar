package Shop;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Logging {
    private String fileName;

    public Logging(String fileName) {
        this.fileName = fileName;
    }

    public void logging (String msg) {
        try (FileWriter fw = new FileWriter (this.fileName, true)){
            fw.write(msg + "\n");
        }
        catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
