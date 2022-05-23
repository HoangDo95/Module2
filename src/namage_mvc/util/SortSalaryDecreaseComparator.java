package namage_mvc.util;

import namage_mvc.model.Person;

import java.util.Comparator;

public class SortSalaryDecreaseComparator implements Comparator<Person> {
    @Override
    public int compare(Person o1, Person o2) {
        if (o1.getName().compareTo(o2.getName()) > 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) < 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
