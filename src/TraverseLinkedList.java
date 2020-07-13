public class TraverseLinkedList {

    public static void main(String... args) {

        SinglyLinkedListNode singlyLinkedListNode4 = new SinglyLinkedListNode(4, null);
        SinglyLinkedListNode singlyLinkedListNode3 = new SinglyLinkedListNode(3, singlyLinkedListNode4);
        SinglyLinkedListNode singlyLinkedListNode2 = new SinglyLinkedListNode(2, singlyLinkedListNode3);
        SinglyLinkedListNode head = new SinglyLinkedListNode(1, singlyLinkedListNode2);
        traverseList(head);
    }

    public static void traverseList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;

      /*  do {
            System.out.println(ptr.data);
            ptr = ptr.next;
        } while (ptr.next != null);*/

      while (current.next!=null){
          System.out.println(current.data);
          current = current.next;
      }
    }
}
