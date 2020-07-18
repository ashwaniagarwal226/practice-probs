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


    }


    static DoublyLinkedListNode sortedInsert(DoublyLinkedListNode head, int data) {
        /*System.out.println(findIndexOfInsertion(head,data)+1);*/
        DoublyLinkedListNode newNode= new DoublyLinkedListNode();

        return null;
    }

    static DoublyLinkedListNode findIndexOfInsertion(DoublyLinkedListNode head, int data) {

        int index = 0;
        DoublyLinkedListNode current = head;
        while (current != null) {
            if (data > current.data && data < current.next.data) {
                return current;
            }
            current = current.next;
            index++;
        }
        return head;
    }

}
