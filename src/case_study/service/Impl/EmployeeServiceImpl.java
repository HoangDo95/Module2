package case_study.service.Impl;

import case_study.Models.Peron.Employee;
import case_study.service.EmployeeService;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Employee> employeeList = new ArrayList<>();

    static {
        employeeList.add(new Employee(1, "Một", "22 / 05 / 1990", "Nam", "DN", 123456789, "abc1@gmail.com", "Trung cấp", "Lễ tân", 5000));
        employeeList.add(new Employee(2, "Hai", "21 / 04 / 1992", "Nữ", "QN", 1111111, "abc2@gmail.com", "Cao đẳng", "Phục vụ", 4000));
        employeeList.add(new Employee(3, "Ba", "10 / 05 / 1995", "Nam", "HCM", 222222, "abc3@gmail.com", "Đại học", "Quản lý", 7000));
        employeeList.add(new Employee(4, "Bốn", "05 / 05 / 1997", "Nữ", "HN", 333333, "abc5@gmail.com", "Sau đại học", "Giám đốc", 10000));
    }

    @Override
    public void displayListEmployees() {
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNewEmployees() {
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
                gender = "Nam";
                System.out.println("Nam");
                break;
            case "2":
                gender = "Nữ";
                System.out.println("Nữ");
                break;
        }
        System.out.println("Nhập địa chỉ: ");
        String address = scanner.nextLine();
        System.out.println("Nhập số điện thoại: ");
        int phoneNumber = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập email: ");
        String email = scanner.nextLine();
        System.out.println("Trình độ: 1.Trung cấp 2.Cao đẳng 3.Đại học 4.Sau đại học");
        String level = scanner.nextLine();
        switch (level) {
            case "1":
                level = "Trung câp";
                System.out.println("Trung câp");
                break;
            case "2":
                level = "Cao đẳng";
                System.out.println("Cao đẳng");
                break;
            case "3":
                level = "Đại học";
                System.out.println("Đại học");
                break;
            case "4":
                level = "Sau đại học";
                System.out.println("Sau đại học");
                break;
        }
        System.out.println("Vị trí làm việc: 1.Lễ tân 2.Phục vụ 3.Quản ly 4.Giám đốc");
        String workingPosition = scanner.nextLine();
        switch (workingPosition) {
            case "1":
                workingPosition = "Lễ tân";
                System.out.println("Lễ tân");
                break;
            case "2":
                workingPosition = "Phục vụ";
                System.out.println("Phục vụ");
                break;
            case "3":
                workingPosition = "Quản lý";
                System.out.println("Quản lý");
                break;
            case "4":
                workingPosition = "Giám đốc";
                System.out.println("Giám đốc");
                break;
        }
        System.out.println("Nhập tiền lương: ");
        int salary = Integer.parseInt(scanner.nextLine());
        Employee employee = new Employee(id, name, dayOfBirt, gender, address, phoneNumber, email, level, workingPosition, salary);
        employeeList.add(employee);
        System.out.println("Thêm thành công");
        displayListEmployees();
    }

    @Override
    public void editEmployees() {
        System.out.println("Nhập vị trí cần edit: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == inputId) {
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
                        gender = "Nam";
                        System.out.println("Nam");
                        break;
                    case "2":
                        gender = "Nữ";
                        System.out.println("Nữ");
                        break;
                }
                System.out.println("Nhập địa chỉ: ");
                String address = scanner.nextLine();
                System.out.println("Nhập số điện thoại: ");
                int phoneNumber = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập email: ");
                String email = scanner.nextLine();
                System.out.println("Trình độ: 1.Trung cấp 2.Cao đẳng 3.Đại học 4.Sau đại học");
                String level = scanner.nextLine();
                switch (level) {
                    case "1":
                        level = "Trung câp";
                        System.out.println("Trung câp");
                        break;
                    case "2":
                        level = "Cao đẳng";
                        System.out.println("Cao đẳng");
                        break;
                    case "3":
                        level = "Đại học";
                        System.out.println("Đại học");
                        break;
                    case "4":
                        level = "Sau đại học";
                        System.out.println("Sau đại học");
                        break;
                }
                System.out.println("Vị trí làm việc: 1.Lễ tân 2.Phục vụ 3.Quản ly 4.Giám đốc");
                String workingPosition = scanner.nextLine();
                switch (workingPosition) {
                    case "1":
                        workingPosition = "Lễ tân";
                        System.out.println("Lễ tân");
                        break;
                    case "2":
                        workingPosition = "Phục vụ";
                        System.out.println("Phục vụ");
                        break;
                    case "3":
                        workingPosition = "Quản lý";
                        System.out.println("Quản lý");
                        break;
                    case "4":
                        workingPosition = "Giám đốc";
                        System.out.println("Giám đốc");
                        break;
                }
                System.out.println("Nhập tiền lương: ");
                int salary = Integer.parseInt(scanner.nextLine());
                employeeList.get(i).setId(id);
                employeeList.get(i).setName(name);
                employeeList.get(i).setDayOfBirth(dayOfBirt);
                employeeList.get(i).setGender(gender);
                employeeList.get(i).setAddress(address);
                employeeList.get(i).setPhoneNumber(phoneNumber);
                employeeList.get(i).setEmail(email);
                employeeList.get(i).setLevel(level);
                employeeList.get(i).setWorkingPosition(workingPosition);
                employeeList.get(i).setSalary(salary);

            }
        }
        System.out.println("Cập nhật thành công");
    }
}


