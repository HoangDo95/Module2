package ss11_stack_queue.bai_tap.demerging;

import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class TestPeople extends People {
    public static void main(String[] args) {
        Queue<People> queueNu = new LinkedList<>();
        Queue<People> queueNam = new LinkedList<>();
        List<People> myPeople = new LinkedList<>();
        People people1 = new People("tí", true, "05/09/1990");
        People people2 = new People("nở", false, "24/10/1992");
        People people3 = new People("thị", false, "08/11/1995");
        People people4 = new People("tèo", true, "15/12/1997");
        myPeople.add(people1);
        myPeople.add(people2);
        myPeople.add(people3);
        myPeople.add(people4);
        for (People item : myPeople) {
            if (item.getGender()) {
                queueNam.add(item);
            } else {
                queueNu.add(item);
            }
        }
        System.out.println("Danh sach nam : " + queueNam);
        System.out.println("Danh sach nu : " + queueNu);
    }
}