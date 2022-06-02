package case_study.service.Impl;

import case_study.models.booking.Booking;
import case_study.models.facility.Facility;
import case_study.models.facility.Villa;
import case_study.models.person.Customer;
import case_study.service.BookingService;
import case_study.util.BookingComparator;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());
    static List<Customer> customerList = new ArrayList<>();
    static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();

//    static {
//        customerList.add(new Customer(1, "Chien", "20", "Male", "DN", 123, "VIP"));
//        customerList.add(new Customer(2, "Hoang", "19", "Male", "DN", 459, "Gold"));
//        facilityIntegerMap.put(new Villa("1", "Villa 1", 200, 150, 10, "VIP", 15, 2), 0);
//        facilityIntegerMap.put(new Villa("2", "Villa 2", 300, 250, 15, "Gold", 10, 3), 0);
//    }

    public Set<Booking> sendBooking() {
        return bookingSet;
    }

    @Override
    public void addBooking() {
        int id = 1;
        if (!bookingSet.isEmpty()) {
            id = bookingSet.size();
        }
        Customer customer = chooseCustomer();
        Facility facility = chooseFacility();
        System.out.println("Nhập ngày bắt đầu thuê: ");
        String starDate = scanner.nextLine();
        System.out.println("Nhập ngày trả phòng: ");
        String endDate = scanner.nextLine();
        Booking booking = new Booking(id, starDate, endDate, customer, facility);
        bookingSet.add(booking);
        System.out.println("Đã booking thành công");
    }

    @Override
    public void displayListBooking() {
        for (Booking booking : bookingSet) {
            System.out.println(booking.toString());
        }
    }

    public static Customer chooseCustomer() {
        System.out.println("Danh sách khách hàng: ");
        for (Customer customer : customerList) {
            System.out.println(customer.toString());

        }
        System.out.println("Nhâp id khách hàng: ");
        boolean check = true;
        int id = Integer.parseInt(scanner.nextLine());
        while (check) {
            for (Customer customer : customerList) {
                if (id == customer.getId()) {
                    check = false;
                    return customer;
                }

            }
            if (check) {
                System.out.println("bạn đã nhập sai, vui lòng nhập lại id khách hàng: ");
                id = Integer.parseInt(scanner.nextLine());
            }
        }
        return null;

    }

    public static Facility chooseFacility() {
        System.out.println("Danh sách dịch vỵ: ");
        for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
            System.out.println(entry.toString());

        }
        System.out.println("Nhập id dịch vụ: ");
        boolean check = true;
        String id = scanner.nextLine();

        while (check) {
            for (Map.Entry<Facility, Integer> entry : facilityIntegerMap.entrySet()) {
                if (id.equals(entry.getKey().getIdFacility())) {
                    check = false;
                    return entry.getKey();
                }

            }
            if (check) {
                System.out.println("bạn đã nhập sai, vui lòng nhập lại id khách hàng: ");
                id = scanner.nextLine();
            }
        }
        return null;
    }
}
