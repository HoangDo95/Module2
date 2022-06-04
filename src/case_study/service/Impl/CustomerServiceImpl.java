package case_study.service.Impl;

import case_study.models.person.Customer;
import case_study.service.CustomerService;
import case_study.util.ReadAndWriteFile;
import case_study.util.RegexException;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Customer> customerList = new LinkedList<>();
    final String PATH = "src/case_study/data/customer.csv";

    @Override
    public void display() {
        List<String[]> list = ReadAndWriteFile.readToFile(PATH);
        customerList.clear();
        for (String[] item : list) {
            Customer customer = new Customer(Integer.parseInt(item[0]), item[1], item[2], item[3],
                    item[4], Integer.parseInt(item[5]), item[6]);
            customerList.add(customer);
        }
        for (Customer item : customerList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNew() {
        List<String[]> list = ReadAndWriteFile.readToFile(PATH);
        customerList.clear();
        for (String[] item : list) {
            Customer customer1 = new Customer(Integer.parseInt(item[0]), item[1], item[2], item[3],
                    item[4], Integer.parseInt(item[5]), item[6]);
            customerList.add(customer1);
        }

        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Nhập ngày tháng năm sinh:");
        String dayOfBirt = RegexException.inputDayOfBirth();

        System.out.println("Giới tính: 1.Nam  2.Nữ");
        String gender = RegexException.inputGender();
        switch (gender) {
            case "1":
                gender = "Nam";
                break;
            case "2":
                gender = "Nữ";
                break;
        }
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();

        System.out.println("Nhập số điện thoại: ");
        int phoneNumber = Integer.parseInt(RegexException.phoneNumber());

        System.out.println("Loại khách hàng : 1.Diamond 2.Platinium 3.Gold 4.Silver 5.Member");
        String classify = RegexException.inputClassify();
        switch (classify) {
            case "1":
                classify = "Diamond";
                break;
            case "2":
                classify = "Platinium";
                break;
            case "3":
                classify = "Gold";
                break;
            case "4":
                classify = "Silver";
                break;
            case "5":
                classify = "Member";
                break;
        }

        Customer customer = new Customer(id, name, dayOfBirt, gender, address, phoneNumber, classify);
        customerList.add(customer);
        String str = "";
        for (Customer item : customerList) {
            str += item.getInfo() + "\n";

        }
        ReadAndWriteFile.writeToFile(PATH, str);
        System.out.println("Thêm thành công");
    }

    @Override
    public void edit() {
        List<String[]> list = ReadAndWriteFile.readToFile(PATH);
        customerList.clear();
        for (String[] item : list) {
            Customer customer1 = new Customer(Integer.parseInt(item[0]), item[1], item[2], item[3],
                    item[4], Integer.parseInt(item[5]), item[6]);
            customerList.add(customer1);
        }

        System.out.println("Nhập vị trí cần edit: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == inputId) {
                flag = true;
                index = i;
                break;
            }
        }
        if (flag) {
            System.out.println("Nhập tên: ");
            String name = scanner.nextLine();

            System.out.println("Nhập ngày tháng năm sinh: ");
            String dayOfBirt = RegexException.inputDayOfBirth();

            System.out.println("Giới tính: 1.Nam  2.Nữ");
            String gender = RegexException.inputGender();
            switch (gender) {
                case "1":
                    gender = "Nam";
                    break;
                case "2":
                    gender = "Nữ";
                    break;
            }

            System.out.println("Nhập địa chỉ: ");
            String address = scanner.nextLine();

            System.out.println("Nhập số điện thoại: ");
            int phoneNumber = Integer.parseInt(RegexException.phoneNumber());

            System.out.println("Loại khách hàng: 1.Diamond 2.Platinium 3.Gold 4.Silver 5.Member");
            String classify = RegexException.inputClassify();
            switch (classify) {
                case "1":
                    classify = "Diamond";
                    break;
                case "2":
                    classify = "Platinium";
                    break;
                case "3":
                    classify = "Gold";
                    break;
                case "4":
                    classify = "Silver";
                    break;
                case "5":
                    classify = "Member";
                    break;
            }

            customerList.get(index).setName(name);
            customerList.get(index).setDayOfBirth(dayOfBirt);
            customerList.get(index).setGender(gender);
            customerList.get(index).setAddress(address);
            customerList.get(index).setPhoneNumber(phoneNumber);
            customerList.get(index).setClassify(classify);
        } else {
            System.out.println("id không có");
        }
        String str = "";
        for (Customer item : customerList) {
            str += item.getInfo() + "\n";
        }
        ReadAndWriteFile.writeToFile(PATH, str);
    }
}

