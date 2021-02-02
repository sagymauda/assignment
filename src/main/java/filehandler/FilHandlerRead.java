package filehandler;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FilHandlerRead {
    public static List<Character> readFromFileUrl(String readFromFile) throws IOException {
        List<Character> characters = new ArrayList<>();
        FileReader fileReader;
        try {
            fileReader = new FileReader(new File(readFromFile));
            int letters;
            while (fileReader.ready()) {
                letters = fileReader.read();
                characters.add((char) letters);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            throw new FileNotFoundException("The File Required Is Not To B Found");
        } catch (IOException e) {
            e.printStackTrace();
            throw new IOException ("Can Not Read From File");
        }
        return characters;
    }
}
