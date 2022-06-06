package giai_de.benh_vien.service.Impl;

import giai_de.benh_vien.model.Vip;
import giai_de.benh_vien.service.VipService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class VipServiceImpl implements VipService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Vip> vipList = new ArrayList<>();

    @Override
    public void add() {
        int count;
        int max = 0;
        if (vipList.isEmpty()) {
            count = 001;
        } else {
            for (Vip item : vipList) {
                if (item.getMedicalRecordNumber() > max) {
                    max = item.getMedicalRecordNumber();
                }
            }
            count = max + 1;
        }

        System.out.println("Số mã bệnh án: ");
        String medicalRecordCode = scanner.nextLine();

        System.out.println("Tên bệnh nhân: ");
        String name = scanner.nextLine();

        System.out.println("Ngày vào viện: ");
        String dayIn = scanner.nextLine();

        System.out.println("Ngày ra viện: ");
        String dayOut = scanner.nextLine();

        System.out.println("Lý do nhập viện: ");
        String reason = scanner.nextLine();

        System.out.println("Loại Vip: ");
        String typeVip = typeVip();

        System.out.println("Thời hạn VIP: ");
        String periodVip = periodVip();

        Vip vip = new Vip(count, medicalRecordCode, name, dayIn, dayOut, reason, typeVip, periodVip);
        vipList.add(vip);

    }

    public String typeVip() {
        String choose = null;
        do {
            System.out.println("1.VIP I  2.VIP II  3.VIP III");
            try {
                choose = scanner.nextLine();
                switch (choose) {
                    case "1":
                        return "VIP I";
                    case "2":
                        return "VIP II";
                    case "3":
                        return "VIP III";
                    default:
                        System.out.println("Nhập 1-3");
                        typeVip();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public String periodVip() {
        String choose = null;
        do {
            System.out.println("1.Day  2.Month  3.Year");
            try {
                choose = scanner.nextLine();
                switch (choose) {
                    case "1":
                        return "1 Day";
                    case "2":
                        return "1 Month";
                    case "3":
                        return "1 Year";
                    default:
                        System.out.println("Nhập 1-3");
                        typeVip();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }

    @Override
    public void delete() {
        System.out.println("Nhập mã bệnh án cần xóa: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        int choose = 0;
        boolean check = false;
        for (int i = 0; i < vipList.size(); i++) {
            if (inputId == vipList.get(i).getMedicalRecordNumber()) {
                System.out.println("Bạn muốn xóa: 1.Yes  2.No");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Yes");
                        vipList.remove(i);
                        System.out.println("Delete Done");
                        display();
                        check = true;
                        break;
                    case 2:
                        check = true;
                }

            } else {
                check = false;
            }

        }
        if (check == false) {
            System.out.println("Bệnh án không tồn tại");
        }
    }



    @Override
    public void display() {
        for (Vip item : vipList) {
            System.out.println(item);
        }
    }
}
