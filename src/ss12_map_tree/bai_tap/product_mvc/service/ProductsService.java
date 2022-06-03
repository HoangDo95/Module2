package ss12_map_tree.bai_tap.product_mvc.service;

import ss12_map_tree.bai_tap.product_mvc.model.Products;
import ss12_map_tree.bai_tap.product_mvc.util.ReadAndWrite;
import ss12_map_tree.bai_tap.product_mvc.util.SortPriceAscendingComparator;

import java.util.*;

public class ProductsService implements IProductsService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Products> productsList = new LinkedList<>();
    int count;
    final String PATH = "src/ss12_map_tree/bai_tap/product_mvc/data/product.csv";
//    static {
//        productsList.add(new Products(1, "iphone X", 200, 10, "Apple"));
//        productsList.add(new Products(2, "S22 Ultra", 250, 20, "Samsung"));
//        productsList.add(new Products(3, "Mi 10", 120, 30, "Xiaomi"));
//        productsList.add(new Products(4, "Oppo A6", 150, 25, "Oppo"));
//
//    }

    @Override
    public void displayProductsList() {
        List<String[]> list = ReadAndWrite.readToFile(PATH);
        productsList.clear();
        for (String[] item : list) {
            Products products = new Products(Integer.parseInt(item[0]),item[1],Double.parseDouble(item[2]),Integer.parseInt(item[3]),item[4]);
            productsList.add(products);
        }

        for (Products item : productsList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNewProductsList() {
        List<String[]> list = ReadAndWrite.readToFile(PATH);
        productsList.clear();
        for (String[] item : list) {
            Products products = new Products(Integer.parseInt(item[0]),item[1],Double.parseDouble(item[2]),Integer.parseInt(item[3]),item[4]);
            productsList.add(products);
        }

        int max =0;
        if (productsList.isEmpty()) {
            count = 101;
        } else {
            for (Products item : productsList) {
                if (item.getId()>max){
                    max = item.getId();
                }
            }
            count = max+1;
        }

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập giá: ");
        double price = Double.parseDouble(scanner.nextLine());

        System.out.println("Nhập số lượng: ");
        int amount = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập nhà sản xuất: ");
        String production = scanner.nextLine();

        Products products = new Products(count, name, price, amount, production);
        productsList.add(products);

        String str = "";
        for (Products item : productsList) {
            str += item.getId() + "," + item.getName() + "," + item.getPrice()
                    + "," + item.getAmount() + "," + item.getProduction()+"\n";

        }ReadAndWrite.writeToFile(PATH,str);
        System.out.println("done");

    }

    @Override
    public void searchProductsListByName() {
        List<String[] > list = ReadAndWrite.readToFile(PATH);
        productsList.clear();
        for (String[] item : list) {
            Products products = new Products(Integer.parseInt(item[0]),item[1],
                                                Double.parseDouble(item[2]),
                                                Integer.parseInt(item[3]),item[4]);
            productsList.add(products);
        }
        System.out.println("Nhập từ cần tìm: ");
        String search = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < productsList.size(); i++) {
            if(productsList.get(i).getName().contains(search)){
                System.out.println(productsList.get(i));
                check = true;
            }else {
                check = false;
            }

        }if(check == false){
            System.out.println("Không thấy tên cần tìm");
        }
    }


    @Override
    public void deleteProductsListById() {
        List<String[] > list = ReadAndWrite.readToFile(PATH);
        productsList.clear();
        for (String[] item : list) {
            Products products = new Products(Integer.parseInt(item[0]),item[1],
                    Double.parseDouble(item[2]),
                    Integer.parseInt(item[3]),item[4]);
            productsList.add(products);
        }

        System.out.println("Nhập vị trí id cần xóa: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        boolean check = false;
        for (int i = 0; i < productsList.size(); i++) {
            if(inputId == productsList.get(i).getId()){
                productsList.remove(i);
                check = true;
            }else {
                check = false;
            }

        }if(check == false){
            System.out.println("Không tìm thấy id cần xóa");
        }

        System.out.println("Delete Done");

        String str = "";
        for (Products item : productsList) {
            str += item.getId() + "," + item.getName() + "," + item.getPrice()
                    + "," + item.getAmount() + "," + item.getProduction()+"\n";

        }ReadAndWrite.writeToFile(PATH,str);
        displayProductsList();
    }

    @Override
    public void updateProductsListById() {
        System.out.println("Nhập vị trí id cần update: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < productsList.size(); i++) {
            if (productsList.get(i).getId() == inputId) {
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

    public void sortUp() {
        Collections.sort(productsList, new SortPriceAscendingComparator());
        System.out.println("DS");
        for (Products item :
                productsList) {
            System.out.println(item);
        }
    }


    public void sortDescending() {
        Collections.sort(productsList, new Comparator<Products>() {
            @Override
            public int compare(Products o1, Products o2) {
                return (int) (o2.getPrice() - o1.getPrice());
            }
        });
    }
}