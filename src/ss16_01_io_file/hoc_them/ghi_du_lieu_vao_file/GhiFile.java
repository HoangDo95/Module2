package ss16_01_io_file.hoc_them.ghi_du_lieu_vao_file;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class GhiFile {
    public static void main(String[] args) {
        Student student = new Student("HỮU ĐỨC", "HÀ TĨNH", "NAM");
        Student student1 = new Student("HẢI", "ĐÀ NẴNG", "NAM");
        Student student2 = new Student("TUẤN", "QUÃNG NAM", "NAM");
        List<Student> list = new ArrayList<>();
        list.add(student);
        list.add(student1);
        list.add(student2);
        try (FileWriter fileWriter = new FileWriter("src\\ss16_01_io_file\\hoc_them\\ghi_du_lieu_vao_file\\file_test");
             BufferedWriter bufferedWriter = new BufferedWriter(fileWriter)) {
            for (Student item : list) {
                bufferedWriter.write(item.toString());
                bufferedWriter.newLine();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}