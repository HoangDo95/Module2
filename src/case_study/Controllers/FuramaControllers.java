package case_study.Controllers;

import case_study.service.CustomerService;
import case_study.service.EmployeeService;
import case_study.service.IFacilityService;
import case_study.service.Impl.CustomerServiceImpl;
import case_study.service.Impl.EmployeeServiceImpl;
import case_study.service.Impl.FacilityServiceImpl;

import java.util.Scanner;

public class FuramaControllers {

    public static Scanner scanner = new Scanner(System.in);
    public static EmployeeService employeeService = new EmployeeServiceImpl();
    public static CustomerService customerService = new CustomerServiceImpl();
    public static IFacilityService facilityService = new FacilityServiceImpl();

    public static void employeeManagement() {
        do {
        System.out.println("1\tDisplay list employees 2\tAdd new employee 3\tEdit employee 4\tReturn main menu");
        int choose1 = Integer.parseInt(scanner.nextLine());

            switch (choose1) {

                case 1:
                    System.out.println("1\tDisplay list employees");
                    employeeService.displayListEmployees();
                    break;
                case 2:
                    System.out.println("2\tAdd new employee");
                    employeeService.addNewEmployees();
                    break;
                case 3:
                    System.out.println("3\tEdit employee");
                    employeeService.editEmployees();
                    break;
                case 4:
                    System.out.println("4\tReturn main menu");
                    displayMainMenu();
                    break;
            }
        }while (true);
    }

    public static void customerManagement() {
        do{
        System.out.println("1.\tDisplay list customers 2.\tAdd new customer 3.\tEdit customer 4.\tReturn main menu");
        int choose1 = Integer.parseInt(scanner.nextLine());

            switch (choose1) {
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
            }
        }while (true);
    }

    public static void facilityManagement() {
        do {
            System.out.println("1\tDisplay list facility 2\tAdd new facility 3\tDisplay list facility maintenance 4\tReturn main menu");
            int choose3 = Integer.parseInt(scanner.nextLine());
            switch (choose3) {
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
            }
        }while (true);

    }
    public static void addNewFacility(){
        do {
            System.out.println("1\tAdd villa 2\tAdd House 3\tAdd Room 4\tReturn Facility Management");
            int choose = Integer.parseInt(scanner.nextLine());

            switch (choose) {
                case 1:
                    System.out.println("1\tAdd Villa");
                    facilityService.addNewVilla();
                    break;
                case 2:
                    System.out.println("2\tAdd House");
                    facilityService.addNewHouse();
                    break;
                case 3:
                    System.out.println("3\tAdd Room");
                    facilityService.addNewRoom();
                    break;
                case 4:
                    System.out.println("4\tReturn add new facility");
                    facilityManagement();
                    break;
            }
        }while (true);

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

    public static void displayMainMenu(){
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
