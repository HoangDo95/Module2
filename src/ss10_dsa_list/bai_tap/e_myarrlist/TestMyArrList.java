package ss10_dsa_list.bai_tap.e_myarrlist;

import java.util.ArrayList;

public class TestMyArrList {

    public static void main(String[] args) {
        ArrayList<Integer> myArrayList = new ArrayList<>();
        myArrayList.add(1);
        myArrayList.add(2);
        myArrayList.add(3);
        myArrayList.add(4);
        myArrayList.remove(2);
        for (int i = 0; i < myArrayList.size(); i++) {
            System.out.println(myArrayList.get(i));
        }
    }
}
