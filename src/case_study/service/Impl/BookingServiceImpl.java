package case_study.service.Impl;

import case_study.models.booking.Booking;
import case_study.service.BookingService;
import case_study.util.BookingComparator;
import ss12_map_tree.bai_tap.product_mvc.util.ReadAndWrite;

import java.util.*;

public class BookingServiceImpl implements BookingService {
    static Scanner scanner = new Scanner(System.in);
    static Set<Booking> bookingSet = new TreeSet<>(new BookingComparator());

    @Override
    public void add() {
        System.out.println("Nhập id booking: ");
        int idBooking = Integer.parseInt(scanner.nextLine());

        System.out.println("Nhập ngày bắt đầu thuê: ");
        String starDate = scanner.nextLine();

        System.out.println("Nhập ngày trả phòng: ");
        String endDate = scanner.nextLine();

        System.out.println("Nhập id customer: ");
        String idCustomer = scanner.nextLine();

        System.out.println("Nhập id customer: ");
        String idFacility = scanner.nextLine();

        Booking booking = new Booking(idBooking, starDate, endDate, idCustomer, idFacility);
        bookingSet.add(booking);
        System.out.println("Đã booking thành công");
    }

    @Override
    public void display() {
        List<String[]> list = ReadAndWrite.readToFile("src/case_study/data/booking.csv");
        bookingSet.clear();
        for (String[] item : list) {
            Booking booking = new Booking(Integer.parseInt(item[0]), item[1], item[2], item[3], item[4]);
            bookingSet.add(booking);
        }
        for (Booking booking : bookingSet) {
            System.out.println(booking);
        }
    }
}
