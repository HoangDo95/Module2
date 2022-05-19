package ss11_stack_queue.bai_tap.treemap;

import java.util.Scanner;
import java.util.TreeMap;

public class TestMap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Nhập chuỗi: ");
        String str = input.nextLine();
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        int value;
        String[] arrStr = str.toLowerCase().split("");
        for (String item : arrStr) {
            if (treeMap.containsKey(item)) {
                value = treeMap.get(item) + 1;
                treeMap.put(item, value);
            } else {
                value = 1;
                treeMap.put(item, value);
            }
        }
        System.out.println(treeMap);
    }
}
