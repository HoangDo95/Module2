package company_management_mvc.util;

import company_management_mvc.model.Person;

import java.util.Comparator;

public class SortSalaryAscendingComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.tienluong() - o2.tienluong() > 0) {
            return -1;
        } else if (o1.tienluong() - o2.tienluong() < 0) {
            return 1;
        } else {
            if (o1.getName().compareTo(o2.getName()) > 0) {
                return 1;
            } else if (o1.getName().compareTo(o2.getName()) < 0) {
                return -1;
            } else {
                return 1;
            }
        }
    }
}
