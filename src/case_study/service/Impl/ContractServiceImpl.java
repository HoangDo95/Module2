package case_study.service.Impl;

import case_study.controllers.FuramaControllers;
import case_study.models.booking.Booking;
import case_study.models.contract.Contract;
import case_study.models.person.Customer;
import case_study.service.ContractService;
import ss12_map_tree.bai_tap.product_mvc.util.ReadAndWrite;

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
        List<String[]> list = ReadAndWrite.readToFile("src/case_study/data/contract.csv");
        contractList.clear();
        for (String[] item : list) {
            Contract contract;
            contract = new Contract(item[0],item[1],item[2],item[3],item[4]);
            contractList.add(contract);
        }


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
