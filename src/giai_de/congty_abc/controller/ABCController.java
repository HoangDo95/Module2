package giai_de.congty_abc.controller;

import giai_de.congty_abc.service.Impl.ManagementStaffImpl;
import giai_de.congty_abc.service.Impl.ProductionStaffImpl;
import giai_de.congty_abc.service.ManagementStaffService;
import giai_de.congty_abc.service.ProductionStaffService;

import java.util.Scanner;

public class ABCController {
    public static Scanner scanner = new Scanner(System.in);
    public static ManagementStaffService managementStaffService = new ManagementStaffImpl();
    public static ProductionStaffService productionStaffService = new ProductionStaffImpl();

    public static void displayMenu() {
        int choose = 0;
        do {
            System.out.println("-------------Chương trình quản lý công ty ABC-------------------");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách");
            System.out.println("4. Tìm kiếm");
            System.out.println("5. Thoát");
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Thêm mới: 1.Nhân viên quản lý  2.Nhân viến sản xuất");
                        add();
                        break;
                    case 2:
                        System.out.println("Xóa: 1.Nhân viên quản lý  2.Nhân viến sản xuất");
                        delete();
                        break;
                    case 3:
                        System.out.println("Xem danh sách: 1.Nhân viên quản lý  2.Nhân viến sản xuất");
                        display();
                        break;
                    case 4:
                        System.out.println("Tìm kiếm: 1.Nhân viên quản lý  2.Nhân viến sản xuất");
                        find();
                        break;
                    case 5:
                        System.out.println("5. Thoát");
                        System.exit(0);
                    default:
                        System.err.println("Nhập từ 1- 4");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số");
            }
        } while (true);
    }

    public static void add() {
        int choose = 0;
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1. Nhân viên quản lý");
                managementStaffService.add();
                break;
            case 2:
                System.out.println("2. Nhân viên sản xuất");
                productionStaffService.add();
                break;
            default:
                System.err.println("Nhập từ 1- 2");
        }
    }

    public static void display() {
        int choose = 0;
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1. Nhân viên quản lý");
                managementStaffService.display();
                break;
            case 2:
                System.out.println("2. Nhân viên sản xuất");
                productionStaffService.display();
                break;
            default:
                System.err.println("Nhập từ 1- 2");
        }
    }

    public static void delete() {
        int choose = 0;
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1. Nhân viên quản lý");
                managementStaffService.delete();
                break;
            case 2:
                System.out.println("2. Nhân viên sản xuất");
                productionStaffService.delete();
                break;
            default:
                System.err.println("Nhập từ 1- 2");
        }
    }

    public static void find() {
        int choose = 0;
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1. Nhân viên quản lý");
                managementStaffService.find();
                break;
            case 2:
                System.out.println("2. Nhân viên sản xuất");
                productionStaffService.find();
                break;
            default:
                System.err.println("Nhập từ 1- 2");
        }
    }

}


