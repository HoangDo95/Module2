package CRUD.Person;

import java.util.Scanner;

public class Manager {
    public static Person[] person = new Person[100];
    public static Scanner scanner = new Scanner(System.in);
    public static int count;


    public static void displayList() {
        for (Person item : person) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    public static void addNew() {
        System.out.println("1.Teacher 2.Student");
        int choose1 = Integer.parseInt(scanner.nextLine());
        switch (choose1) {
            case 1:
                System.out.println("Nhập id: ");
                int id = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập name: ");
                String name = scanner.nextLine();
                System.out.println("Nhập tuổi: ");
                int age = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính: ");
                String gender = scanner.nextLine();
                System.out.println("Nhập Salary: ");
                Double salary = Double.parseDouble(scanner.nextLine());
                Teacher teacher = new Teacher(id, name, age, gender, salary);
                person[count] = teacher;
                count++;
                displayList();
                break;
            case 2:
                System.out.println("Nhập id: ");
                int id1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập name: ");
                String name1 = scanner.nextLine();
                System.out.println("Nhập tuổi: ");
                int age1 = Integer.parseInt(scanner.nextLine());
                System.out.println("Nhập giới tính: ");
                String gender1 = scanner.nextLine();
                System.out.println("Nhập Point: ");
                Double point = Double.parseDouble(scanner.nextLine());
                Student student = new Student(id1, name1, age1, gender1, point);
                person[count] = student;
                count++;
                displayList();
                break;
        }
    }

    public static void searchPerson() {
        System.out.println("Nhập từ cần tìm: ");
        String search = scanner.nextLine();
        for (Person item : person) {
            if (item != null && item.getName().contains(search)) {
                System.out.println(item);
            }
        }
    }

    public static void deletePerson() {
        System.out.println("Nhập id cần xóa: ");
        int idInput = Integer.parseInt(scanner.nextLine());
        person[idInput] = null;
        for (Person index : person) {
            if (index == null) {
                continue;
            }
            System.out.println(index);
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("-------------Manage teachers and students-------------------");
            System.out.println("1. Display ");
            System.out.println("2. Add new ");
            System.out.println("3. Search ");
            System.out.println("4. Delete ");
            System.out.println("5. Exit");
            System.out.println("Choose option: ");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("Display list ");
                    displayList();
                    break;
                case 2:
                    System.out.println("Add new ");
                    addNew();
                    break;
                case 3:
                    System.out.println("Search ");
                    searchPerson();
                    break;
                case 4:
                    System.out.println("Delete ");
                    deletePerson();
                    break;
                case 5:
                    System.exit(0);

            }
        } while (true);
    }
}
