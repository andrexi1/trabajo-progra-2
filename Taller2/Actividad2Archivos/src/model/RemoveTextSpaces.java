package model;

import java.io.*;

public class RemoveTextSpaces {

    public RemoveTextSpaces() {

    }

    public void Remove(String file) throws FileNotFoundException {
        try (BufferedReader reader = new BufferedReader(new FileReader(file));
             FileWriter writer = new FileWriter("src/resources/output.txt")) {
            String line;
            while ((line = reader.readLine()) != null) {
                writer.write(line.replaceAll("\\s+", ""));
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
