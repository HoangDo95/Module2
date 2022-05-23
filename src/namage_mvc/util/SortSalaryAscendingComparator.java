package namage_mvc.util;

import namage_mvc.model.Person;

import java.util.Comparator;

public class SortSalaryAscendingComparator implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
            return o1.tienluong() - o2.tienluong();
    }
}
