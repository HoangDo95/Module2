package case_study.Controllers;

import case_study.service.*;
import case_study.service.Impl.*;

import java.util.Scanner;

public class FuramaControllers {

    public static Scanner scanner = new Scanner(System.in);
    public static EmployeeService employeeService = new EmployeeServiceImpl();
    public static CustomerService customerService = new CustomerServiceImpl();
    public static IFacilityService facilityService = new FacilityServiceImpl();
    public static BookingService bookingService = new BookingServiceImpl();
    public static ContractService contractService = new ContractServiceImpl();

    public static void employeeManagement() {
        do {
            System.out.println("1\tDisplay list employees 2\tAdd new employee 3\tEdit employee 4\tReturn main menu");
            int choose1 = Integer.parseInt(scanner.nextLine());
            switch (choose1) {
                case 1:
                    employeeService.displayListEmployees();
                    break;
                case 2:
                    employeeService.addNewEmployees();
                    break;
                case 3:
                    employeeService.editEmployees();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }

    public static void customerManagement() {
        do {
            System.out.println("1.\tDisplay list customers 2.\tAdd new customer 3.\tEdit customer 4.\tReturn main menu");
            int choose1 = Integer.parseInt(scanner.nextLine());

            switch (choose1) {
                case 1:
                    customerService.displayListCustomer();
                    break;
                case 2:
                    customerService.addNewCustomer();
                    break;
                case 3:
                    customerService.editCustomer();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        } while (true);
    }

    public static void facilityManagement() {
        do {
            System.out.println("1\tDisplay list facility 2\tAdd new facility 3\tDisplay list facility maintenance 4\tReturn main menu");
            int choose3 = Integer.parseInt(scanner.nextLine());
            switch (choose3) {
                case 1:
                    facilityService.display();
                    break;
                case 2:
                    addNewFacility();
                    break;
                case 3:
                    facilityService.displayMaintain();
                    break;
                case 4:
                    displayMainMenu();
                    break;
            }
        } while (true);

    }

    public static void addNewFacility() {
        do {
            System.out.println("1\tAdd villa 2\tAdd House 3\tAdd Room 4\tReturn Facility Management");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    facilityService.addNewVilla();
                    break;
                case 2:
                    facilityService.addNewHouse();
                    break;
                case 3:
                    facilityService.addNewRoom();
                    break;
                case 4:
                    facilityManagement();
                    break;
            }
        } while (true);

    }

    public static void bookingManagement() {
        System.out.println("1.\tAdd new booking 2.\tDisplay list booking 3.\tCreate new contracts 4.\tDisplay list contracts 5.\tEdit contracts 6.\tReturn main menu");
        int choose4 = Integer.parseInt(scanner.nextLine());
        switch (choose4) {
            case 1:
                bookingService.addBooking();
                bookingManagement();
                break;
            case 2:
                bookingService.displayListBooking();
                bookingManagement();
                break;
            case 3:
                contractService.createNewContract();
                bookingManagement();
                break;
            case 4:
                contractService.displayListContract();
                bookingManagement();
                break;
            case 5:
                contractService.editContract();
                bookingManagement();
                break;
            case 6:
                displayMainMenu();
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
                displayMainMenu();
                break;
        }
    }

    public static void displayMainMenu() {
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
                    employeeManagement();
                    break;
                case 2:
                    customerManagement();
                    break;
                case 3:
                    facilityManagement();
                    break;
                case 4:
                    bookingManagement();
                    break;
                case 5:
                    promotionManagement();
                    break;
                case 6:
                    System.exit(0);
            }
        } while (true);
    }
}
