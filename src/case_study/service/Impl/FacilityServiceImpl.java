package case_study.service.Impl;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.service.IFacilityService;

import case_study.util.ReadAndWriteFile;
import case_study.util.RegexException;

import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);
    final String PATH_VILLA = "src/case_study/data/villa.csv";
    final String PATH_HOUSE = "src/case_study/data/house.csv";
    final String PATH_ROOM = "src/case_study/data/room.csv";

    @Override
    public void displayFacility() {
        List<String[]> list = ReadAndWriteFile.readToFile(PATH_VILLA);
        facilityIntegerMap.clear();
        for (String[] item : list) {
            Villa villa = new Villa(item[0], item[1], Integer.parseInt(item[2]), Double.parseDouble(item[3]),
                    Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]), Integer.parseInt(item[7]));
            facilityIntegerMap.put(villa, 0);
        }
        List<String[]> listHouse = ReadAndWriteFile.readToFile(PATH_HOUSE);
        for (String[] item : listHouse) {
            House house = new House(item[0], item[1], Integer.parseInt(item[2]), Double.parseDouble(item[3]),
                    Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]));
            facilityIntegerMap.put(house, 0);
        }
        List<String[]> listRoom = ReadAndWriteFile.readToFile(PATH_ROOM);
        for (String[] item : listRoom) {
            Room room = new Room(item[0], item[1], Integer.parseInt(item[2]), Double.parseDouble(item[3]),
                    Integer.parseInt(item[4]), item[5]);
            facilityIntegerMap.put(room, 0);
        }

        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Tên service: " + element.getKey() + "Số lần thuê: " + element.getValue());
        }
    }


    @Override
    public void displayMaintain() {


    }

    @Override
    public void addNewVilla() {
        System.out.println("Nhập id dịch vụ: ");
        String idFacility = RegexException.inputIdVilla();

        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = RegexException.inputName();

        System.out.println("Nhập diện tích sử dụng: ");
        int usableArea = Integer.parseInt(RegexException.inputArea());

        System.out.println("Nhập tiền thuê: ");
        Double rentalCosts = Double.parseDouble(RegexException.inputTotalPay());

        System.out.println("Nhập số lượng người sử dụng: ");
        int maxNumberOfPeople = Integer.parseInt(RegexException.inputAmount());

        System.out.println("Nhập loại phòng: ");
        String roomType = roomType();

        System.out.println("Nhập diện tích hồ bơi: ");
        int poolArea = Integer.parseInt(RegexException.inputArea());

        System.out.println("Nhập số tầng: ");
        int floor = Integer.parseInt(RegexException.inputFloor());

        Villa villa = new Villa(idFacility, serviceName, usableArea, rentalCosts, maxNumberOfPeople, roomType, poolArea, floor);
        facilityIntegerMap.put(villa, 0);

        String line = villa.getIdFacility() + "," + villa.getServiceName() + ","
                + villa.getUsableArea() + "," + villa.getRentalCosts() + ","
                + villa.getMaxNumberOfPeople() + "," + villa.getRoomType() + ","
                + villa.getPoolArea() + "," + villa.getFloor();
        ReadAndWriteFile.writeToFile(PATH_VILLA, line);
        System.out.println("Thêm thành công");
    }

    @Override
    public void addNewHouse() {
        System.out.println("Nhập id dịch vụ: ");
        String idFacility = RegexException.inputIdHouse();

        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = RegexException.inputName();

        System.out.println("Nhập diện tích sử dụng: ");
        int usableArea = Integer.parseInt(RegexException.inputArea());

        System.out.println("Nhập tiền thuê: ");
        Double rentalCosts = Double.parseDouble(RegexException.inputTotalPay());

        System.out.println("Nhập số lượng người sử dụng: ");
        int maxNumberOfPeople = Integer.parseInt(RegexException.inputAmount());

        System.out.println("Nhập loại phòng: ");
        String roomType = roomType();

        System.out.println("Nhập số tầng: ");
        int floor = Integer.parseInt(RegexException.inputFloor());

        House house = new House(idFacility, serviceName, usableArea, rentalCosts, maxNumberOfPeople, roomType, floor);
        facilityIntegerMap.put(house, 0);
        String line = house.getIdFacility() + "," + house.getServiceName() + ","
                + house.getUsableArea() + "," + house.getRentalCosts() + ","
                + house.getMaxNumberOfPeople() + "," + house.getRoomType() + "," + house.getFloor();
        ReadAndWriteFile.writeToFile(PATH_HOUSE, line);
        System.out.println("Thêm thành công");

    }

    @Override
    public void addNewRoom() {
        System.out.println("Nhập id dịch vụ: ");
        String idFacility = RegexException.inputIdRoom();

        System.out.println("Nhập tên dịch vụ: ");
        String serviceName = RegexException.inputName();

        System.out.println("Nhập diện tích sử dụng: ");
        int usableArea = Integer.parseInt(RegexException.inputArea());

        System.out.println("Nhập tiền thuê: ");
        Double rentalCosts = Double.parseDouble(RegexException.inputTotalPay());

        System.out.println("Nhập số lượng người sử dụng: ");
        int maxNumberOfPeople = Integer.parseInt(RegexException.inputAmount());

        System.out.println("Chọn dịch vụ miễn phí: ");
        String freeService = freeService();

        Room room = new Room(idFacility, serviceName, usableArea, rentalCosts, maxNumberOfPeople, freeService);
        facilityIntegerMap.put(room, 0);
        String line = room.getIdFacility() + "," + room.getServiceName() + ","
                + room.getUsableArea() + "," + room.getRentalCosts() + ","
                + room.getMaxNumberOfPeople() + "," + room.getFreeService();
        ReadAndWriteFile.writeToFile(PATH_ROOM, line);
        System.out.println("Thêm thành công");
    }

    public String roomType() {
        System.out.println("Loại phòng: ");
        System.out.println("1. Presidential 2.Five star 3.Normal");
        String choose = RegexException.choose();
        switch (choose) {
            case "1":
                System.out.println("Presidential");
                break;
            case "2":
                System.out.println("Five star");
                break;
            case "3":
                System.out.println("Normal");
                break;
        }
        return choose;
    }

    public String freeService() {
        System.out.println("Loại dịch vụ miễn phí: ");
        System.out.println("1.Breakfast 2.Lunch 3.Dinner");
        String choose = RegexException.choose();
        switch (choose) {
            case "1":
                choose = "Breakfast";
                System.out.println("Breakfast");
                break;
            case "2":
                choose = "Lunch";
                System.out.println("Lunch");
                break;
            case "3":
                choose = "Dinner";
                System.out.println("Dinner");
                break;
        }
        return choose;
    }
}





