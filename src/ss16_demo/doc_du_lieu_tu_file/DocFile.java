package ss16_demo.doc_du_lieu_tu_file;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class DocFile {
    public static void main(String[] args) {
        File file = new File("src\\ss16_01_io_file\\hoc_them\\doc_du_lieu_tu_file\\file_test_01");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while (true) {
                line = bufferedReader.readLine();// doc qua tung line
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}