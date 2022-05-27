package ss16_01_io_file.hoc_them.doc_du_lieu_tu_file_và_thêm_vào_list;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;

public class GhiVaoList {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        try (FileReader fileReader = new FileReader("src\\ss16_01_io_file\\hoc_them\\doc_du_lieu_tu_file_và_thêm_vào_list\\file_test_02");
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
            String line;
            while (true) {
                line = bufferedReader.readLine();
                if (line == null) {
                    break;
                }
                String[] txt = line.split(",");
                String name = txt[0];
                String address = txt[1];
                String gender = txt[2];
                list.add(new Student(name, address, gender));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        for (Student item : list) {
            System.out.println(item);
        }
    }
}
