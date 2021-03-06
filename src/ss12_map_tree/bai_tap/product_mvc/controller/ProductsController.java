package ss12_map_tree.bai_tap.product_mvc.controller;

import ss12_map_tree.bai_tap.product_mvc.service.IProductsService;
import ss12_map_tree.bai_tap.product_mvc.service.ProductsService;

import java.util.Collections;
import java.util.Scanner;

public class ProductsController {
    public static void menu() {
        Scanner scanner = new Scanner(System.in);
        IProductsService productsService = new ProductsService();
        do {
            System.out.println("----------Product Management----------");
            System.out.println("1. Display list Product");
            System.out.println("2. Add new Product");
            System.out.println("3. Search Product");
            System.out.println("4. Delete Product");
            System.out.println("5. Update Product");
            System.out.println("6. Sort Product");
            System.out.println("7. Exit");
            System.out.println("Choose option: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display list Product");
                    productsService.displayProductsList();
                    break;
                case 2:
                    System.out.println("Add new Product");
                    productsService.addNewProductsList();
                    break;
                case 3:
                    System.out.println("Search Product");
                    productsService.searchProductsListByName();
                    break;
                case 4:
                    System.out.println("Delete Product");
                    productsService.deleteProductsListById();
                    break;
                case 5:
                    System.out.println("Update Product");
                    productsService.updateProductsListById();
                    break;
                case 6:
                    System.out.println("1.SortUp 2.SortDescending");
                    int choose1 = Integer.parseInt(scanner.nextLine());
                    switch (choose1) {
                        case 1:
                            productsService.sortUp();
                            System.out.println("Sort Up Done");
                            break;
                        case 2:
                            productsService.sortDescending();
                            System.out.println("Sort Descending Done");
                            break;
                    }
                    break;
                case 7:
                    System.exit(0);
            }
        } while (true);
    }
}
