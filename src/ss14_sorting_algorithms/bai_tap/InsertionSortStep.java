package ss14_sorting_algorithms.bai_tap;

import java.util.Scanner;

public class InsertionSortStep {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter arr size:");
        int size = scanner.nextInt();
        int[] arr = new int[size];
        System.out.println("Enter " + arr.length + " values:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        System.out.print("Your input arr: ");

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "\t");
        }
        System.out.println("\nBegin sort processing...");
        System.out.println("Mảng ban đầu:");
        printArray(arr);
        InsertionSort ob = new InsertionSort();
        ob.sort(arr);
        System.out.println("Mảng sau khi sắp xếp:");
        printArray(arr);

    }
    void sort(int arr[]) {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
    static void printArray(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");

        System.out.println();
    }
}
