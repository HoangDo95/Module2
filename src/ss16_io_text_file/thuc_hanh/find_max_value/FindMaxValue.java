package ss16_io_text_file.thuc_hanh.find_max_value;

import java.util.List;

public class FindMaxValue {
    public static int findMax(List<Integer> numbers) {
        int max = numbers.get(0);
        for (int i = 0; i < numbers.size(); i++) {
            if (max < numbers.get(i)) {
                max = numbers.get(i);
            }
        }
        return max;
    }

    public static void main(String[] args) {
        ReadAndWriteFile readAndWriteFile = new ReadAndWriteFile();
        List<Integer> numbers = readAndWriteFile.readFile("src/ss16_steam/thuc_hanh/find_max_value/test.csv");
        int maxValue = findMax(numbers);
        readAndWriteFile.writeFile("src/ss16_steam/thuc_hanh/find_max_value/result.csv", maxValue);
    }
}
