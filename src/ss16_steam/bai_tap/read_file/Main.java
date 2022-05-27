package ss16_steam.bai_tap.read_file;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Country> list = new ArrayList<>();
        File file = new File("src/ss16_steam/bai_tap/read_file/country.csv");
        try (FileReader fileReader = new FileReader(file);
             BufferedReader bufferedReader = new BufferedReader(fileReader)){
            String line;
            while (true){
                line = bufferedReader.readLine();
                if (line == null){
                    break;
                }String[] txt = line.split(",");
                int id = Integer.parseInt(txt[0]);
                String code = txt[1];
                String name = txt[2];
                list.add(new Country(id, code, name));
            }
            for (Country item : list) {
                System.out.println(item);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
