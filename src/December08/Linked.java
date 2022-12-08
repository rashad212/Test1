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

        LinkedList<Integer> list2 = new LinkedList<>();
        list1.add(4);
        list1.add(5);
        list1.add(6);
        list1.add(7);
        list1.add(8);

        list1.addAll(list2);

        }
    }

