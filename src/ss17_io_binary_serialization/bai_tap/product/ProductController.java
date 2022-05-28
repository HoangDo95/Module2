package ss17_io_binary_serialization.bai_tap.product;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductController {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Product> productList = new ArrayList<>();

    public static void displayMenu() {
        do {
            try {
                System.out.println("----------Product Management----------");
                System.out.println("1. Display list Product");
                System.out.println("2. Add new Product");
                System.out.println("3. Search Product");
                System.out.println("4. Exit");
                System.out.println("Choose option: ");
                int choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Display list Product");
                        displayList();
                        break;
                    case 2:
                        System.out.println("Add new Product");
                        addNewProduct();
                        break;
                    case 3:
                        System.out.println("Search Product");
                        searchProduct();
                        break;
                    case 4:
                        System.exit(0);
                    default:
                        System.out.println("Nhập lại");
                }

            } catch (NumberFormatException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public static void displayList() throws IOException {
        productList = (List<Product>) ReadAndWrite.readToFile("src/ss17_io_binary_serialization/bai_tap/product.csv");
        for (Product item : productList) {
            System.out.println(item);
        }
    }

    public static void addNewProduct() throws IOException {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất: ");
        String production = scanner.nextLine();
        productList.add(new Product(productList.size() + 1, name, price, amount, production));
        ReadAndWrite.writeToFile("src/ss17_io_binary_serialization/bai_tap/product.csv", productList);
    }

    public static void searchProduct() throws IOException {
        ReadAndWrite.readToFile("src/ss17_io_binary_serialization/bai_tap/product.csv");
        System.out.println("Nhập từ cần tìm: ");
        boolean flag = false;
        String search = scanner.nextLine();
        for (Product item : productList) {
            if (item != null && item.getName().contains(search)) {
                System.out.println(item);
                flag = true;
            }
        }
        if (flag = true) {
            System.out.println("Không tìm thấy");
        }
    }

    public static void main(String[] args) throws IOException {
        ProductController.displayMenu();

    }
}
