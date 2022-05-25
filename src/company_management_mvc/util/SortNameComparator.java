package company_management_mvc.util;

import student_mvc.model.Person;

import java.util.Comparator;

public class SortNameComparator implements Comparator<company_management_mvc.model.Person> {
    @Override
    public int compare(company_management_mvc.model.Person o1, company_management_mvc.model.Person o2) {
        if (o1.getName().compareTo(o2.getName()) < 0) {
            return 1;
        } else if (o1.getName().compareTo(o2.getName()) > 0) {
            return -1;
        } else {
            return 1;
        }
    }
}
