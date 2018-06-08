package domParser;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class CreateFile {
    public static void createFile(Person person) {
        try {
            FileWriter writer = new FileWriter("src/main/resources/DomParserResult.txt", true);
            BufferedWriter bufferWriter = new BufferedWriter(writer);
            bufferWriter.write(String.valueOf(person) + "\r\n");
            bufferWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
