package case_study.service.Impl;

import case_study.models.person.Employee;
import case_study.service.EmployeeService;
import case_study.util.ReadAndWriteFile;
import case_study.util.RegexException;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class EmployeeServiceImpl implements EmployeeService {
    public static Scanner scanner = new Scanner(System.in);
    public static List<Employee> employeeList = new ArrayList<>();
    final String PATH = "src/case_study/data/employee.csv";

    @Override
    public void display() {
        List<String[]> list = ReadAndWriteFile.readToFile(PATH);
        employeeList.clear();
        for (String[] item : list) {
            Employee employee = new Employee(Integer.parseInt(item[0]), item[1], item[2], item[3],
                                                        item[4], Integer.parseInt(item[5]), item[6],
                                                        item[7], item[8], Double.parseDouble(item[9]));
            employeeList.add(employee);
        }
        for (Employee item : employeeList) {
            System.out.println(item);
        }
    }

    @Override
    public void addNew() {
        List<String[]> list = ReadAndWriteFile.readToFile(PATH);
        employeeList.clear();

        for (String[] item : list) {
            Employee employee1 = new Employee(Integer.parseInt(item[0]), item[1], item[2], item[3],
                    item[4], Integer.parseInt(item[5]), item[6],
                    item[7], item[8], Double.parseDouble(item[9]));
            employeeList.add(employee1);
        }

        System.out.println("Nhập id: ");
        int id = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập tên: ");
        String name = scanner.nextLine();

        System.out.println("Ngày tháng năm sinh: ");
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

        System.out.println("Nhập email: ");
        String email = scanner.nextLine();

        System.out.println("Trình độ: 1.Trung cấp 2.Cao đẳng 3.Đại học 4.Sau đại học");
        String level = RegexException.choose1();
        switch (level) {
            case "1":
                level = "Trung câp";
                break;
            case "2":
                level = "Cao đẳng";
                break;
            case "3":
                level = "Đại học";
                break;
            case "4":
                level = "Sau đại học";
                break;
        }

        System.out.println("Vị trí làm việc: 1.Lễ tân 2.Phục vụ 3.Quản ly 4.Giám đốc");
        String workingPosition = RegexException.choose1();
        switch (workingPosition) {
            case "1":
                workingPosition = "Lễ tân";
                break;
            case "2":
                workingPosition = "Phục vụ";
                break;
            case "3":
                workingPosition = "Quản lý";
                break;
            case "4":
                workingPosition = "Giám đốc";
                break;
        }

        System.out.println("Nhập tiền lương: ");
        int salary = Integer.parseInt(RegexException.inputTotalPay());

        Employee employee = new Employee(id, name, dayOfBirt, gender, address, phoneNumber, email, level, workingPosition, salary);
        employeeList.add(employee);
        String str = "";
        for (Employee item : employeeList) {
            str += item.getInfo() + "\n";
        }
        ReadAndWriteFile.writeToFile(PATH, str);
        System.out.println("Thêm thành công");
    }

    @Override
    public void edit() {
        List<String[]> list = ReadAndWriteFile.readToFile(PATH);
        employeeList.clear();
        for (String[] item : list) {
            Employee employee1 = new Employee(Integer.parseInt(item[0]), item[1], item[2], item[3],
                    item[4], Integer.parseInt(item[5]), item[6],
                    item[7], item[8], Double.parseDouble(item[9]));
            employeeList.add(employee1);
        }

        System.out.println("Nhập vị trí cần edit: ");
        int inputId = Integer.parseInt(scanner.nextLine());
        boolean flag = false;
        int index = 0;
        for (int i = 0; i < employeeList.size(); i++) {
            if (employeeList.get(i).getId() == inputId) {
                flag = true;
                index = i;
                break;
            }
        }

        if (flag) {
            System.out.println("Nhập tên: ");
            String name = scanner.nextLine();

            System.out.println("Nhập ngày sinh: ");
            String dayOfBirt = RegexException.inputDayOfBirth();

            System.out.println("Giới tính: 1. Nam 2. Nữ");
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

            System.out.println("Nhập email: ");
            String email = scanner.nextLine();

            System.out.println("Trình độ: 1.Trung cấp 2.Cao đẳng 3.Đại học 4.Sau đại học");
            String level = RegexException.choose1();
            switch (level) {
                case "1":
                    level = "Trung câp";
                    break;
                case "2":
                    level = "Cao đẳng";
                    break;
                case "3":
                    level = "Đại học";
                    break;
                case "4":
                    level = "Sau đại học";
                    break;
            }

            System.out.println("Vị trí làm việc: 1.Lễ tân 2.Phục vụ 3.Quản ly 4.Giám đốc");
            String workingPosition = RegexException.choose1();
            switch (workingPosition) {
                case "1":
                    workingPosition = "Lễ tân";
                    break;
                case "2":
                    workingPosition = "Phục vụ";
                    break;
                case "3":
                    workingPosition = "Quản lý";
                    break;
                case "4":
                    workingPosition = "Giám đốc";
                    break;
            }

            System.out.println("Nhập tiền lương: ");
            int salary = Integer.parseInt(RegexException.inputTotalPay());

            employeeList.get(index).setName(name);
            employeeList.get(index).setDayOfBirth(dayOfBirt);
            employeeList.get(index).setGender(gender);
            employeeList.get(index).setAddress(address);
            employeeList.get(index).setPhoneNumber(phoneNumber);
            employeeList.get(index).setEmail(email);
            employeeList.get(index).setLevel(level);
            employeeList.get(index).setWorkingPosition(workingPosition);
            employeeList.get(index).setSalary(salary);

        } else {
            System.out.println("id không có");
        }
        String str = "";
        for (Employee item : employeeList) {
            str += item.getInfo() + "\n";

        }
        ReadAndWriteFile.writeToFile(PATH, str);
    }
}
