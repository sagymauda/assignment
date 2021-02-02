package filehandler;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class FileHandlerWrite {
    public static void writeToFileUrl (String writeToFilePath ,List<Character> characterList) throws IOException {
        FileWriter writer;
        try {
            writer  = new FileWriter(new File(writeToFilePath), true);
            for (Character character:characterList) {
                writer.write(character);
            }
            writer.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new FileNotFoundException("The File Required Is Not To B Found");
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException("Can Not Write To  File");
        }

    }

}
