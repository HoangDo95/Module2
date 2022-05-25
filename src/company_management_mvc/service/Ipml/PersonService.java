package company_management_mvc.service.Ipml;

import company_management_mvc.model.CleaningStaff;
import company_management_mvc.model.ManagementStaff;
import company_management_mvc.model.Person;
import company_management_mvc.model.ProductionStaff;
import company_management_mvc.service.IManageService;
import company_management_mvc.util.SortNameComparator;
import company_management_mvc.util.SortSalaryAscendingComparator;

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
    public void sortName() {
        Collections.sort(personLList, new SortNameComparator());
        for (Person item : personLList) {
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
        mapList.put(123, new ManagementStaff("Bảy", "4/7/2000", "HN", 400000, 2.7));
        mapList.put(456, new ProductionStaff("Tám", "28/8/1999", "DN", 77));
        mapList.put(789, new CleaningStaff("Mười", "9/12/1992", "QB", 25));
    }

    public void displayMap() {
        Set<Integer> set = mapList.keySet();
        for (Integer item : set) {
            System.out.println(item + "," + mapList.get(item));
        }
    }

    public boolean checkId(int id) {
        if (mapList.containsKey(id)) {
            /** id đã tồn tại
             */
            return true;
        } else {
            /** id chưa tồn tại
             */
            return false;
        }
    }
}
