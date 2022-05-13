package CRUD;

import java.util.Scanner;

public class Main {
    public static Product[] productList = new Product[100];
    public static int count;
    static Scanner scanner = new Scanner(System.in);

    static {
        System.out.println("Block static");
        productList[0] = new Product(1, "Iphone X", 100, 10, "Apple");
        productList[1] = new Product(2, "S22 Ultra", 110, 20, "Samsung");
        productList[2] = new Product(3, "Mi 10", 120, 30, "Xiaomi");
        productList[3] = new Product(4, "Iphone 11", 140, 40, "Apple");
        productList[4] = new Product(5, "Iphone 12", 150, 50, "Apple");
        count = 5;

    }

    public static void addNewProduct() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất: ");
        String production = scanner.nextLine();

        Product product = new Product(count + 1, name, price, amount, production);
        productList[count] = product;
        count++;
    }

    public static void searchProduct() {
        System.out.println("Nhập từ cần tìm: ");
        String search = scanner.nextLine();
        for (Product item : productList) {
            if (item != null && item.getName().contains(search)) {
                System.out.println(item);
            }
        }
    }

    public static void deleteProduct() {
        System.out.println("Nhập vị trí id cần xóa: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == inputId) {
                productList[i] = productList[i + 1];
            }
        }
    }

    public static void updateProduct() {
        System.out.println("Nhập vị trí id cần sửa: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productList.length; i++) {
            if (productList[i] != null && productList[i].getId() == inputId) {
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập giá: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập số lượng: ");
                int amount = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập nhà sản xuất: ");
                String production = scanner.nextLine();
                Product update = new Product(i + 1, name, price, amount, production);
                productList[i] = update;

            }
        }
    }

    public static void displayList() {
        for (Product item : productList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("----------Product Management----------");
            System.out.println("1. Display list Product");
            System.out.println("2. Add new Product");
            System.out.println("3. Search Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Update Product");
            System.out.println("6. Exit");
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
                    System.out.println("Delete Product");
                    deleteProduct();
                    break;
                case 5:
                    System.out.println("Update Product");
                    updateProduct();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
