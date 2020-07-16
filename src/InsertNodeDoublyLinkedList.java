import java.util.LinkedList;
import java.util.List;

public class InsertNodeDoublyLinkedList {

    /*https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem*/


    /*https://www.hackerrank.com/challenges/insert-a-node-into-a-sorted-doubly-linked-list/problem?h_r=next-challenge&h_v=zen&h_r=next-challenge&h_v=zen*/

    public static void main(String... args) {
        DoublyLinkedListNode head = new DoublyLinkedListNode();
        DoublyLinkedListNode doublyLinkedListNode1 = new DoublyLinkedListNode();
        DoublyLinkedListNode doublyLinkedListNode2 = new DoublyLinkedListNode();
        DoublyLinkedListNode doublyLinkedListNode3 = new DoublyLinkedListNode();

        doublyLinkedListNode3.data = 10;
        doublyLinkedListNode3.prev = doublyLinkedListNode2;
        doublyLinkedListNode3.next = null;
        ////
        doublyLinkedListNode2.data = 4;
        doublyLinkedListNode2.prev = doublyLinkedListNode1;
        doublyLinkedListNode2.next = doublyLinkedListNode3;
        ////
        doublyLinkedListNode1.data = 3;
        doublyLinkedListNode1.prev = head;
        doublyLinkedListNode1.next = doublyLinkedListNode2;
        ////
        head.data = 1;
        head.next = doublyLinkedListNode1;
        head.prev = null;

        sortedInsert(head, 5);
        List e = new LinkedList();
    }


    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {

        for (DoublyLinkedListNode current = head; current != null; current = current.next) {
            System.out.println(current.data);
        }
        return null;
    }


}
