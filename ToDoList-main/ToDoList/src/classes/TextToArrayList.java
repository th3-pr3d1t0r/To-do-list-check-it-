package classes;

import javax.swing.JTextField;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;


public class TextToArrayList {
    static String[] getTextFromArray(JTextField textField) {
        String text = textField.getText();
        String[] textArray = text.split("\\."); // Split by period
        return textArray;
    }

    public static void writeArrayToFile(String[] textArray, String fileName, boolean append) throws IOException {
        try (FileWriter fileWriter = new FileWriter(fileName, append)) {
            for (String text : textArray) {
                fileWriter.write(text + "\n");
            }
        }
    }
}
