package December08;

import java.util.LinkedList;

public class Linked {

    public static void main(String[] args) {
        LinkedList<Integer> list1 = new LinkedList<>();
        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);
        list1.add(5);

        LinkedList<Integer> list2 = new LinkedList<>();
        list2.add(3);
        list2.add(4);
        list2.add(5);
        list2.add(8);
        list2.add(5);

        System.out.println(listKesishmeElementleri(list1, list2));
        System.out.println(listKenarElementler(list1, list2));
    }

    public static LinkedList<Integer> listKesishmeElementleri(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> lastList = new LinkedList<>();
        for (int i = 0; i < list1.size(); i++) {
            if (list2.contains(list1.get(i))) {
                lastList.add(list1.get(i));
            }
        }
        lastList.sort(null);
        return lastList;

    }

    public static LinkedList<Integer> listKenarElementler(LinkedList<Integer> list1, LinkedList<Integer> list2) {
        LinkedList<Integer> lastList = new LinkedList<>();

        lastList.addAll(list1);
        lastList.addAll(list2);

        for (int i = 0; i < listKesishmeElementleri(list1, list2).size(); i++) {
            lastList.remove(listKesishmeElementleri(list1, list2).get(i));
            if (lastList.contains(listKesishmeElementleri(list1, list2).get(i))) i = -1;
        }
        lastList.sort(null);
        return lastList;
    }
}

