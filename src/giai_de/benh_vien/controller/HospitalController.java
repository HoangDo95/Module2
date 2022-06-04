package giai_de.benh_vien.controller;

import giai_de.benh_vien.service.Impl.NormalServiceImpl;
import giai_de.benh_vien.service.Impl.VipServiceImpl;
import giai_de.benh_vien.service.NormalService;
import giai_de.benh_vien.service.VipService;

import java.util.Scanner;

public class HospitalController {
    public static Scanner scanner = new Scanner(System.in);
    public static NormalService normalService = new NormalServiceImpl();
    public static VipService vipService = new VipServiceImpl();


    public static void displayMainMenu(){
        int choose = 0;
        do {
            System.out.println("-------------Chương trình quản lý bệnh nhân-------------------");
            System.out.println("1. Thêm mới");
            System.out.println("2. Xóa");
            System.out.println("3. Xem danh sách");
            System.out.println("4. Thoát");
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Thêm mới: 1.Bệnh nhân thường  2.Bệnh nhân VIP");
                        add();
                        break;
                    case 2:
                        System.out.println("Xóa: 1.Bệnh nhân thường  2.Bệnh nhân VIP");
                        delete();
                        break;
                    case 3:
                        System.out.println("Xem danh sách: 1.Bệnh nhân thường  2.Bệnh nhân VIP");
                        display();
                        break;
                    case 4:
                        System.out.println("4. Thoát");
                        System.exit(0);
                    default:
                        System.err.println("Nhập từ 1- 4");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số");
            }
        } while (true);
    }
    public static void add(){
        int choose =0;
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1. Bệnh nhân thường");
                normalService.add();
                break;
            case 2:
                System.out.println("2. Bệnh nhân Vip");
                vipService.add();
            default:
                System.err.println("Nhập từ 1- 2");
        }
    }
    public static void display(){
        int choose =0;
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1. Bệnh nhân thường");
                normalService.display();
                break;
            case 2:
                System.out.println("2. Bệnh nhân Vip");
                vipService.display();
            default:
                System.err.println("Nhập từ 1- 2");
        }
    }
    public static void delete(){
        int choose =0;
        choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
            case 1:
                System.out.println("1. Bệnh nhân thường");
                normalService.delete();
                break;
            case 2:
                System.out.println("2. Bệnh nhân Vip");
                vipService.delete();
            default:
                System.err.println("Nhập từ 1- 2");
        }
    }

}
