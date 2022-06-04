package giai_de.benh_vien.service.Impl;

import giai_de.benh_vien.model.Normal;
import giai_de.benh_vien.service.NormalService;


import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class NormalServiceImpl implements NormalService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Normal> normalList = new ArrayList<>();

//    static {
//        normalList.add( new Normal(1,"N1","anh","11/11/2000","12/11/2000","thích",1200));
//        normalList.add( new Normal(2,"N2","em","11/12/2000","12/12/2000","thích",1300));
//        normalList.add( new Normal(3,"N3","an","13/11/2000","13/12/2000","thích",1400));
//    }
//
    @Override
    public void add() {
        int count;
        int max = 0;
        if (normalList.isEmpty()) {
            count = 001;
        } else {
            for (Normal item : normalList) {
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

        System.out.println("Chi phí nằm viện: ");
        int cost = Integer.parseInt(scanner.nextLine());

        Normal normal = new Normal(count, medicalRecordCode, name, dayIn, dayOut, reason, cost);
        normalList.add(normal);

    }

    @Override
    public void delete() {
        System.out.println("Nhập mã bệnh án cần xóa: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        int choose = 0;
        boolean check = false;
        for (int i = 0; i < normalList.size(); i++) {
            if(inputId == normalList.get(i).getMedicalRecordNumber()){
                System.out.println("Bạn muốn xóa: 1.Yes  2.No");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose){
                    case 1:
                        System.out.println("Yes");
                        normalList.remove(i);
                        System.out.println("Delete Done");
                        display();
                        check = true;
                    case 2:
                        check = true;
                }

            }else {
                check = false;
            }

        }if(check == false){
            System.out.println("Bệnh án không tồn tại");
        }
    }

    @Override
    public void display() {
        for (Normal item : normalList) {
            System.out.println(item);
        }

    }
}
