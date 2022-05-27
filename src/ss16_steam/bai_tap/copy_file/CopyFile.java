package ss16_steam.bai_tap.copy_file;

import java.io.*;

public class CopyFile {
    public static void main(String[] args) throws FileNotFoundException {
        File fileOne = new File("src/ss16_steam/bai_tap/copy_file/test1.csv");
        File fileTwo = new File("src/ss16_steam/bai_tap/copy_file/test2.csv");
        try (FileReader fileReader = new FileReader(fileOne);
             BufferedReader bufferedReader = new BufferedReader(fileReader);
             FileWriter fileWriter = new FileWriter(fileTwo);
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] arr = line.split("");
                for (String value : arr) {
                    bufferedWriter.write(value);
                }
                bufferedWriter.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
