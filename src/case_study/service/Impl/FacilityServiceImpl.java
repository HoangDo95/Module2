package case_study.service.Impl;

<<<<<<< HEAD
public class FacilityServiceImpl {
=======
import case_study.Models.Facility.Facility;
import case_study.Models.Facility.House;
import case_study.Models.Facility.Room;
import case_study.Models.Facility.Villa;
import case_study.service.IFacilityService;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {
    private static Map<Facility,Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);

    @Override
    public void display() {

        for (Map.Entry<Facility,Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Tên service: "+ element.getKey() +"Số lần thuê: "+ element.getValue());
        }
    }

    @Override
    public void displayMaintain() {

    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhập id: ");
        int idFacility = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String serviceName = scanner.nextLine();
        System.out.println("Diện tích: ");
        int usableArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Giá thuê: ");
        Double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Số người sử dụng: ");
        int maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Loại phòng: ");
        String roomType = scanner.nextLine();
        System.out.println("Diện tích hồ bơi: ");
        int poolArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());
        Villa villa = new Villa(idFacility,serviceName,usableArea,rentalCosts,maxNumberOfPeople,roomType,poolArea,floor);
        facilityIntegerMap.put(villa,0);
        System.out.println("Thêm thành công");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập id: ");
        int idFacility = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String serviceName = scanner.nextLine();
        System.out.println("Diện tích: ");
        int usableArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Giá thuê: ");
        Double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Số người sử dụng: ");
        int maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Loại phòng: ");
        String roomType = scanner.nextLine();
        System.out.println("Số tầng: ");
        int floor = Integer.parseInt(scanner.nextLine());
        House house = new House(idFacility,serviceName,usableArea,rentalCosts,maxNumberOfPeople,roomType,floor);
        facilityIntegerMap.put(house,0);
        System.out.println("Thêm thành công");
    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập id: ");
        int idFacility = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên: ");
        String serviceName = scanner.nextLine();
        System.out.println("Diện tích: ");
        int usableArea = Integer.parseInt(scanner.nextLine());
        System.out.println("Giá thuê: ");
        Double rentalCosts = Double.parseDouble(scanner.nextLine());
        System.out.println("Số người sử dụng: ");
        int maxNumberOfPeople = Integer.parseInt(scanner.nextLine());
        System.out.println("Dịch vụ miễm phí: ");
        String freeService = scanner.nextLine();
        Room room = new Room(idFacility,serviceName,usableArea,rentalCosts,maxNumberOfPeople,freeService);
        facilityIntegerMap.put(room,0);
        System.out.println("Thêm thành công");
    }
>>>>>>> origin/main
}
