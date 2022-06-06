package giai_de.congty_abc.service.Impl;

import case_study.util.ReadAndWriteFile;
import giai_de.congty_abc.model.Production;
import giai_de.congty_abc.service.ProductionStaffService;
import giai_de.congty_abc.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProductionStaffImpl implements ProductionStaffService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Production> productionList = new ArrayList<>();
    final String PATH = "src/giai_de/congty_abc/data/production.csv";


    @Override
    public void add() {
        List<String[]> list = ReadAndWrite.readToFile(PATH);
        productionList.clear();
        for (String[] item : list) {
            Production production = new Production(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    Integer.parseInt(item[5]), Integer.parseInt(item[6]));

            productionList.add(production);
        }
        int count;
        int max = 0;
        if (productionList.isEmpty()) {
            count = 001;
        } else {
            for (Production item : productionList) {
                if (item.getId() > max) {
                    max = item.getId();
                }
            }
            count = max + 1;
        }
        System.out.println("Mã nhân viên sản xuất: ");
        String employeeCode = scanner.nextLine();

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Ngày sinh: ");
        String dayOfBirth = scanner.nextLine();

        System.out.println("Địa chỉ: ");
        String address = scanner.nextLine();

        System.out.println("Số lượng sản phẩm: ");
        int productNumber = Integer.parseInt(scanner.nextLine());

        System.out.println("Giá sản phẩm: ");
        int productFactor = Integer.parseInt(scanner.nextLine());


        Production production = new Production(count, employeeCode, name, dayOfBirth, address, productNumber, productFactor);
        productionList.add(production);

        String str = "";
        for (Production item : productionList) {
            str += item.getInfo() + "\n";
        }
        ReadAndWriteFile.writeToFile(PATH, str);

    }

    @Override
    public void display() {
        List<String[]> list = ReadAndWrite.readToFile(PATH);
        productionList.clear();
        for (String[] item : list) {
            Production production = new Production(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    Integer.parseInt(item[5]), Integer.parseInt(item[6]));

            productionList.add(production);
        }

        for (Production item : productionList) {
            System.out.println(item);
        }
    }

    @Override
    public void delete() {
        List<String[]> list = ReadAndWrite.readToFile(PATH);
        productionList.clear();
        for (String[] item : list) {
            Production production = new Production(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    Integer.parseInt(item[5]), Integer.parseInt(item[6]));

            productionList.add(production);
        }

        System.out.println("Nhập id nhân viên quản lý muốn xóa: ");
        String input = scanner.nextLine();
        int choose = 0;
        int count = 0;
        for (int i = 0; i < productionList.size(); i++) {
            if (productionList.get(i).getEmployeeCode().equals(input)) {
                System.out.println("Bạn muốn xóa: 1.Yes  2.No");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Yes");
                        productionList.remove(i);
                        System.out.println("Delete Done");
                        String str = "";
                        for (Production item : productionList) {
                            str += item.getInfo() + "\n";
                        }
                        ReadAndWriteFile.writeToFile(PATH, str);
                        display();
                        count++;
                        break;
                    case 2:
                        count++;
                        break;
                }
            }
        }
        if (count == 0) {
            System.out.println("Mã nhân viên quản lý không tồn tại");
        }
    }

    @Override
    public void find() {
        List<String[]> list = ReadAndWrite.readToFile(PATH);
        productionList.clear();
        for (String[] item : list) {
            Production production = new Production(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    Integer.parseInt(item[5]), Integer.parseInt(item[6]));

            productionList.add(production);
        }
        System.out.println("Nhập từ cần tìm: ");
        String search = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < productionList.size(); i++) {
            if(productionList.get(i).getName().contains(search)){
                System.out.println(productionList.get(i));
                check = true;
            }else {
                check = false;
            }

        }if(check == false){
            System.out.println("Không thấy tên cần tìm");
        }
    }
}
