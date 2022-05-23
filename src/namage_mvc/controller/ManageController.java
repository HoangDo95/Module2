package namage_mvc.controller;

import namage_mvc.service.IManageService;
import namage_mvc.service.Ipml.PersonService;

import java.util.Scanner;

public class ManageController {
    public static Scanner scanner = new Scanner(System.in);
    static IManageService manageService = new PersonService();

    public static void managePerson() {
        do {
            System.out.println("1. Theo Array 2. Theo ArrayList 3. Theo LinkedList 4. Sort 5. Exit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    manageService.displayArray();
                    break;
                case 2:
                    manageService.displayArrayList();
                    break;
                case 3:
                    manageService.displayLinkedList();
                    break;
                case 4:
                    System.out.println("1. Tăng dần 2. giảm dần");
                    int choose1 = Integer.parseInt(scanner.nextLine());
                    switch (choose1){
                        case 1:
                            manageService.sortAscending();
                            break;
                        case 2:
                            manageService.sortDecrease();
                            break;
                    }
                    break;
                case 5:
                    System.exit(0);
                case 6:
                    manageService.displayMap();
            }
        } while (true);

    }
}
