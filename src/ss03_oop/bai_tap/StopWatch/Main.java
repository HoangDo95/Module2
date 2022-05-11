package ss03_oop.bai_tap.StopWatch;
import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (int) (Math.random() * 1000);
        }
        System.out.println("Array : " + Arrays.toString(arr));
        StopWatch stopWatch = new StopWatch();
        stopWatch.start();
        sort(arr);
        stopWatch.end();
        System.out.println("Ranger : " + Arrays.toString(arr));
        System.out.println("Timer : " + stopWatch.getElapsedTime());

    }
    public static void sort(int... arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int swap = arr[i];
                    arr[i] = arr[j];
                    arr[j] = swap;
                }
            }
        }
    }

}