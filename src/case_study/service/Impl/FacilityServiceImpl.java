package case_study.service.Impl;

import case_study.models.facility.House;
import case_study.models.facility.Room;
import case_study.models.facility.Villa;
import case_study.service.IFacilityService;

import case_study.util.ReadAndWriteFile;
import case_study.util.RegexException;

import java.util.*;

public class FacilityServiceImpl implements IFacilityService {

    private static List<String[]> list = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);
    final String PATH_VILLA = "src/case_study/data/villa.csv";
    final String PATH_HOUSE = "src/case_study/data/house.csv";
    final String PATH_ROOM = "src/case_study/data/room.csv";
    public static Map<Villa, Integer> villaIntegerMap = new LinkedHashMap<>();
    public static Map<House, Integer> houseIntegerMap = new LinkedHashMap<>();
    public static Map<Room, Integer> roomIntegerMap = new LinkedHashMap<>();

    @Override
    public void displayFacility() {
        list = ReadAndWriteFile.readToFile(PATH_VILLA);
        villaIntegerMap.clear();

        for (String[] item : list) {
            Villa villa = new Villa(item[0], item[1], Integer.parseInt(item[2]), Double.parseDouble(item[3]),
                    Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]), Integer.parseInt(item[7]));
            int numUser = Integer.parseInt(item[8]);
            villaIntegerMap.put(villa, numUser);
        }

        list = ReadAndWriteFile.readToFile(PATH_HOUSE);
        houseIntegerMap.clear();
        for (String[] item : list) {
            House house = new House(item[0], item[1], Integer.parseInt(item[2]), Double.parseDouble(item[3]),
                    Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]));
            int numUser = Integer.parseInt(item[7]);
            houseIntegerMap.put(house, numUser);
        }

        list = ReadAndWriteFile.readToFile(PATH_ROOM);
        roomIntegerMap.clear();
        for (String[] item : list) {
            Room room = new Room(item[0], item[1], Integer.parseInt(item[2]), Double.parseDouble(item[3]),
                    Integer.parseInt(item[4]), item[5]);
            int numUser = Integer.parseInt(item[6]);
            roomIntegerMap.put(room, numUser);
        }

        for (Map.Entry<Villa, Integer> element : villaIntegerMap.entrySet()) {
            System.out.println("Tên service: " + element.getKey() + "Số lần thuê: " + element.getValue());
        }

        for (Map.Entry<House, Integer> element : houseIntegerMap.entrySet()) {
            System.out.println("Tên service: " + element.getKey() + "Số lần thuê: " + element.getValue());
        }

        for (Map.Entry<Room, Integer> element : roomIntegerMap.entrySet()) {
            System.out.println("Tên service: " + element.getKey() + "Số lần thuê: " + element.getValue());
        }
    }


    @Override
    public void displayMaintain() {
        list = ReadAndWriteFile.readToFile(PATH_VILLA);
        villaIntegerMap.clear();
        for (String[] item : list) {
            Villa villa = new Villa(item[0], item[1], Integer.parseInt(item[2]), Double.parseDouble(item[3]),
                    Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]), Integer.parseInt(item[7]));
            int numUser = Integer.parseInt(item[8]);
            villaIntegerMap.put(villa, numUser);
        }

        list = ReadAndWriteFile.readToFile(PATH_HOUSE);
        houseIntegerMap.clear();
        for (String[] item : list) {
            House house = new House(item[0], item[1], Integer.parseInt(item[2]), Double.parseDouble(item[3]),
                    Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]));
            int numUser = Integer.parseInt(item[7]);
            houseIntegerMap.put(house, numUser);
        }

        list = ReadAndWriteFile.readToFile(PATH_ROOM);
        roomIntegerMap.clear();
        for (String[] item : list) {
            Room room = new Room(item[0], item[1], Integer.parseInt(item[2]), Double.parseDouble(item[3]),
                    Integer.parseInt(item[4]), item[5]);
            int numUser = Integer.parseInt(item[6]);
            roomIntegerMap.put(room, numUser);
        }

        for (Map.Entry<Villa, Integer> element : villaIntegerMap.entrySet()) {
            if( element.getValue() >= 5 ){
                System.out.println(element.getKey() + "đem bảo trì");
            }
        }

        for (Map.Entry<House, Integer> element : houseIntegerMap.entrySet()) {
            if( element.getValue() >= 5 ){
                System.out.println(element.getKey() + "đem bảo trì");
            }
        }

        for (Map.Entry<Room, Integer> element : roomIntegerMap.entrySet()) {
            if( element.getValue() >= 5 ){
                System.out.println(element.getKey() + "đem bảo trì");
            }
        }


    }

    @Override
    public void addNewVilla() {
        villaIntegerMap.clear();
        list.clear();
        list = ReadAndWriteFile.readToFile(PATH_VILLA);
        for (String[] item : list) {
            Villa villa = new Villa(item[0], item[1], Integer.parseInt(item[2]), Double.parseDouble(item[3]),
                    Integer.parseInt(item[4]), item[5], Integer.parseInt(item[6]), Integer.parseInt(item[7]));
            int numUser = Integer.parseInt(item[8]);
            villaIntegerMap.put(villa, numUser);
        }
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
        villaIntegerMap.put(villa, 0);

        String line = "";
        for (Map.Entry<Villa, Integer> entry : villaIntegerMap.entrySet()) {

            line += entry.getKey().getIdFacility() + "," + entry.getKey().getServiceName() + ","
                    + entry.getKey().getUsableArea() + "," + entry.getKey().getRentalCosts() + ","
                    + entry.getKey().getMaxNumberOfPeople() + "," + entry.getKey().getRoomType() + ","
                    + entry.getKey().getPoolArea() + "," + entry.getKey().getFloor() + "," + entry.getValue() + "\n";
        }
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
        houseIntegerMap.put(house, 0);
        String line = "";
        for (Map.Entry<House, Integer> entry : houseIntegerMap.entrySet()) {

            line += entry.getKey().getIdFacility() + "," + entry.getKey().getServiceName() + ","
                    + entry.getKey().getUsableArea() + "," + entry.getKey().getRentalCosts() + ","
                    + entry.getKey().getMaxNumberOfPeople() + "," + entry.getKey().getRoomType() + ","
                    + entry.getKey().getFloor() + "," + entry.getValue() + "\n";
        }
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
        roomIntegerMap.put(room, 0);
        String line = "";
        for (Map.Entry<Room, Integer> entry : roomIntegerMap.entrySet()) {

            line += entry.getKey().getIdFacility() + "," + entry.getKey().getServiceName() + ","
                    + entry.getKey().getUsableArea() + "," + entry.getKey().getRentalCosts() + ","
                    + entry.getKey().getMaxNumberOfPeople() + "," + entry.getKey().getFreeService() + "," + entry.getValue() + "\n";
        }
        ReadAndWriteFile.writeToFile(PATH_ROOM, line);
        System.out.println("Thêm thành công");
    }

    public String roomType() {
        String choose;
        do {

            System.out.println("1. Presidential 2.Five star 3.Normal");
            try {
                choose = scanner.nextLine();
                switch (choose) {
                    case "1":
                        return "Presidential";
                    case "2":
                        return "Five star";
                    case "3":
                        return "Normal";
                    default:
                        System.out.println("Nhập 1-3");
                        roomType();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }

    public String freeService() {
        String choose;
        do {
            System.out.println("1.Breakfast 2.Lunch 3.Dinner");
            try {
                choose = scanner.nextLine();
                switch (choose) {
                    case "1":
                        return "Breakfast";
                    case "2":
                        return "Lunch";
                    case "3":
                        return "Dinner";
                    default:
                        System.out.println("Nhập 1-3");
                        freeService();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } while (true);
    }
}





