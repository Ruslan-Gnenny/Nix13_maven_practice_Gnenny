package gameplay;

import data.Sign;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import static data.Sign.getSign;

public class TestUtils {

    public static Sign[][] textToArray(String fileName, int size) throws IOException {
        String str = Files.readString(Paths.get("src", "test", "resources", fileName));
        Sign[][] result = new Sign[size][size];
        String[] lines = str.split("\n");
        for (int i = 0; i < size; i++) {
            String[] cells = lines[i].split(" ");
            for (int j = 0; j < size; j++) {
                result[i][j] = getSign(cells[j].charAt(0));
            }
        }
        return result;
    }
}
