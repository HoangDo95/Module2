package namage_mvc.service.Ipml;

import namage_mvc.model.CleaningStaff;
import namage_mvc.model.ManagementStaff;
import namage_mvc.model.Person;
import namage_mvc.model.ProductionStaff;
import namage_mvc.service.IManageService;
import namage_mvc.util.SortSalaryAscendingComparator;
import namage_mvc.util.SortSalaryDecreaseComparator;

import java.util.*;

public class PersonService implements IManageService {
    public static Person[] personList = new Person[100];

    static {
        personList[0] = new ManagementStaff("Một", "1/1/2000", "DN", 200000, 2.3);
        personList[1] = new ProductionStaff("Ba", "3/3/2000", "QN", 100);
        personList[2] = new CleaningStaff("Năm", "5/5/2000", "DN", 30);

    }

    public static List<Person> personAList = new ArrayList<>();

    static {
        personAList.add(new ManagementStaff("Hai", "2/2/2000", "QN", 250000, 2.5));
        personAList.add(new ProductionStaff("Bốn", "4/4/2000", "HCM", 50));
        personAList.add(new CleaningStaff("Sáu", "6/6/2000", "HN", 25));
    }

    public static List<Person> personLList = new LinkedList<>();

    static {
        personLList.add(new ManagementStaff("Bảy", "7/7/2000", "HN", 300000, 2.7));
        personLList.add(new ProductionStaff("Tám", "8/8/2000", "Hue", 70));
        personLList.add(new CleaningStaff("Chín", "9/9/2000", "QB", 20));
    }


    @Override
    public void displayArray() {
        for (Person item : personList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayArrayList() {
        for (Person item : personAList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void displayLinkedList() {
        for (Person item : personLList) {
            if (item != null) {
                System.out.println(item);
            }
        }
    }

    @Override
    public void sortDecrease() {
        Collections.sort(personAList, new SortSalaryDecreaseComparator());
        for (Person item : personAList) {
            System.out.println(item);
        }
    }

    @Override
    public void sortAscending() {
        Collections.sort(personAList, new SortSalaryAscendingComparator());
        for (Person item : personAList) {
            System.out.println(item);
        }
    }
    public static Map<Integer, Person> mapList = new LinkedHashMap<>();
    static {
        mapList.put(123, new ManagementStaff("Bảy", "7/7/2000", "HN", 300000, 2.7));
        mapList.put(456, new ProductionStaff("Tám", "8/8/2000", "Hue", 70));
        mapList.put(789, new CleaningStaff("Chín", "9/9/2000", "QB", 20));
    }
    public void displayMap(){
        Set<Integer> set = mapList.keySet();
        for (Integer item : set) {
            System.out.println(item+" "+mapList.get(item));
        }
    }


}
