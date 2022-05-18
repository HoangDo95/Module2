package ss10_dsa_list.bai_tap.e_mylinklist;

public class TestMyLinkedList {
    public static void main(String[] args) {
        MyLinkedList list = new MyLinkedList(1);
        list.add(1, 2);
        list.add(2, "Melinda");
        list.add(3, 4);
        list.add(4, 5);
        list.addFirst(0);
        System.out.println(list.indexOf("Melinda"));
    }
}
