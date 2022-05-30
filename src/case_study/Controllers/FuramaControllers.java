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
        int choose = 0;
        do {
            System.out.println("1\tDisplay list employees 2\tAdd new employee 3\tEdit employee 4\tReturn main menu");
            try {
                choose = Integer.parseInt(scanner.nextLine());

                switch (choose) {

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
                    default:
                        System.err.println("Nhập từ 1- 4");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số");
            }
        } while (true);
    }

    public static void customerManagement() {
        int choose = 0;
        do {
            System.out.println("1.\tDisplay list customers 2.\tAdd new customer 3.\tEdit customer 4.\tReturn main menu");
            try {
                choose = Integer.parseInt(scanner.nextLine());
                switch (choose) {
                    case 1:
                        System.out.println("1.\tDisplay list customers");
                        customerService.displayListCustomer();
                        break;
                    case 2:
                        System.out.println("2.\tAdd new customer");
                        customerService.addNewCustomer();
                        break;
                    case 3:
                        System.out.println("3.\tEdit customer");
                        customerService.editCustomer();
                        break;
                    case 4:
                        System.out.println("4\tReturn main menu");
                        displayMainMenu();
                        break;
                    default:
                        System.err.println("Nhập từ 1- 4");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số");
            }
        } while (true);
    }

    public static void facilityManagement() {
        int choose = 0;
        do {
            System.out.println("1\tDisplay list facility 2\tAdd new facility 3\tDisplay list facility maintenance 4\tReturn main menu");
            try {
                choose = Integer.parseInt(scanner.nextLine());


                switch (choose) {
                    case 1:
                        System.out.println("1\tDisplay list facility");
                        facilityService.display();
                        break;
                    case 2:
                        addNewFacility();
                        break;
                    case 3:
                        System.out.println("3\tDisplay list facility maintenance");
                        facilityService.displayMaintain();
                        break;
                    case 4:
                        System.out.println("4\tReturn main menu");
                        displayMainMenu();
                        break;
                    default:
                        System.err.println("Nhập từ 1- 4");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số");
            }
        } while (true);

    }

    public static void addNewFacility() {
        int choose = 0;
        do {
            System.out.println("1\tAdd villa 2\tAdd House 3\tAdd Room 4\tReturn Facility Management");
            try {
                choose = Integer.parseInt(scanner.nextLine());

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
                    default:
                        System.out.println("Nhập từ 1 -4");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số");
            }

        } while (true);

    }

    public static void bookingManagement() {
        int choose = 0;
        System.out.println("1.\tAdd new booking 2.\tDisplay list booking 3.\tCreate new contracts 4.\tDisplay list contracts 5.\tEdit contracts 6.\tReturn main menu");
        try {
            choose = Integer.parseInt(scanner.nextLine());
            switch (choose) {
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
                default:
                    System.err.println("Nhập từ 1- 6");
            }
        } catch (NumberFormatException e) {
            System.err.println("Vui lòng nhập số");
        }
    }

    public static void promotionManagement() {
        System.out.println("1.\tDisplay list customers use service 2.\nDisplay list customers get voucher 3.\tReturn main menu");
        int choose = Integer.parseInt(scanner.nextLine());
        switch (choose) {
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
            default:
                System.err.println("Nhập từ 1- 4");
        }
    }

    public static void displayMainMenu() {
        int choose = 0;
        do {
            System.out.println("-------------Manage-------------------");
            System.out.println("1.\tEmployee Management");
            System.out.println("2.\tCustomer Management");
            System.out.println("3.\tFacility Management ");
            System.out.println("4.\tBooking Management");
            System.out.println("5.\tPromotion Management");
            System.out.println("6.\tExit");
            try {
                choose = Integer.parseInt(scanner.nextLine());
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
                    default:
                        System.err.println("Nhập từ 1- 6");
                }
            } catch (NumberFormatException e) {
                System.err.println("Vui lòng nhập số");
            }
        } while (true);
    }
}
