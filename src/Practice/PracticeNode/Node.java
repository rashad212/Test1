package Practice.PracticeNode;

import java.util.Iterator;
import java.util.LinkedList;

public class Node {

    public static void main(String[] args) {

        ListNode head = new ListNode(1);
        ListNode nodeB = new ListNode(2);
        ListNode nodeC = new ListNode(3);
        ListNode nodeD = new ListNode(4);
        ListNode nodeE = new ListNode(5);

//        head.next = nodeB;
//        nodeB.next = nodeC;
//        nodeC.next = nodeD;
//        nodeD.next = nodeE;

        LinkedList<Integer> list = new LinkedList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (int i = 0; i < list.size() - 1; i++) {
            head.next = new ListNode();
            head = (ListNode) head.next;
            System.out.println(nodeD.data);
        }


        Iterator itr = new Iterator() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public Object next() {
                return null;
            }
        };

    }
}
