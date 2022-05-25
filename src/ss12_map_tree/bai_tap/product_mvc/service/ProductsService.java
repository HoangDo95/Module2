package ss12_map_tree.bai_tap.product_mvc.service;
import ss12_map_tree.bai_tap.product_mvc.model.Products;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class ProductsService implements IProductsService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Products> productsList = new LinkedList<>();
    int count;
    static {
        productsList.add(new Products(1, "iphone X", 200, 10, "Apple"));
        productsList.add(new Products(2, "S22 Ultra", 250, 20, "Samsung"));
        productsList.add(new Products(3, "Mi 10", 120, 30, "Xiaomi"));
        productsList.add(new Products(4, "Oppo A6", 150, 25, "Oppo"));

    }
    @Override
    public void displayProductsList() {
        for (Products item: productsList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNewProductsList() {
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập số lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập nhà sản xuất: ");
        String production = scanner.nextLine();
        count = 4;
        Products products = new Products(count + 1, name, price, amount, production);
        productsList.add(products);
        count++;
    }


    @Override
    public void searchProductsListByName() {
        System.out.println("Nhập từ cần tìm: ");
        String search = scanner.nextLine();
        for (Products item : productsList) {
            if (item != null && item.getName().contains(search)) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void deleteProductsListById() {
        System.out.println("Nhập vị trí id cần xóa: ");
        int inputId = Integer.parseInt(scanner.nextLine());
//        for (int i = 0; i < productsList.size(); i++) {
//            if(productsList.get(i).getId() == inputId){
//                productsList.remove(i).getId();
//            }else {
//                System.out.println("Không tìm thấy ID cần xoá");
//            }
//        }
            productsList.remove(inputId-1);
        System.out.println("Xoá thành công");
    }

    @Override
    public void updateProductsListById() {
        System.out.println("Nhập vị trí id cần update: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productsList.size(); i++) {
            if(productsList.get(i).getId() == inputId){
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập giá: ");
                double price = Double.parseDouble(scanner.nextLine());
                System.out.println("Nhập số lượng: ");
                int amount = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập nhà sản xuất: ");
                String production = scanner.nextLine();
                productsList.get(i).getId();
                productsList.get(i).setName(name);
                productsList.get(i).setPrice(price);
                productsList.get(i).setAmount(amount);
                productsList.get(i).setProduction(production);
            }

        }


    }
}
