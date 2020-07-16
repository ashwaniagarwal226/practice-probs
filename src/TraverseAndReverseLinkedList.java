public class TraverseAndReverseLinkedList {

    /*Traverse and reverse single linked List*/

    public static void main(String... args) {

        SinglyLinkedListNode singlyLinkedListNode4 = new SinglyLinkedListNode(4, null);
        SinglyLinkedListNode singlyLinkedListNode3 = new SinglyLinkedListNode(3, singlyLinkedListNode4);
        SinglyLinkedListNode singlyLinkedListNode2 = new SinglyLinkedListNode(2, singlyLinkedListNode3);
        SinglyLinkedListNode head = new SinglyLinkedListNode(1, singlyLinkedListNode2);
        //traverseList(head);
        traverseList(reverseList(head));
    }

    public static void traverseList(SinglyLinkedListNode head) {
        //SinglyLinkedListNode current = head;

      /*  do {
            System.out.println(ptr.data);
            ptr = ptr.next;
        } while (ptr.next != null);*/

        /*while (current != null) {
            System.out.println(current.data);
            current = current.next;
        }*/

        for(SinglyLinkedListNode current=head ; current!=null ; current=current.next){
            System.out.println(current.data);
        }
    }

    public static SinglyLinkedListNode reverseList(SinglyLinkedListNode head) {
        SinglyLinkedListNode current = head;
        SinglyLinkedListNode reversedListTail = new SinglyLinkedListNode();
        int i = 0;
        while (current != null) {
            if (i == 0) {
                reversedListTail.data = current.data;
                reversedListTail.next = null;
            } else {
                SinglyLinkedListNode newNode = new SinglyLinkedListNode();
                newNode.data=current.data;
                newNode.next=reversedListTail;
                reversedListTail=newNode;

            }
            current = current.next;
            i++;

        }
        return reversedListTail;

    }
}
