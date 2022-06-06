package giai_de.congty_abc.service.Impl;

import case_study.util.ReadAndWriteFile;
import giai_de.congty_abc.model.Management;

import giai_de.congty_abc.service.ManagementStaffService;
import giai_de.congty_abc.util.ReadAndWrite;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ManagementStaffImpl implements ManagementStaffService {

    public static Scanner scanner = new Scanner(System.in);
    public static List<Management> managementList = new ArrayList<>();
    final String PATH = "src/giai_de/congty_abc/data/management.csv";

    @Override
    public void add() {
        List<String[]> list = ReadAndWrite.readToFile(PATH);
        managementList.clear();
        for (String[] item : list) {
            Management management = new Management(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    Double.parseDouble(item[5]), Double.parseDouble(item[6]));

            managementList.add(management);
        }
        int count;
        int max = 0;
        if (managementList.isEmpty()) {
            count = 001;
        } else {
            for (Management item : managementList) {
                if (item.getId() > max) {
                    max = item.getId();
                }
            }
            count = max + 1;
        }
        System.out.println("Mã nhân viên quản lý : ");
        String employeeCode = scanner.nextLine();

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Ngày sinh: ");
        String dayOfBirth = scanner.nextLine();

        System.out.println("Địa chỉ: ");
        String address = scanner.nextLine();

        System.out.println("Lương cơ bản: ");
        Double salaryBasic = Double.parseDouble(scanner.nextLine());

        System.out.println("Hệ số lương: ");
        Double salaryFactor = Double.parseDouble(scanner.nextLine());

        Management management = new Management(count, employeeCode, name, dayOfBirth, address, salaryBasic, salaryFactor);
        managementList.add(management);

        String str = "";
        for (Management item : managementList) {
            str += item.getInfo() + "\n";
        }
        ReadAndWriteFile.writeToFile(PATH, str);
    }

    @Override
    public void display() {
        List<String[]> list = ReadAndWrite.readToFile(PATH);
        managementList.clear();
        for (String[] item : list) {
            Management management = new Management(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    Double.parseDouble(item[5]), Double.parseDouble(item[6]));

            managementList.add(management);
        }

        for (Management item : managementList) {
            System.out.println(item);
        }
    }

    @Override
    public void delete() {
        List<String[]> list = ReadAndWrite.readToFile(PATH);
        managementList.clear();
        for (String[] item : list) {
            Management management = new Management(
                    Integer.parseInt(item[0]),
                    item[1],
                    item[2],
                    item[3],
                    item[4],
                    Double.parseDouble(item[5]),
                    Double.parseDouble(item[6]));

            managementList.add(management);
        }
        System.out.println("Nhập id nhân viên quản lý muốn xóa: ");
        String inputId = scanner.nextLine();
        int choose = 0;
        int count = 0;
        for (Management item : managementList) {
            if (item.getEmployeeCode().equals(inputId)) {
                System.out.println("Bạn muốn xóa: 1.Yes  2.No");
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("Yes");
                        managementList.remove(item);
                        System.out.println("Delete Done");
                        String str = "";
                        for (Management item1 : managementList) {
                            str += item1.getInfo() + "\n";
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
        managementList.clear();
        for (String[] item : list) {
            Management management = new Management(Integer.parseInt(item[0]),
                    item[1], item[2], item[3], item[4],
                    Double.parseDouble(item[5]), Double.parseDouble(item[6]));

            managementList.add(management);
        }
        System.out.println("Nhập từ cần tìm: ");
        String search = scanner.nextLine();
        boolean check = false;
        for (int i = 0; i < managementList.size(); i++) {
            if (managementList.get(i).getName().contains(search)) {
                System.out.println(managementList.get(i));
                check = true;
            } else {
                check = false;
            }

        }
        if (check == false) {
            System.out.println("Không thấy tên cần tìm");
        }
    }
}

