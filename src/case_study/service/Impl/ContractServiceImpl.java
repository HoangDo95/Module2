package case_study.service.Impl;

import case_study.Controllers.FuramaControllers;
import case_study.Models.Booking.Booking;
import case_study.Models.Contract.Contract;
import case_study.Models.Peron.Customer;
import case_study.service.ContractService;

import java.util.*;

public class ContractServiceImpl implements ContractService {
    static List<Contract> contractList = new ArrayList<>();
    static Scanner scanner = new Scanner(System.in);
    static Queue<Booking> bookingQueue = new LinkedList<>();
    static Set<Booking> bookingSet = new BookingServiceImpl().sendBooking();

    @Override
    public void createNewContract() {
        for (Booking item : bookingSet) {
            bookingQueue.add(item);
        }
        while (!bookingQueue.isEmpty()) {
            Booking booking = bookingQueue.poll();
            Customer customer = booking.getCustomer();
            System.out.println("Đang tạo hợp đồng cho Booking có thông tin: " + booking);
            System.out.println("Đang tạo hợp đồng cho khách hàng có thông tin: " + customer);
            System.out.println("Nhập id hợp đồng: ");
            String idContract = scanner.nextLine();
            System.out.println("Nhập số tiền trả trước: ");
            String prepay = scanner.nextLine();
            System.out.println("Nhập số chi phí: ");
            String paymentAmount = scanner.nextLine();
            Contract contract = new Contract(idContract, booking, prepay, paymentAmount, customer);
            contractList.add(contract);
            System.out.println("Đã tạo thành công hợp đồng: " + contract);
        }
    }

    @Override
    public void displayListContract() {
        for (Contract item : contractList) {
            System.out.println(item);
        }
    }

    @Override
    public void editContract() {
        while (!contractList.isEmpty()) {
            System.out.println("Nhập id hợp đồng muốn chỉnh sửa: ");
            String inputIdContact = scanner.nextLine();
            for (Contract item : contractList) {
                if (item.getIdContract() == inputIdContact) {
                    System.out.println("Nhập số tiền trả trước: ");
                    String prepay = scanner.nextLine();
                    System.out.println("Nhập số chi phí: ");
                    String paymentAmount = scanner.nextLine();
                    item.setPrepay(prepay);
                    item.setPaymentAmount(paymentAmount);
                    System.out.println("Đã sửa thành công hợp đồng: " + item);
                    FuramaControllers.bookingManagement();
                }
            }
        }
    }
}
