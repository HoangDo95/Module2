package case_study.service.Impl;

import case_study.Models.Peron.Customer;
import case_study.service.CustomerService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CustomerServiceImpl implements CustomerService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Customer> customerList = new ArrayList<>();

    static {
        customerList.add(new Customer(11, "Một", "22 / 5 / 1990", "Nam", "DN", 123456789, "Member"));
        customerList.add(new Customer(12, "Hai", "2 / 7 / 1992", "Nữ", "QN", 123456789, "Silver"));
        customerList.add(new Customer(13, "Ba", "12 / 12 / 1995", "Nam", "HCM", 123456789, "Gold"));
    }

    @Override
    public void displayListCustomer() {
        for (Customer item : customerList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNewCustomer() {
        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();
        System.out.println("Nhập ngày sinh: ");
        String dayOfBirt = scanner.nextLine();
        System.out.println("Giới tính: 1. Nam 2. Nữ");
        String gender = scanner.nextLine();
        switch (gender) {
            case "1":
<<<<<<< HEAD
                System.out.println("Nam");
                break;
            case "2":
=======
                gender = "Nam";
                System.out.println("Nam");
                break;
            case "2":
                gender = "Nữ";
>>>>>>> origin/main
                System.out.println("Nữ");
                break;
        }
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Loại khách hàng : 1.Diamond 2.Platinium 3.Gold 4.Silver 5.Member");
        String type = scanner.nextLine();
        switch (type) {
            case "1":
<<<<<<< HEAD
                System.out.println("Diamond");
                break;
            case "2":
                System.out.println("Platinium");
                break;
            case "3":
                System.out.println("Gold");
                break;
            case "4":
                System.out.println("Silver");
                break;
            case "5":
                System.out.println("Member");
                break;
        }
        Customer customer = new Customer(id, name, dayOfBirt, gender, address, phoneNumber,type);
=======
                type = "Diamond";
                System.out.println("Diamond");
                break;
            case "2":
                type = "Platinium";
                System.out.println("Platinium");
                break;
            case "3":
                type = "Gold";
                System.out.println("Gold");
                break;
            case "4":
                type = "Silver";
                System.out.println("Silver");
                break;
            case "5":
                type = "Member";
                System.out.println("Member");
                break;
        }
        Customer customer = new Customer(id, name, dayOfBirt, gender, address, phoneNumber, type);
>>>>>>> origin/main
        customerList.add(customer);
        System.out.println("Thêm thành công");
        displayListCustomer();

    }

    @Override
    public void editCustomer() {
        System.out.println("Nhập vị trí cần edit: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < customerList.size(); i++) {
            if (customerList.get(i).getId() == inputId) {
                System.out.println("Nhập id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập tên: ");
                String name = scanner.nextLine();
                System.out.println("Nhập ngày sinh: ");
                String dayOfBirt = scanner.nextLine();
                System.out.println("Giới tính: 1. Nam 2. Nữ");
                String gender = scanner.nextLine();
                switch (gender) {
                    case "1":
<<<<<<< HEAD
                        System.out.println("Nam");
                        break;
                    case "2":
=======
                        gender = "Nam";
                        System.out.println("Nam");
                        break;
                    case "2":
                        gender = "Nữ";
>>>>>>> origin/main
                        System.out.println("Nữ");
                        break;
                }
                System.out.println("Nhập địa chỉ: ");
                String address = scanner.nextLine();
                System.out.println("Nhập số điện thoại: ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Loại khách hàng : 1.Diamond 2.Platinium 3.Gold 4.Silver 5.Member");
<<<<<<< HEAD
                String type = scanner.nextLine();
                switch (type) {
                    case "1":
                        System.out.println("Diamond");
                        break;
                    case "2":
                        System.out.println("Platinium");
                        break;
                    case "3":
                        System.out.println("Gold");
                        break;
                    case "4":
                        System.out.println("Silver");
                        break;
                    case "5":
                        System.out.println("Member");
                        break;
                }
            }
            customerList.get(i).getId();
            customerList.get(i).getName();
            customerList.get(i).getDayOfBirth();
            customerList.get(i).getGender();
            customerList.get(i).getAddress();
            customerList.get(i).getPhoneNumber();
            customerList.get(i).getClassify();
            System.out.println("Cập nhật thành công");

        }
=======
                String classify = scanner.nextLine();
                switch (classify) {
                    case "1":
                        classify = "Diamond";
                        System.out.println("Diamond");
                        break;
                    case "2":
                        classify = "Platinium";
                        System.out.println("Platinium");
                        break;
                    case "3":
                        classify = "Gold";
                        System.out.println("Gold");
                        break;
                    case "4":
                        classify = "Silver";
                        System.out.println("Silver");
                        break;
                    case "5":
                        classify = "Member";
                        System.out.println("Member");
                        break;
                }
                customerList.get(i).setId(id);
                customerList.get(i).setName(name);
                customerList.get(i).setDayOfBirth(dayOfBirt);
                customerList.get(i).setGender(gender);
                customerList.get(i).setAddress(address);
                customerList.get(i).setPhoneNumber(phoneNumber);
                customerList.get(i).setClassify(classify);
            }
        }System.out.println("Cập nhật thành công");
>>>>>>> origin/main
    }
}
