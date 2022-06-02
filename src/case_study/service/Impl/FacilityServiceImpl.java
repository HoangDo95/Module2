package case_study.service.Impl;

import case_study.models.facility.Facility;
import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.service.IFacilityService;

import case_study.util.RegexException;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FacilityServiceImpl implements IFacilityService {

    private static Map<Facility, Integer> facilityIntegerMap = new LinkedHashMap<>();
    private static Scanner scanner = new Scanner(System.in);


    @Override
    public void displayFacility() {
        for (Map.Entry<Facility, Integer> element : facilityIntegerMap.entrySet()) {
            System.out.println("Tên service: " + element.getKey() + "Số lần thuê: " + element.getValue());
        }
    }

    @Override
    public void displayMaintain() {


    }

    @Override
    public void addNewVilla() {
        String idFacility = RegexException.inputIdVilla();
        String serviceName = RegexException.inputName();
        int usableArea = Integer.parseInt(RegexException.inputArea());
        Double rentalCosts = Double.parseDouble(RegexException.inputTotalPay());
        int maxNumberOfPeople = Integer.parseInt(RegexException.inputAmount());
        String roomType = roomType();
        int poolArea = Integer.parseInt(RegexException.inputArea());
        int floor = Integer.parseInt(RegexException.inputFloor());
        Villa villa = new Villa(idFacility, serviceName, usableArea, rentalCosts, maxNumberOfPeople, roomType, poolArea, floor);
        facilityIntegerMap.put(villa, 0);
        System.out.println("Thêm thành công");

    }


    @Override
    public void addNewHouse() {
        String idFacility = RegexException.inputIdHouse();
        String serviceName = RegexException.inputName();
        int usableArea = Integer.parseInt(RegexException.inputArea());
        Double rentalCosts = Double.parseDouble(RegexException.inputTotalPay());
        int maxNumberOfPeople = Integer.parseInt(RegexException.inputAmount());
        String roomType = roomType();
        int floor = Integer.parseInt(RegexException.inputFloor());
        House house = new House(idFacility, serviceName, usableArea, rentalCosts, maxNumberOfPeople, roomType, floor);
        facilityIntegerMap.put(house, 0);
        System.out.println("Thêm thành công");
    }

    @Override
    public void addNewRoom() {
        String idFacility = RegexException.inputIdRoom();
        String serviceName = RegexException.inputName();
        int usableArea = Integer.parseInt(RegexException.inputArea());
        Double rentalCosts = Double.parseDouble(RegexException.inputTotalPay());
        int maxNumberOfPeople = Integer.parseInt(RegexException.inputAmount());
        String freeService = freeService();
        Room room = new Room(idFacility, serviceName, usableArea, rentalCosts, maxNumberOfPeople, freeService);
        facilityIntegerMap.put(room, 0);
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
