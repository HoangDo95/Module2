package case_study.Controllers;

import java.util.Scanner;

public class FuramaControllers {

    public static Scanner scanner = new Scanner(System.in);

    public static void employeeManagement() {
        System.out.println("1\tDisplay list employees 2\tAdd new employee 3\tEdit employee 4\tReturn main menu");
        int choose1 = Integer.parseInt(scanner.nextLine());
        switch (choose1) {
            case 1:
                System.out.println("1\tDisplay list employees");
                break;
            case 2:
                System.out.println("2\tAdd new employee");
                break;
            case 3:
                System.out.println("3\tEdit employee");
                break;
            case 4:
                System.out.println("4\tReturn main menu");
                break;
        }
    }

    public static void customerManagement() {
        System.out.println("1.\tDisplay list customers 2.\tAdd new customer 3.\tEdit customer 4.\tReturn main menu");
        int choose2 = Integer.parseInt(scanner.nextLine());
        switch (choose2) {
            case 1:
                System.out.println("1.\tDisplay list customers");
                break;
            case 2:
                System.out.println("2.\tAdd new customer");
                break;
            case 3:
                System.out.println("3.\tEdit customer");
                break;
            case 4:
                System.out.println("4\tReturn main menu");
                break;
        }
    }

    public static void facilityManagement() {
        System.out.println("1\tDisplay list facility 2\tAdd new facility 3\tDisplay list facility maintenance 4\tReturn main menu");
        int choose3 = Integer.parseInt(scanner.nextLine());
        switch (choose3) {
            case 1:
                System.out.println("1\tDisplay list facility");
                break;
            case 2:
                System.out.println("2\tAdd new facility");
                break;
            case 3:
                System.out.println("3\tDisplay list facility maintenance");
                break;
            case 4:
                System.out.println("4\tReturn main menu");
                break;
        }
    }

    public static void bookingManagement() {
        System.out.println("1.\tAdd new booking 2.\tDisplay list booking 3.\tCreate new constracts 4.\tDisplay list contracts 5.\tEdit contracts 6.\tReturn main menu");
        int choose4 = Integer.parseInt(scanner.nextLine());
        switch (choose4) {
            case 1:
                System.out.println("1\tDisplay list facility");
                break;
            case 2:
                System.out.println("2\tAdd new facility");
                break;
            case 3:
                System.out.println("3\tDisplay list facility maintenance");
                break;
            case 4:
                System.out.println("4\tReturn main menu");
                break;
            case 5:
                System.out.println("5.\tEdit contracts");
                break;
            case 6:
                System.out.println("6.\tReturn main menu");
                break;
        }
    }

    public static void promotionManagement() {
        System.out.println("1.\tDisplay list customers use service 2.\tDisplay list customers get voucher 3.\tReturn main menu");
        int choose5 = Integer.parseInt(scanner.nextLine());
        switch (choose5) {
            case 1:
                System.out.println("1.\tDisplay list customers use service");
                break;
            case 2:
                System.out.println("2.	Display list customers get voucher");
                break;
            case 3:
                System.out.println("4\tReturn main menu");
                break;
        }
    }

    public static void main(String[] args) {
        do {
            System.out.println("-------------Manage-------------------");
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            int choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
                case 1:
                    System.out.println("1.\tEmployee Management");
                    employeeManagement();
                    break;
                case 2:
                    System.out.println("2.\tCustomer Management");
                    customerManagement();
                    break;
                case 3:
                    System.out.println("3.\tFacility Management ");
                    facilityManagement();
                    break;
                case 4:
                    System.out.println("4.\tBooking Management");
                    bookingManagement();
                    break;
                case 5:
                    System.out.println("5.\tPromotion Management");
                    promotionManagement();
                    break;
                case 6:
                    System.out.println("6.\tExit");
                    System.exit(0);
            }
        } while (true);
    }
}
