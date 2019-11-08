package linkedlist;

import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {
        ListList<Integer> listList = new ListList<>();
        listList.add(3);
        listList.add(6);
        listList.add(9);
        listList.add(12);
        listList.add(15);
        System.out.println(listList.get(4));
        listList.remove(15);
        System.out.println(listList.get(3));
        ListList<Integer> listList1 = new ListList<>();
        listList1.add(7);
        listList1.remove(7);
        System.out.println(listList1.get(0));
        ListList<Integer> listList2 = new ListList<>();
        listList2.add(4);
        listList2.add(8);
        listList2.add(12);
        listList2.add(2,20);
        System.out.println(listList2.get(3));
    }
}
